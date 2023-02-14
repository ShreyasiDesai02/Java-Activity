import java.util.*;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list1 =new ArrayList<String>();
		ArrayList<String> list2 =new ArrayList<String>();
		
		System.out.println("Enter the top 5 scorers of IPL Season 14");
		for(int i=0;i<5;i++)
		{
			list1.add(sc.nextLine());
		}
		System.out.println("Enter the top 5 scorers of IPL Season 15");
		for(int i=0;i<5;i++)
		{
			list2.add(sc.nextLine());
		}
		
		list1.retainAll(list2);
		System.out.println("Consistent Scorer: ");
		System.out.println(list1);
		
	}

}
