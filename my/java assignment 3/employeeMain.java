import java.util.Scanner;
public class employeeMain{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = s.nextLine();
        System.out.println("Enter address :");
		String address = s.nextLine();
        System.out.println("Enter mobile :");
		String mobile = s.nextLine();

        System.out.println("Employee Details");
        System.out.println("Name :" + name);
        System.out.println("Address :" + address);
        System.out.println("Mobile :" + mobile);
    }
}