public class TwoWheller extends Vehicle{
	public TwoWheller(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        //TODO Auto-generated constructor stub
    }


	private boolean kickStartAvailable;
	
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	
	public void TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		 super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}

	public void displayDetailInfo() {
		System.out.println("---Detail Information---");
		System.out.println("Kick Start Available: "+ kickStartAvailable);
	}
}
