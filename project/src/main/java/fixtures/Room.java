package fixtures;

public class Room extends Fixtures{
	private Room[] exits;

	public Room() {
		super();
	}
	
	
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4]; // size is your choice
	}
	
	// create a getter not just for all the exits, 
	//but for a particular exit given a direction:
	public Room[] getExits() {
		return this.exits;
	}
		
	
	public Room getExit(String direction) {
		switch(direction) {
		case "north":
			return this.exits[1];
		default:
			return null;
		}
	}
	
	

}
