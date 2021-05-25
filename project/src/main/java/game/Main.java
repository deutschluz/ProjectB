package game;
import fixtures.Room;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		RoomManager roomManager = new RoomManager();
		roomManager.init();
		Room startingRoom= roomManager.getStartingRoom();
		Player p1= new Player(startingRoom);
		String inp=" "; //player input
		do {
		//main Game loop
			//print current room
		System.out.println(p1.getCurrentRoom().toString());
			//inform user of available rooms
		UserPrompt("type commands of the form:\n"
				+ "go north/south/east/west\n"
				+ "type 'Quit' to end program");
		   //get User command and translate it
		inp= collectInput();
		if(parse(inp,p1).equals("Quit")){
			inp="Quit";
		}else {
			//get command
			inp=parse(inp,p1);
			//execute player command
			roomManager.movePlayer(inp,p1);
		}
		
		}while (inp != "Quit");
	}
	
	public static void UserPrompt(String mesgToUser) {
		System.out.println(mesgToUser);
	}
	
	public static String collectInput() {
		Scanner sc= new Scanner(System.in);
		String Userin=sc.nextLine();
		return Userin;
	}
	public static String parse(String Input, Player p1) {
		 //expect string of the form "go south"
		String[] inpArr=Input.split(" ");
		String cmd;
		if(inpArr[0].equals("Quit")) {
			return "Quit";
		}
		if(inpArr[0].equals("go")) {
			cmd=inpArr[1];
			return cmd;
		}
	}
}
