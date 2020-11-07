
public abstract class Vehicule {
private String numberplate;
private Integer power;
private String make;

// constructeur
	public void vehicule(String numberplate, Integer power, String make) {
		this.setNumberplate(numberplate);
		this.setPower(power);
		this.setMake(make);
	}
//String toString
		
		public String toString() {
			return "numberplate "+ numberplate+" power: "+power+ " make "+make;
			}
		
	

	
	//getters & setters 
	public String getNumberplate() {
		return numberplate;
	}

	public void setNumberplate(String numberplate) {
		this.numberplate = numberplate;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

}
