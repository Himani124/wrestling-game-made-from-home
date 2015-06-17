package in.wrestling;

public class Score {
	
	public static int play(Wrestler playerTopCard, Wrestler computerTopCard, int playerChoice) {
		
		switch (playerChoice) {
		
			case 1: 
				System.out.println("Details of the card given to computer are: ");
				System.out.println(computerTopCard.getDetails());
				if (playerTopCard.rank < computerTopCard.rank) {			
					playerTopCard.incrementMatchesWon();
					return 1;
				
				} else {
					computerTopCard.incrementMatchesWon();
					return 2;
				}
				
			case 2: 
				System.out.println("Details of the card given to computer are: ");
				System.out.println(computerTopCard.getDetails());
				if (playerTopCard.height > computerTopCard.height) {			
					playerTopCard.incrementMatchesWon();
					return 1;
				
				} else {
					computerTopCard.incrementMatchesWon();
					return 2;
				}
				
			case 3:
				System.out.println("Details of the card given to computer are: ");
				System.out.println(computerTopCard.getDetails());
				if (playerTopCard.weight > computerTopCard.weight) {			
					playerTopCard.incrementMatchesWon();
					return 1;
					
				} else {
					computerTopCard.incrementMatchesWon();
					return 2;
				}
				
			default: 
				return 10;
		}
	}
	
}
