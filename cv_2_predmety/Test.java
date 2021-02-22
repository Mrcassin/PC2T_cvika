package druheCviceni;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		jedna o1 = new jedna();
		dva o2 = new dva();
		tri o3 = new tri();
		Scanner sc = new Scanner(System.in);
		int p1,p2,p3=0;
		while(true) {
			System.out.println("\n---------");
			System.out.println("1) "+o1.getNazevPredmetu());
			System.out.println("2) "+o2.getNazevPredmetu());
			System.out.println("3) "+o3.getNazevPredmetu());
			System.out.println("---------");
			System.out.println("Zadejte predmet, ve kterém chcete provádìt zmìny: ");
			p1 = sc.nextInt();
			switch(p1) {
				case 1:
					System.out.println("\n1) Zadavani bodu z cviceni");
					System.out.println("2) Zadavani bodu za zkousku");
					System.out.println("3) Zjisteni celkoveho poctu bodu z predmetu");
					System.out.println("4) Overeni udeleni zapoctu");
					System.out.println("----------------------------------------------");
					System.out.println("Zadejte volbu operace: ");
					p2=sc.nextInt();
					switch(p2) {
						case 1:
							System.out.println("Zadejte pocet bodu k pricteni za cviko ("+o1.getPocetBoduCviko()+"/20): ");
							p3=sc.nextInt();
							o1.setPocetBoduCviko(p3);
							break;
						case 2:
							System.out.println("Zadejte pocet bodu za zkousku: ");
							p3=sc.nextInt();
							o1.setPocetBoduZkouska(p3);
							break;
						case 3:
							System.out.println("CELKOVY POCET BODU V PREDMETU: "+o1.getPocetBodu());
						case 4:
							o1.maZapocet();
					}
					break;
					
				case 2:
					System.out.println("\n1) Zadavani bodu za projekt");
					System.out.println("2) Zadavani bodu za pulsemestralku");
					System.out.println("3) Zadavani bodu za zkousku");
					System.out.println("4) Zjisteni celkoveho poctu bodu z predmetu");
					System.out.println("5) Overeni udeleni zapoctu");
					System.out.println("----------------------------------------------");
					System.out.println("Zadejte volbu operace: ");
					p2=sc.nextInt();
					switch(p2) {
						case 1:
							System.out.println("Zadejte pocet bodu za projekt: ");
							p3=sc.nextInt();
							o2.setPocetBoduProjekt(p3);
							break;
						case 2:
							System.out.println("Zadejte pocet bodu za pulsemestralku: ");
							p3=sc.nextInt();
							o2.setPocetBoduPulsemestralka(p3);
							break;
						case 3:
							System.out.println("Zadejte pocet bodu za zkousku: ");
							p3=sc.nextInt();
							o2.setPocetBoduZkouska(p3);
							break;	
						case 4:
							System.out.println("CELKOVY POCET BODU V PREDMETU: "+o2.getPocetBodu());
						case 5:
							o2.maZapocet();
					}
					break;
					
				case 3:
					System.out.println("\n1) Zadavani zapoctu za predmet");
					System.out.println("2) Overeni udeleni zapoctu");
					System.out.println("Zadejte volbu operace: ");
					p2=sc.nextInt();
					switch(p2) {
						case 1:
							System.out.println("Udeleni zapoctu: ");
							System.out.println("1) ANO");
							System.out.println("2) NE");
							System.out.println("---------------------");
							System.out.println("Zadejte volbu: ");
							p3=sc.nextInt();
							if(p3==1) {
								o3.setZapocet(true);
							}else o3.setZapocet(false);
							break;
						case 2:
							o3.maZapocet();
					}
					break;	
			}
		}
		

	}

}
