import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;
public class ExceptionHandling1 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the total runs scored:");
			int run = s.nextInt();
			System.out.println("Entered Total overs faced");
			int overs = s.nextInt();
			float rate;
			rate = run/overs;
			System.out.println( "this is the run rate: "+ rate);
			
			
			}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Match over");
		}
		}
		
	}
	

