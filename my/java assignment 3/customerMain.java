import java.util.Scanner;
public class customerMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the details :");
        String details = s.nextLine();

        String[] words = details.split(",");
           
        System.out.println("name: " + words[0]);
        System.out.println("address: " + words[1]);
        System.out.println("mobile: " + words[2]);
    
}
}
