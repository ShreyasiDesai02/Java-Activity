package Assignment1;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the team name: ");
		String Name = sc.nextLine();

        Player player = new Player();
		Team t = new Team(Name, null);

        while(true){
		System.out.println("1.Add Player\r\n "
				+ "2.Delete Player\r\n "
				+ "3.Display Players\r\n "
				+ "4.Exit");
		
		
		System.out.println("Enter the choice:");
		int ch = sc.nextInt(); sc.nextLine();

		
		
        switch (ch) { 
        case 1: 
            System.out.println("Enter the details of player in CSV format: ");
            String details = sc.nextLine();

            player = Player.createPlayer(details);
            if(player!=null){
            t.addPlayerToTeam(player);
            break;
            }
        case 2:
    
            System.out.println("Enter the player name to be deleted: ");
            String name = sc.nextLine();
        
            if(t.removePlayerFromTeam(name)){
            System.out.println("Player successfully deleted");
            }else {
            System.out.println("Player not found in the team");
            }
            break;
    
    
        case 3:
            System.out.println("Player in : "+ Name );
        
            t.displayPlayers();
            break;
        
    
        case 4:
            return;
    
        default:
            System.out.println("Invalid input");
    }

}    
        


}}
