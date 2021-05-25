package game;
import fixtures.Room;
public class Player {
	private Room currentRoom;
    private Room prevRoom;
    
	public Room getPrevRoom() {
		return prevRoom;
	}

	public void setPrevRoom(Room prevRoom) {
		this.prevRoom = prevRoom;
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

	public Player(Room currentRoom) {
	    this.prevRoom=null;
		this.currentRoom = currentRoom;
	}
	
	
}
