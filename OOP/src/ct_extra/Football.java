package ct_extra;

public class Football extends Sports{
	public Football(String country, float ranking, int position) {
        super(country, ranking, position);
    }
	
	@Override
	void play() {
		System.out.println("football is a nice game");
	}
}
