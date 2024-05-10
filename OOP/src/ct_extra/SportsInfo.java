package ct_extra;

public class SportsInfo {

	public static void main(String[] args) {

		Sports[] games = new Sports[3];

		games[0] = new Football("England", 4.5f, 1);
		games[1] = new Basketball("USA", 4.8f, 1);
		games[2] = new Rugby("New Zealand", 4.7f, 1);

        for (int i = 0; i < games.length; i++) {
            games[i].play();
        }

        Sports maxRankedGame = Sports.findMaximum(games);
        System.out.println("Game with the highest ranking: " + maxRankedGame.country);

	}

}
