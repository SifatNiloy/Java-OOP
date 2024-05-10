package ct_extra;

public class Rugby extends Sports{
	
	public Rugby(String country, float ranking, int position) {
        super(country, ranking, position);
    }
	
	@Override
	void play() {
		System.out.println("Rugby is a nice game");
	}
}
