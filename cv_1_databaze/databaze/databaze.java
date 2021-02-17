package databaze;

public class databaze {
	String jmenoOsoby;
	int rokNarozeni;
	double vyseUvazku;
	
	static double maxUvazek = 1;
	
	databaze(String j, int r){
		this.jmenoOsoby = j;
		this.rokNarozeni = r;
	}
	
	
	public String getJmenoOsoby() {
		return jmenoOsoby;
	}

	public int getRokNarozeni() {
		return rokNarozeni;
	}

	public double getVyseUvazku() {
		return vyseUvazku;
	}
	
	static double getMaxUvazek() {
		return maxUvazek;
	}
	
	static boolean setMaxUvazek(double mU) {
		maxUvazek = mU;
		return true;
	}
	
	boolean prictiUvazek(double uvazek) {
		if(this.vyseUvazku + uvazek > this.maxUvazek) {
			System.out.println("Vyse uvazku je jiz na maximalni hodnote, nezle pricist!");
			return false;	
		}
		this.vyseUvazku += uvazek;
		return false;
	}

}
