
    import java.util.Scanner;
public class Exception2 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Number of overs :");
			int over = s.nextInt();
//			int n[] = new int[over];
			int[] runs = new int[over];
			
			
			System.out.println("Number of runs of each over");
			for(int i=0;i<over;i++) {
				System.out.println("over"+(i+1) +":");
				 runs[i] = s.nextInt();
			}
			 
			
			System.out.println("Enter the number of over");
			int number = s.nextInt();
			if(number>=over || number<= over) {
				System.out.println("runs scored in over"+number+":"+runs[over]);
			}
			
			}
		catch(NegativeArraySizeException e) {
				System.out.println(e);
			}
		catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			
		}
		
	}
	
}


