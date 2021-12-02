public class Team {

	private String name;
	private int wins;
	private int losses;
	
	public Team(String name, int wins, int losses) {
		super();
		this.name = name;
		this.wins = wins;
		this.losses = losses;
	}


	public double getWinPercent() {
		double raw = (double)wins/(wins+losses);
		double rounded = Math.round(raw*1000)/1000.0;
		return rounded;
	}
	
	public String toString() {
		return  name + ": " + getWinPercent() + " win percentage";
	}
	
	
}
