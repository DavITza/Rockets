package cat.rocket.main;


import java.util.List;
import java.util.ArrayList;

public class Main {

	// Crea Cohet. Ajunta les parts
	public static void main(String[] args) {
		
		// NO hauria d'estar al Main, hauria d'estar a Rocket !?
		Propeller p10 = new Propeller(10);
	    Propeller p30 = new Propeller(30);
	    Propeller p40 = new Propeller(40);
	    Propeller p50 = new Propeller(50);
	    Propeller p80 = new Propeller(80);
		
		
	 // NO hauria d'estar al Main, hauria d'estar a Rocket ?!
		List<Propeller> p3 = new ArrayList<>();
		{
	        p3.add(p10);
	        p3.add(p30);
	        p3.add(p80);
	    };
	 // NO hauria d'estar al Main, hauria d'estar a Rocket !?
	    List<Propeller> p6 = new ArrayList<>();{
		p6.add(p30);
		p6.add(p40);
		p6.add(p50);
		p6.add(p50);
		p6.add(p30);
		p6.add(p10);
	    };
		
	// Això SI és el Main: Contruir Rocket.
	
		Rocket R1 = new Rocket("32WESSDS", 3, p3);
		Rocket R2 = new Rocket("LDSFJA32", 6, p6);
		
		
		System.out.println(R1.getId()
				+ " " +
				R1.getEngineNum()
				+ " " +
				R1.getP3());
		
		
		System.out.println(R2.getId()
				+ "  " +
				R2.getEngineNum()
				+ " " +
				R2.getP6());
		
		// for(Propeller fire: p3) {
			// System.out.println(fire);
			}
			// NO es pot imprimir objecte p6, o getPropellers <----
	}


