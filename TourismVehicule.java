
public class TourismVehicule extends Vehicule {
private int doors;
private int seats;


	public TourismVehicule(int doors, int seats ) {
		this.setDoors(doors);
		this.setSeats(seats);
	}
// String to String()
	public String toString() {
		return super.toString() +"doors: "+ doors+" seats: "+seats; 
		
	}

	//getters & setters
	public int getDoors() {
		return doors;
	}


	public void setDoors(int doors) {
		this.doors = doors;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}

}
