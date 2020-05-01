package nim;

import java.util.Scanner;

public class Human extends Player {
	private Scanner scan;
	
	public Human(String name,Scanner scan) {
		super(name);
		this.scan = scan;
	}

	@Override
	public int take_marble(int available) {
		int max = available/2;
		String prompt = String.format("Please choose at least one marble but no more then half\n between 1 and %d",max);
		int take = Miscellaneous.Misc.get_user_input_int(prompt, scan, 1,max);
		
		return take;
	}

}
