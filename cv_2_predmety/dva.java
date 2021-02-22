package druheCviceni;

public class dva implements Predmet{
	private String nazevPredmetu = "BPC2";
	private int pocetBoduPulsemestralka;
	private int pocetBoduZkouska;
	private int pocetBoduProjekt;
	private int pocetBoduCelkem;
	
	public int getPocetBodu() {
		pocetBoduCelkem=pocetBoduPulsemestralka+pocetBoduZkouska+pocetBoduProjekt;
		return pocetBoduCelkem;
	}
	
	public String getNazevPredmetu() {
		return nazevPredmetu;
	}
	
	public void maZapocet() {
		pocetBoduCelkem=pocetBoduPulsemestralka+pocetBoduZkouska+pocetBoduProjekt;
		if(pocetBoduCelkem >= pocetNaZapocet) {
			System.out.println("Splnil pozadavek bodu pro udeleni zapoctu.");
		}else {
			System.out.println("Nesplnil pozadavek bodu pro udeleni zapoctu.");
		}
	}
	
	public boolean setPocetBoduZkouska(int z) {
		if(z <= 50) {
			this.pocetBoduZkouska=z;
			return true;
		}else {
			System.out.println("Špatnì zadané body! Zadej znovu!");
			return false;
		}
	}
	public boolean setPocetBoduPulsemestralka(int pu) {
		if(pu <= 20) {
			this.pocetBoduPulsemestralka=pu;
			return true;
		}else {
			System.out.println("Špatnì zadané body! Zadej znovu!");
			return false;
		}
	}
	public boolean setPocetBoduProjekt(int pr) {
		if(pr <= 30) {
			this.pocetBoduProjekt=pr;
			return true;
		}else {
			System.out.println("Špatnì zadané body! Zadej znovu!");
			return false;
		}
	}

}
