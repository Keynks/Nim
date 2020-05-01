package nim;

public class CPU extends Player {
	
	public CPU(String name) {
		super(name);
	}


	@Override
	public int take_marble(int available) {
		int max = available/2;
		int take = Miscellaneous.Misc.generate_random_int(max, 1);
		return take;
		}

}
