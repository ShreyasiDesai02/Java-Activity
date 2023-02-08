import java.util.Scanner;

public class oddsum {
	
	public static void main(String[] args) 
	{
		int number, i, oddSum = 0;
		Scanner sh = new Scanner(System.in);
		
		System.out.println(" Please Enter any Number : ");
		number = sh.nextInt();	
		int temp;
		while(number!=0)
		{
			temp = number%10;
            number /= 10;
            System.out.println(temp);
            if (temp%2!=0) {
                oddSum+=temp;
            }
		}
		System.out.println("\n The Sum of Odd Numbers upto " + "  =  " + oddSum);
	}
}