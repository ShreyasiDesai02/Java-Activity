import java.util.Scanner;

public class Employee_Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = s.nextLine();
        System.out.println("Enter the address: ");
        String address = s.nextLine();
        System.out.println("Enter the mobile: ");
        String mobile = s.nextLine();

        employee e1 = new employee();
        e1.setName(name);
		e1.setAddress(address);
		e1.setMobile(mobile);


        System.out.println("Name: "+e1.getName());
        System.out.println("adress : "+e1.getAddress());
        System.out.println("Mobile: "+e1.getMobile());
       
        System.out.println("Verify and Update the details:");
		int temp=0;
		while(temp!=4) {
			System.out.println("Menu \n1. Update Employee name\r\n"
					+ "\r\n"
					+ "2. Update Employee Address\r\n"
					+ "\r\n"
					+ "3. Update Employee mobile\r\n"
					+ "\r\n"
					+ "4. All information correct/Exit");
			
			temp = s.nextInt();
			s.nextLine();
				switch (temp) {
				case 1: {
					System.out.println("Current name is: "+ e1.getName());
					System.out.println("Enter the name: ");
					name = s.nextLine();
					e1.setName(name);
					break;
				}
				case 2: {
					System.out.println("Current address is: "+ e1.getAddress());
					System.out.println("Enter the address: ");
					address = s.nextLine();
					e1.setAddress(address);
					break;
				}
				case 3: {
					System.out.println("Current mobile is: "+ e1.getMobile());
					System.out.println("Enter the mobile number: ");
					mobile = s.nextLine();
					e1.setMobile(mobile);
					break;
				}
				case 4: {
					System.out.println("Name: "+e1.getName());
					System.out.println("Address: "+e1.getAddress());
					System.out.println("Mobile: "+e1.getMobile());
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + temp);
				}
		}

        
        }
    }
