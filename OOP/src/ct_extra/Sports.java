package ct_extra;

public class Sports {
	String country;
	float ranking;
	int position;
	
    public Sports(String country, float ranking, int position) {
        this.country = country;
        this.ranking = ranking;
        this.position = position;
    }
	void play(){
		System.out.println("playing the game...");
	}

	static Sports findMaximum(Sports[] games) {
	    Sports maxGame = games[0];

	    for (int i = 1; i < games.length; i++) {
	        if (games[i].ranking > maxGame.ranking) {
	            maxGame = games[i];
	        }
	    }
	    return maxGame;
	}

}
