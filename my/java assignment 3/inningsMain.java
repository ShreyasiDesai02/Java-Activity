import java.util.Scanner;

public class inningsMain {
    public static void main(String[] args) {
       
      
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of team :");
		String name = s.nextLine();
        System.out.println("Enter session :");
		String session = s.nextLine();
        System.out.println("Enter runs :");
		int runs = s.nextInt();

        System.out.println("Team Name :"+ name);
        System.out.println("Runs :"+ runs);
       // System.out.println("Session :"+ session);
        if (session.equalsIgnoreCase("First"))
        {
            System.out.println("Need"+(runs+1)+"to win");
        }
        else{
            System.out.println("Match eneded.");
        }
        

    }
}
