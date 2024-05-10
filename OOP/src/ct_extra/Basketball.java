package ct_extra;

public class Basketball extends Sports{
	
	public Basketball(String country, float ranking, int position) {
        super(country, ranking, position);
    }
	
	@Override
	void play() {
		System.out.println("basketball is a nice game");
	}
}
