package cat.rocket.main;


import java.util.List;
import java.util.ArrayList;

public class Rocket {

    // Attribute

    private int engineNum;
    private String id;
    private List<Propeller> propellers;

    // Constructor
    public Rocket(String id,int engineNum, List<Propeller> propellers){
    	this.engineNum = engineNum;
    	this.id = id;
    	this.propellers = propellers;
    	
    }

    //Methods
    public List<Propeller> getPropellers() {
        return propellers;
    }
    // Cohet Crea propulsors
    Propeller p10 = new Propeller(10);
    Propeller p30 = new Propeller(30);
    Propeller p40 = new Propeller(40);
    Propeller p50 = new Propeller(50);
    Propeller p80 = new Propeller(80);

    // Cohet ensambla propulsors segons nº motors
    List<Propeller> p3 = new ArrayList<>();{
        p3.add(p10);
        p3.add(p30);
        p3.add(p80);
    };
    // idem anterior 6 propulsors
    List<Propeller> p6 = new ArrayList<>();{
	p6.add(p30);
	p6.add(p40);
	p6.add(p50);
	p6.add(p50);
	p6.add(p30);
	p6.add(p10);
    };

    public int getEngineNum() {
        return engineNum;
    }
    
    public String getId () {
            return id;
    }
         
    public Propeller getP10() {
        return p10;
    }

    public Propeller getP30() {
        return p30;
    }

    public Propeller getP40() {
        return p40;
    }

    public Propeller getP50() {
        return p50;
    }

    public Propeller getP80() {
        return p80;
    }

	public List<Propeller> getP3() {
		return p3;
	}

	public List<Propeller> getP6() {
		return p6;
	}

  
}
