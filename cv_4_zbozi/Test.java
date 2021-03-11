package cv5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Zbozi [] zbozi = new Zbozi[4];
		Scanner sc = new Scanner(System.in);
		int kat, exp;
		double cena;
		String nazev;
		
		/*
		zbozi[0] = new Potravina("Rohlík", 1.5, 1);
		zbozi[1]  = new Naradi("Kleštì", 278.0, 24);
		zbozi[2]  = new Potravina("Chleba", 20.8,6);
		zbozi[3]  = new Potravina("Jablko", 51.0, 20);
		*/
		
		for(int i=0;i<zbozi.length;i++) {
			System.out.println("Vyber kategorii- 1=potravina | 2=naradi");
			kat=sc.nextInt();
			switch(kat) {
				case 1:
					System.out.println("Zadej nazev potraviny");
					nazev=sc.next();
					System.out.println("Zadej cenu: ");
					cena= sc.nextDouble();
					System.out.println("Zadej dobu spotreby [dny]: ");
					exp=sc.nextInt();
					zbozi[i]= new Potravina(nazev,cena,exp);
					break;
					
				case 2:
					System.out.println("Zadej nazev naradi");
					nazev=sc.next();
					System.out.println("Zadej cenu: ");
					cena= sc.nextDouble();
					System.out.println("Zadej dobu zaruky [mesicu]: ");
					exp=sc.nextInt();
					zbozi[i]= new Naradi(nazev,cena,exp);
					break;
			}
		}
		
		
		for(int i=0;i<zbozi.length;i++) {
			if(zbozi[i] instanceof Potravina ) {
				System.out.println(zbozi[i].getNazevZbozi()+", cena: "+zbozi[i].getCena()+", "
						+ "trvanlivost: "+((Potravina)zbozi[i]).getTrvanlivost()+" "+zbozi[i].getJednotka());
			}else {
				System.out.println(zbozi[i].getNazevZbozi()+", cena: "+zbozi[i].getCena());
			}
		}
		
	}

}
