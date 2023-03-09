import java.util.*;

public class Player{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of Matches");
        // int n = sc.nextInt();
        // sc.nextLine();
        // TreeSet <String> players  = new TreeSet<String>();
        // for(int i=0;i<n;i++){
        //     System.out.println("Enter player of the match name :");
        //     players.add(sc.nextLine());

        // }
        // System.out.println("Player names :");
        // for (String string : players) {
        //     System.out.println(string);
            
        // }
        // sc.close();
        double wholeno =15;
        for(double divisor= 2; divisor <wholeno; divisor++ ){
            if(wholeno % divisor == 0){
                System.out.println("false");
            }
        }
        
    }
}