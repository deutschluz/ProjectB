package game;
import fixtures.Room;

public class RoomManager {
	public Room startingRoom;
	public Room[] exits;
	
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
		
		Room kitchen= new Room("Kitchen",
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
		//all rooms created and initialized
		//now put them into a room array
		Room[] rmArray= new Room[4];
		rmArray[0]=startingRoom;
		rmArray[1]=kitchen;
		rmArray[2]=westBedRoom;
		rmArray[3]=eastBedRoom;
		this.setExits(rmArray);
	}
	// create a getter not just for all the exits, 
		//but for a particular exit given a direction:
	public Room[] getExits() {
			return this.exits;
		}
			
	public void setExits(Room[] exits) {
			this.exits=exits;
		}

	
	public Room getStartingRoom() {
		return this.startingRoom;
	}

	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	public void welcomeMesg() {
		System.out.println("Welcome to Angel's Home Tour!"
				+"here's your starting point\n\n");
	}
	//has to set previous room and get and set new currentRoom
	public String movePlayer(String cmd, Player p) {
		//set previous room
		p.setPrevRoom(p.getCurrentRoom());
		//now do nested switch on currentRoom and cmd
		String curRmName=p.getCurrentRoom().getName();
			switch(curRmName) {
				case "Living Room":
						switch(cmd) {	
							case "west":
								p.setCurrentRoom(this.exits[1]);
								return "SUCCESS";
							case "south":
								p.setCurrentRoom(this.exits[3]);
								return "SUCCESS";
							default:
								return "FAILURE";
						}
				case "Kitchen":
					switch(cmd) {
						case "south":
							p.setCurrentRoom(this.exits[2]);
							return "SUCCESS";
						case "east":
							p.setCurrentRoom(this.exits[2]);
							return "SUCCESS";
						default:
							return "FAILURE";
					}
				case "East Bedroom":
					switch(cmd) {
						case "east":
							p.setCurrentRoom(this.exits[3]);
							return "SUCCESS";
						case "north":
							p.setCurrentRoom(this.exits[1]);
							return "SUCCESS";
						default:
							return "FAILURE";
					}
				case "West Bedroom":
					switch(cmd) {
						case "north":
							p.setCurrentRoom(this.exits[0]);
							return "SUCCESS";
						case "west":
							p.setCurrentRoom(this.exits[2]);
							return "SUCCESS";
						default:
							return "FAILURE";
					}
				default:
					return "FAILURE";
			}
	}
}
