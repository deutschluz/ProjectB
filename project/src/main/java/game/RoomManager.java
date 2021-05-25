package game;
import fixtures.Room;

public class RoomManager {
	public Room startingRoom;
	
	public void init() {
		//welcome prompt
		this.welcomeMesg();
		//how should the rooms be initialized
		this.startingRoom= new Room("Living Room",
				" nondescript room with one 1 window and 2 exits",
				" a rectangular box with faded white walls;"
				+"there is 1 window facing east; you are pointed"
				+ " west; in front of you is the kitchen doorway"
				+"\n to the east, or left, is a bedroom door");
		
		Room kitchen= new Room("the Kitchen",
				" a small dirty room with a backdoor and to the left"
				+" a door to another bedroom",
				" this room has yellow walls and a window facing north;"
				+ "the backdoor is white and groans when you close it"
				+ "the bedroom door is brown, but functions as it should");
		
		Room westBedRoom= new Room("West Bedroom",
				" a room with one window and 2 doors",
				" a rectangular box with faded white walls;"
				+"there is 1 window facing west; you are pointed"
				+ " south; in front of you is the bed"
				+"\n to the east, or left, is another bedroom door");
		
		Room eastBedRoom= new Room("East Bedroom",
				" nondescript room with one 1 window and 2 exits",
				" a rectangular box with faded white walls;"
				+"there is 1 window facing east; you are pointed"
				+ " west; in front of you is the bed"
				+"\n to the east, or left, is a bedroom door");
	}

	public Room getStartingRoom() {
		return this.startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	public void welcomeMesg() {
		System.out.println("Welcome to Angel's Home Tour!"
				+"here's your starting point");
	}
	//has to set previous room and get and set new currentRoom
	public String movePlayer(String cmd, Player p) {
		//set previous room
		p.setPrevRoom(p.getCurrentRoom());
		
	}
}
