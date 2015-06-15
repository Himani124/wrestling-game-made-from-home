package in.wrestling;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Wrestler wrestler1 = new Wrestler(1, "Undertaker", 2, 6.0, 80.0, 44, 12);
		Wrestler wrestler2 = new Wrestler(2, "Batista", 1, 5.11, 84.0, 40, 9);
		Wrestler wrestler3 = new Wrestler(3, "Big Daddy", 6, 5.10, 100.0, 30, 18);
		Wrestler wrestler4 = new Wrestler(4, "HHH", 4, 6.1, 85.0, 55, 15);
		Wrestler wrestler5 = new Wrestler(5, "Punk", 7, 6.1, 69.0, 29, 12);
		Wrestler wrestler6 = new Wrestler(6, "John Cena", 3, 6.1, 76.5, 42, 8);
		Wrestler wrestler7 = new Wrestler(7, "Khali", 5, 6.3, 89.0, 25, 14);
		
		Wrestler myWrestler[] = {wrestler1,wrestler2,wrestler3,wrestler4,wrestler5,wrestler6,wrestler7};
		Wrestler yourWrestler[] = {wrestler1,wrestler2,wrestler3,wrestler4,wrestler5,wrestler6,wrestler7};
		
		for (int ctr=0; ctr<7; ctr++) {
			System.out.print(myWrestler[ctr].toString());
			System.out.println();
		}
		
		try {
		wrestler1.setMatchesWon(44);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Choose any player with ID from 1 to 7: ");
		
	}

}
