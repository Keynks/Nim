package nim;

public abstract class Player implements IPlayer{
	private String name;
	public Player(String name) { // constructor (Need a Human and CPU Class)
		this.name = name;
		
	}
	
	public String getName() { // getter
		return name;
	}
	
}


