package cv5;

public abstract class Zbozi {
	private String nazevZbozi;
	private double cenaBezDph;
	static double DPH = 1.21; 
	
	Zbozi(String nazev, double cena){
		this.nazevZbozi=nazev;
		this.cenaBezDph=cena;
	}

	public String getNazevZbozi() {
		return nazevZbozi;
	}

	public void setNazevZbozi(String nazevZbozi) {
		this.nazevZbozi = nazevZbozi;
	}

	public double getCenaBezDph() {
		return cenaBezDph;
	}

	public void setCenaBezDph(float cenaBezDph) {
		this.cenaBezDph = cenaBezDph;
	}
	
	public double getCena() {
		return cenaBezDph*DPH;
	}
	
	abstract String getJednotka();
	
}