package databaze;
import java.util.Scanner;

public class DatabazeOperations {
	
	public static void main(String[] args) {
		int volba =1;
		String jm; //jmenoPom
		int rN; //rokNarozeniPom
		Scanner input = new Scanner(System.in);
		databaze [] zaznamy=new databaze[3];
		
		for(int i=0; i<zaznamy.length;i++) {
			System.out.println("Zadej jmeno osoby: ");
			jm = input.next();
			System.out.println("Zadej rok narozeni osoby: ");
			rN = input.nextInt();
			zaznamy[i]= new databaze(jm,rN);
		}
		
		System.out.println("Zadej maximalni mozny zavazek (h): ");
		databaze.setMaxUvazek(input.nextDouble());
		
		while(true) {
			System.out.println("\n1) Pricteni uvazku.");
			System.out.println("2) Editace maximalniho mozneho uvazku.");
			System.out.println("Zadej cislo akce (1-2): ");
			volba = input.nextInt();
			switch(volba) {
				case 1:
					for(int i=0; i<zaznamy.length;i++) {
						System.out.println("(ID):"+i+"(JMENO):"+zaznamy[i].getJmenoOsoby());
					}
					System.out.println("Zadej id osoby k editaci: ");
					volba = input.nextInt();
					System.out.println("Pocet hodin k pricteni do uvazku: ");
					zaznamy[volba].prictiUvazek(input.nextDouble());
					System.out.println("Nova hodnota: "+zaznamy[volba].getJmenoOsoby()+" "+
					zaznamy[volba].getRokNarozeni()+" "+zaznamy[volba].getVyseUvazku()+"/"+databaze.getMaxUvazek());
					break;

				case 2:
					System.out.println("Zadej maximalni mozny zavazek (h): ");
					databaze.setMaxUvazek(input.nextDouble());
					break;
			}
		}
	}

}
