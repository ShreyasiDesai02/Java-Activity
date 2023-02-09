import java.util.Scanner;
public class Cricketer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		
		int n = s.nextInt();
		if(n<0)
		{
			System.out.println("Invalid Input");
			return;
		}
		int arr[] = new int[n];
		for (int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
			if(arr[i]<0) {
				System.out.println("Inavlid Input");
				return;
				
			}
			}
		
			int score =s.nextInt();
			if(score<0) {
				System.out.println("Inavlid Input");
				return;
				
			}
		for ( int i=1; i<arr.length;i+=2)
		{
			if (arr[i]>score) {
				System.out.println(arr[i-1]);
			}
		}
		}
	}


