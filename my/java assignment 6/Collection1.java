
import java.util.*;
import java.util.Scanner;
import java.util.Set;
public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> list=new ArrayList<String>();
		
		System.out.println("-----Enter the details of player----- ");
		System.out.println("Enter name of the player:");
		String name = s.nextLine();
		
//		System.out.println("Enter the country:");
//		String country = s.nextLine();
		
		System.out.println("Enter the age of the palyer: ");
		String age = s.next();
		s.nextLine();
		
		System.out.println("Enter the country:");
		String country = s.nextLine();
		
		list.add(name);
		list.add(age);
		list.add(country);
		System.out.println("*****Details of player are*****");
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Country: "+ country);
		
		 
		 System.out.println("Enter the skills:");
		 String skills = s.nextLine();
		
		 System.out.println("Enter the position:");
		 int position = s.nextInt();
		 
		 
		 list.set(position,skills);
	
			 System.out.print(list);
			 
		list.remove(age);
		System.out.println(list);
		
	}

}
