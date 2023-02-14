import java.util.*;
import java.util.Collections;

public class Collection2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>();
		
			list.add("Gujarat Titans");
			list.add("Rajasthan Royals");
			list.add("Royal Challengers Bangalore");
			list.add("Lucknow Super Giants");
			list.add("Delhi Capitals");
			System.out.println(list);
			
			System.out.println("Enter swap position");
			int pos = sc.nextInt();
			
			Collections.swap(list,0,pos);
			System.out.println(list);
			
	}
}

