package Example2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Teams you want to add ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList <Team> al = new ArrayList<Team>();
        String name = null;
        long matches = 0;
        for(int i=0;i<n;i++){
            System.out.println("Enter team "+(i+1)+" detail");
            System.out.println("Enter name :");
            name = sc.nextLine();
            System.out.println("Enter number of matches played");
            matches = sc.nextLong();sc.nextLine();
            al.add(new Team(name, matches));
        }
        Comparator c = new Comparator<Team>() {
        public  int compare(Team t1,Team t2){
            if(t1.getMatches()>t2.getMatches()){
                return 1;
            }
            else if (t1.getMatches()<t2.getMatches()){
                return -1;
            }
            else{
                return 0;
            }
        }  
    };
    Collections.sort(al,c);
    for (Team team : al) {
        System.out.println(team);
        
    }
}
}
