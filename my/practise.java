import java.util.Scanner;
public class practise {
    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 innings i1 = new innings();
		
		System.out.println("Enter team name: ");
		String teamname = sc.nextLine();
		System.out.println("Enter session: ");
		String session = sc.nextLine();
		System.out.println("Enter runs: ");
		int runs = sc.nextInt();
		if(runs<0) {
			System.out.println("invalid input");
			return;
		}
			
		
		i1.setTeamname(teamname);
		i1.setInningsname(session);
		i1.setRuns(runs);
		
		//i1.displayInningsDetails();
	}

}

