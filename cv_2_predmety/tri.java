package druheCviceni;

public class tri implements Predmet{
	
	private String nazevPredmetu = "BPIS";
	private boolean zapocet;
	private int pocetBoduCelkem;

	
	public int getPocetBodu() {
		return pocetBoduCelkem;
	}
	
	public String getNazevPredmetu() {
		return nazevPredmetu;
	}
	
	public void maZapocet() {
		if(zapocet==true) {
			System.out.println("Splnil pozadavek bodu pro udeleni zapoctu.");
		}else {
			System.out.println("Nesplnil pozadavek bodu pro udeleni zapoctu.");
		}
	}
	
	public void setZapocet(boolean moznost) {
		this.zapocet=moznost;
	}

}
