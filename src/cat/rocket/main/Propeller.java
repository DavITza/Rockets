package cat.rocket.main;

public class Propeller {
	
	// Attribute

	private int power;
	
	//Constructor1
	
	public Propeller(int power) {
		this.power = power;
}	
	//Methods

    public int getPower() {
        return power;
    }
	
	@Override
	public String toString() {
		return "" +this.power;
	}


}
