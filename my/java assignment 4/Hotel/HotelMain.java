package Hotel;

import java.util.Scanner;

public class HotelMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tarrif=0;
		System.out.println("Hotel Tariff Calculator\r\n"
				+ "\r\n"
				+ "1. Deluxe Room\r\n"
				+ "\r\n"
				+ "2. Deluxe AC Room\r\n"
				+ "\r\n"
				+ "3. Suite AC Room\r\n"
				+ "\r\n"
				+ "Select Room Type:");
		int roomType = s.nextInt();
		
		System.out.println("Hotel Name: ");
		String hotelName = s.next();
		System.out.println("Room Square Feet Area: ");
		int numberOfSqFeet = s.nextInt();
		System.out.println("Room has TV (true/false): ");
		boolean hasTV = s.nextBoolean();
		System.out.println("Room has Wifi (true/false): ");
		boolean hasWifi = s.nextBoolean();
		
		switch (roomType) {
		case 1:
			DeluxeRoom dlxroom1 = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			tarrif = dlxroom1.calculateTariff();
			break;
		case 2:
			DeluxeACRoom dlxACroom1 = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			tarrif = dlxACroom1.calculateTariff();
			break;
		case 3:
			SuiteACRoom sutACroom1 = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			tarrif = sutACroom1.calculateTariff();
			break;
		default:
			System.out.println("Invalid Input!");
			break;
		}
		
		System.out.println("Room Tariff per day is: "+tarrif);
		
		
	}

}