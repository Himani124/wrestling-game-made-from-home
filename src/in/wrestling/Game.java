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
		
		List<Wrestler> playerOneCards = new ArrayList<Wrestler>();
		List<Wrestler> playerTwoCards = new ArrayList<Wrestler>();
		
		for (int index=0; index < wrestlers.size(); index++){
			if(index % 2 == 0) {
				playerOneCards.add(wrestlers.get(index));
			} else {
				playerTwoCards.add(wrestlers.get(index));
			}
		}
		
		/*
		System.out.println("Player one cards are: ");
		for (int i=0; i < playerOneCards.size(); i++) {
			System.out.println(playerOneCards.get(i).toString());
		}
		System.out.println();
		System.out.println("Player two cards are: ");
		for (int i=0; i < playerTwoCards.size(); i++) {
			System.out.println(playerTwoCards.get(i).toString());
		}
		*/
		
		int lastIndexOne = playerOneCards.size() - 1;
		int lastIndexTwo = playerTwoCards.size() - 1;
		System.out.println("Details of the card that is given to you are: ");
		System.out.println(playerOneCards.get(lastIndex).getDetails());
		
		int userChoice = inputProvider.getInt("Enter the attribute you want to play on: \n1. Rank\n2. Height\n3. Weight1");
		System.out.println("You Entered: " + userChoice);
		
		play(playerOneCards.get(lastIndexOne) , playerTwoCards.get(lastIndexTwo), userChoice);
		
		
	}

}
