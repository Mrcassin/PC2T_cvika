package cv5;

public class Naradi extends Zbozi{
	
	private int zarucniDoba;
	
	Naradi(String nazev, double cena, int zarucniDoba) {
		super(nazev, cena);
		this.zarucniDoba=zarucniDoba;
	}
	
	public int getZarucniDoba() {
		return zarucniDoba;
	}

	public void setZarucniDoba(int zarucniDoba) {
		this.zarucniDoba = zarucniDoba;
	}

	@Override
	String getJednotka() {
		return "m�s�c�";
	}
	
	
}
