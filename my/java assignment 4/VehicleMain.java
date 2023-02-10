import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Four Wheeler\r\n"
				+ "\r\n"
				+ "2.Two Wheeler\r\n"
				+ "\r\n"
				+ "Enter Vehicle Type:");
		int choice = sc.nextInt();
		
		System.out.println("Vehicle Make: ");
		String make = sc.next();
		
		System.out.println("Vehicle Number: ");
		String vehicleNumber = sc.next();
		
		System.out.println("Fuel Type:\r\n"
				+ "\r\n"
				+ "1.Petrol\r\n"
				+ "\r\n"
				+ "2.Diesel");
		int fuelTypeChoice = sc.nextInt();
		String fuelType = "";
		if(fuelTypeChoice==1) {
			fuelType = "Petrol";
		}
		else if(fuelTypeChoice==2) {
			fuelType = "Diesel"; 
		}
		
		System.out.println("Fuel Capacity: ");
		int fuelCapacity = sc.nextInt();
		
		System.out.println("Engine CC: ");
		int cc = sc.nextInt();
		
		
		if(choice==1) {
			System.out.println("Audio System: ");
			String audioSystem = sc.next();
			
			System.out.println("Number of Doors:");
			int numberOfDoors = sc.nextInt();
			
			FourWheller fw1 = new FourWheller(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
			
			fw1.displayMake();
			fw1.displayBasicInfo();
			fw1.displayDetailInfo();
			
			
			
		}
		else if(choice==2) {
			System.out.println("Kick Start Available(True/False): ");
			boolean kickStartAvailable = sc.nextBoolean();
			
			TwoWheller tw1 = new TwoWheller(make, vehicleNumber, fuelType, fuelCapacity, cc);
			
			tw1.displayMake();
			tw1.displayBasicInfo();
			tw1.displayDetailInfo();
			
		}
		else {
			System.out.println("Invalid Input!");
		}
			

	}

}