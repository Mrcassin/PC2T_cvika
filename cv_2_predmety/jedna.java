package druheCviceni;

public class jedna implements Predmet{
	private String nazevPredmetu = "BPC1";
	private int pocetBoduCviko;
	private int pocetBoduZkouska;
	private int pocetBoduCelkem;
	
	public int getPocetBodu() {
		pocetBoduCelkem=pocetBoduCviko+pocetBoduZkouska;
		return pocetBoduCelkem;
	}
	
	public String getNazevPredmetu() {
		return nazevPredmetu;
	}
	
	public int getPocetBoduCviko() {
		return pocetBoduCviko;
	}
	
	public void maZapocet() {
		pocetBoduCelkem=pocetBoduCviko+pocetBoduZkouska;
		if(pocetBoduCelkem >= pocetNaZapocet) {
			System.out.println("Splnil pozadavek bodu pro udeleni zapoctu.");
		}else {
			System.out.println("Nesplnil pozadavek bodu pro udeleni zapoctu.");
		}
	}
	
	public boolean setPocetBoduCviko(int c) {
		if((c+pocetBoduCviko) <= 20) {
			this.pocetBoduCviko+=c;
			return true;
		}else {
			System.out.println("Špatnì zadané body! Zadej znovu!");
			return false;
		}
	}
	
	public boolean setPocetBoduZkouska(int z) {
		if(z <= 80) {
			this.pocetBoduZkouska=z;
			return true;
		}else {
			System.out.println("Špatnì zadané body! Zadej znovu!");
			return false;
		}
	}

}
