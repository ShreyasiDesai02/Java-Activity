public class FourWheller extends Vehicle {
	
	public FourWheller(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem,
			int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}




	private String audioSystem;
	private int numberOfDoors;
	
	
	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	
	
	
	public void displayDetailInfo() {
		System.out.println("---Detail Information---");
		System.out.println("Audio System: "+audioSystem);
		System.out.println("Number of Doors: "+numberOfDoors);
	}
}