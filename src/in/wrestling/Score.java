package in.wrestling;

public class Score {
	
	public static int play(Wrestler playerOne, Wrestler playerTwo, int userChoice) {
		
		switch (userChoice) {
		case 1: 
			System.out.println("Details of the player given to computer are: ");
			System.out.println(playerTwo.getDetails());
			if (playerOne.rank < playerTwo.rank) {			
				playerOne.incrementMatchesWon();
				return 1;
				
			} else {
				playerTwo.incrementMatchesWon();
				return 2;
			}
			
		case 2: 
			System.out.println("Details of the player given to computer are: ");
			System.out.println(playerTwo.getDetails());
			if (playerOne.height > playerTwo.height) {			
				playerOne.incrementMatchesWon();
				return 1;
				
			} else {
				playerTwo.incrementMatchesWon();
				return 2;
			}
			
		case 3:
			System.out.println("Details of the player given to computer are: ");
			System.out.println(playerTwo.getDetails());
			if (playerOne.weight > playerTwo.weight) {			
				playerOne.incrementMatchesWon();
				return 1;
				
			} else {
				playerTwo.incrementMatchesWon();
				return 2;
			}
			
		default: 
			return 10;
		}
	}
	
}
