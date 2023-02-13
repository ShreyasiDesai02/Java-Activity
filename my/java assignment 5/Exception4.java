import java.util.Scanner;

class TeamNameNotFound extends Exception {
    public TeamNameNotFound(String message) {
        super(message);
    }
}

public class Exception4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] team = {"Chennai Super Kings",
		                 "Sun Risers",
		                 "Delhi Daredevils",
		                 "Kings XI Punjab",
		                 "Kolkata Knight Riders",
		                 "Mumbai Indians",
		                 "Rajasthan Royals",
		                 "Royal Challengers Bangalore"};
		System.out.println("Enter the expected winner team of IPL Season 10: ");
		String winner = s.nextLine();
		System.out.println("Enter the expected runner Team of IPL Season 10: ");
		String runner = s.nextLine();
		
		
		try
		{
//			System.out.println("Winner"+winner);
//			System.out.println("Runner"+runner);
			for(String i : team)	{
				if(winner!= i && runner != i)
				{
					throw new TeamNameNotFound("Inavild Team Name: Team name not in list.");	
				}
			}
			
		}
		catch(TeamNameNotFound e) {
			System.out.println(e.getMessage());
		}
		
		}
	}


