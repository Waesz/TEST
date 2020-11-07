
public class CommercialVehicule extends Vehicule{

	private int Volume;
	private int charge;
	
	
	public CommercialVehicule(int Volume, int charge) {
		this.Volume= Volume;
		this.charge= charge;
		// TODO Auto-generated constructor stub
	}
	
	//toString
	public String toString() {
		return super.toString() +"Volume: "+ Volume+" charge: "+charge; 
	}

}
