package in.wrestling;
import java.util.ArrayList;
import java.util.List;

public class Wrestler {

	public String name;
	public int rank;
	public double height;
	public double weight;
	private int matchesWon;
	private int matchesLost;
	private int totalMatches;
	
	public Wrestler(String name, int rank, double height, double weight, int matchesWon, int matchesLost) {
		this.name = name;
		this.rank = rank;
		this.height = height;
		this.weight = weight;
		this.matchesWon = matchesWon;
		this.matchesLost = matchesLost;
		this.totalMatches = matchesWon + matchesLost;
	}
	
	public static List<Wrestler> defaultDeck() {
		List<Wrestler> deck = new ArrayList<Wrestler>();
		deck.add(new Wrestler("Undertaker", 2, 6.0, 80.0, 44, 12));
		deck.add(new Wrestler("Batista", 1, 5.11, 84.0, 40, 9));
		deck.add(new Wrestler("Big Show", 6, 5.10, 100.0, 30, 18));
		deck.add(new Wrestler("Triple H", 4, 6.1, 85.0, 55, 15));
		deck.add(new Wrestler("Punk", 7, 6.1, 69.0, 29, 12));
		deck.add(new Wrestler("John Cena", 3, 6.1, 76.5, 42, 8));
		deck.add(new Wrestler("Khali", 5, 6.3, 89.0, 25, 14));
		deck.add(new Wrestler("The Rock", 8, 6.3, 89.0, 25, 14));
		deck.add(new Wrestler("Shawn Michaels", 10, 6.3, 89.0, 25, 14));
		deck.add(new Wrestler("Hulk Hogan", 13, 6.3, 89.0, 25, 14));
		deck.add(new Wrestler("Bret Hart", 9, 6.3, 89.0, 25, 14));
		deck.add(new Wrestler("Randy Orton", 15, 6.3, 89.0, 25, 14));
		deck.add(new Wrestler("Rey Mysterio", 12, 6.3, 89.0, 25, 14));
		deck.add(new Wrestler("Kane", 11, 6.3, 89.0, 25, 14));
		deck.add(new Wrestler("Brock Lesnar", 14, 6.3, 89.0, 25, 14));
		deck.add(new Wrestler("Edge", 16, 6.3, 89.0, 25, 14));
		
		return deck;
	}
	
	public String getDetails() {
		return "Name : " +this.name+ "\nRank : " +this.rank+ "\nHeight : " +this.height+ "\nWeight : " +this.weight+ "\nMatches Won : "+this.matchesWon+"\nMatches Lost : "+this.matchesLost+ "\nTotal Matches Played : " +this.totalMatches;
	}
	
	public String toString() {
		return "Name: " + this.name + " Rank: " + this.rank;
	}
	
	public void setMatchesWon(int wins) throws Exception {
		if(wins < matchesWon) {
			throw new Exception("How can the matches won by player decrease!");
		}
		matchesWon = wins;
		
		totalMatches = matchesWon + matchesLost;
	}
	
	public void incrementMatchesWon() {
		matchesWon++;
		totalMatches++;
	}

	public int getMatchesWon() {
		return matchesWon;
	}
	
	public int getMatchesLost() {
		return matchesLost;
	}
	
	public int getTotalMatches() {
		return totalMatches;
	}
}
