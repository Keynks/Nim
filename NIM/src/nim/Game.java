package nim;

import java.util.Scanner;

public class Game {
	private Player player1,player2;
	private Scanner scan;
	private int pile,min =10,max = 100,marbles_left = 0;
	private int turn;
	
	private boolean game_over = false;
	
	
	public Game(Scanner scan) { // constructor
		this.scan = scan;
		initialize_game();
		
	}
	private void initialize_game() {
		System.out.println(rules());					// Print rules here using the rules method
		pile = Miscellaneous.Misc.generate_random_int(max, min);//randomly generated pile
		System.out.println("There are currently " + pile + " in the pile");
		initialize_human();  // Initialize the player into the game
		initialize_computer(); // Initialize the computer into the game
		play_game();
		
	}
	private void initialize_human() {
		Human p1 = new Human(null, scan);
		
		
	}
	private int take_Human_turn() {
		Scanner sc = new Scanner (System.in);
		System.out.println("How many marbles do you wish to take?\n");
		int take = 0;
		marbles_left =0;
		take = sc.nextInt();
		while(take > pile/2 || take < 0) {
			System.out.println("invalid entry try again");
			take = sc.nextInt();
		}if(take <= pile/2 || take > 0) {
		
		System.out.println();
		System.out.println("You took " + take + " marbles\n" );
		marbles_left = pile - take;
		System.out.println("There are now " +marbles_left + " marbles left in the pile");
		
		}
		return marbles_left;
		
		
		}
		
		
	private void initialize_computer() {
		CPU computer = new CPU(null);
			
	}
	private int take_CPU_Turn() {
		int take = Miscellaneous.Misc.generate_random_int(5, 1);
		marbles_left = 0;
		System.out.println("The Cpu took" +take+ " marbles\n");
		marbles_left = pile - take;
		System.out.println("There are now " +marbles_left+ " left.");
		
		return take;
		
		
		
	}
	private String rules() { // display the rules to the player
		String prompt = "RULES:\nThere are two players. Each Player takes turns removing the marbles from the pile.\n"
				+ "YOU MUST TAKE 1 OR HALF OF THE PILE NO MORE.\n"
				+ "Whoever takes the last marble from the pile wins.\n";
		return prompt;
	}
	
	
	private void play_game() {
		;
		while(pile > 0) {
			take_Human_turn();
			if(pile <= 0) {
				System.out.println("You took the last marble you win");
				return;
			}
			
			
			
		}
		
		
		
		
		
	}
	public void game_Over(){
		
		
	   
	}
	
	
	
	



}
