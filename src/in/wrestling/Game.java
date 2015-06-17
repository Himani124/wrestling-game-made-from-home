package in.wrestling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {
	
	private static InputProvider inputProvider = new InputProvider();

	public static void main(String[] args) {
		
		/*
		try {
		wrestler1.setMatchesWon(44);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
		
		List<Wrestler> wrestlers = Wrestler.defaultDeck();
		
		Collections.shuffle(wrestlers);
		
		List<Wrestler> playerCards = new ArrayList<Wrestler>();
		List<Wrestler> computerCards = new ArrayList<Wrestler>();
		
		for (int index=0; index < wrestlers.size(); index++){
			if(index % 2 == 0) {
				playerCards.add(wrestlers.get(index));
			} else {
				computerCards.add(wrestlers.get(index));
			}
		}
		
		/*
		System.out.println("Player cards are: ");
		for (int i=0; i < playerCards.size(); i++) {
			System.out.println(playerCards.get(i).toString());
		}
		System.out.println();
		System.out.println("Computer cards are: ");
		for (int i=0; i < computerCards.size(); i++) {
			System.out.println(computerCards.get(i).toString());
		}
		*/
		
		do {	
			
			int lastIndexPlayer = playerCards.size() - 1;
			int lastIndexComp = computerCards.size() - 1;
			
			System.out.println("Details of the card given to you are: ");
			System.out.println(playerCards.get(lastIndexPlayer).getDetails());
		
			int playerChoice = inputProvider.getInt("Enter the digit corrosponding to the attribute you want to play with: \n1. Rank\n2. Height\n3. Weight");
		
			int whoWon = Score.play(playerCards.get(lastIndexPlayer) , computerCards.get(lastIndexComp), playerChoice);
		
			if(whoWon == 1) {
				System.out.println("You have won this time.");
				Wrestler tempWrestler = computerCards.remove(lastIndexComp);
				playerCards.add(tempWrestler);
			}
		
			else if(whoWon == 2) {
				System.out.println("Computer won this time.");
				Wrestler tempWrestler = playerCards.remove(lastIndexPlayer);
				computerCards.add(tempWrestler);
			}
		
			else {
				System.out.println("Invalid Choice.");
				continue;
			}
			
		} while ((playerCards.size()!=0) || (computerCards.size()!=0));
		
		System.out.println("This was a great game!");
		if (playerCards.size() == 0) {
			System.out.println("But oops! looks like computer has won!.. Good luck next time");
		}
		
		if (computerCards.size() == 0) {
			System.out.println("Wow! Congratulations! You have defeated the computer. You played Beautifully..");
		}
	}

}
