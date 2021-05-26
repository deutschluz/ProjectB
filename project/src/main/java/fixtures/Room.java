package fixtures;

import java.util.Arrays;

public class Room extends Fixtures{
	

	public Room() {
		super();
	}
	
	
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}



	@Override
	public String toString() {
		return "Room [Name=" + getName() + "\n, ShortDescription=" + getShortDescription()
				+ "\n, LongDescription=" + getLongDescription() + "\n" + "]";
	}
	
	
	
	

}
