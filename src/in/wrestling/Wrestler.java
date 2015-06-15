package in.wrestling;

public class Wrestler {

	public String name;
	public int rank;
	public double height;
	public double weight;
	private int uid;
	private int matchesWon;
	private int matchesLost;
	private int totalMatches;
	
	public Wrestler(int uid, String name, int rank, double height, double weight, int matchesWon, int matchesLost) {
		this.uid = uid;
		this.name = name;
		this.rank = rank;
		this.height = height;
		this.weight = weight;
		this.matchesWon = matchesWon;
		this.matchesLost = matchesLost;
		this.totalMatches = matchesWon + matchesLost;
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

}
