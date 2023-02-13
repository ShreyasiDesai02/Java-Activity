import java.util.Scanner;
class InvalidAgeRange extends Exception {
    public InvalidAgeRange(String message) {
        super(message);
    }
}
    
public class Exception3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the player name:");
		String name = s.nextLine();
		System.out.println("Age of the player: ");
		int age = s.nextInt();
		try{
			if(age<19) {
			throw new InvalidAgeRange("Invalid Age Range: The player must be at least 19 years old.");
		}
		System.out.println(name);
		System.out.println(age);
		
		}	
		catch(InvalidAgeRange e) {
			System.out.println(e.getMessage());
		}
        
	}
}

