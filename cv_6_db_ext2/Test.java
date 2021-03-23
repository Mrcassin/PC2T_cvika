package cv5_db_rozsirena;

import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static int pouzeCelaCisla(Scanner sc) 
	{
		int cislo = 0;
		try
		{
			cislo = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}
	
	public static float pouzeDesetinna(Scanner sc) 
	{
		float cislo = 0;
		try
		{
			cislo = sc.nextFloat();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim desetinne cislo ");
			sc.nextLine();
			cislo = pouzeDesetinna(sc);
		}
		return cislo;
	}

	public static void main(String[] args) throws MojeVyjimka, IOException {	
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze();
		String jm;
		int rok;
		float prumer;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vlozeni noveho studenta");
			System.out.println("2 .. nastaveni prumeru studenta");
			System.out.println("3 .. vypis informace o studentovi");
			System.out.println("4 .. vypis vsechny studenty databaze");
			System.out.println("5 .. vymaz studenta");
			System.out.println("6 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
						System.out.println("Zadejte jmeno a rok narozeni: ");
						jm=sc.next();
						rok=pouzeCelaCisla(sc);
						mojeDatabaze.setStudent(jm,rok);
						break;
				case 2:
					System.out.println("Zadejte jmeno a prumer studenta: ");
					jm=sc.next();
					prumer =pouzeDesetinna(sc);
					mojeDatabaze.setPrumer(jm,prumer);
					break;
				case 3:
					System.out.println("Zadejte jmeno studenta: ");
					jm=sc.next();
					Student info = null;
					info=mojeDatabaze.getStudent(jm);
					if (info!=null)
						System.out.println("Jmeno: " + info.getJmeno() + " Rok narozeni: " + info.getRocnik() + " Studijni prumer: " + info.getStudijniPrumer());
					else
						System.out.println("Zadany student neexistuje!");
					break;
				case 4:
					mojeDatabaze.vypisDB();
					break;
				case 5:
					System.out.println("Zadejte jmeno studenta: ");
					jm=sc.next();
					mojeDatabaze.delStudent(jm);
					break;
				case 6:
					run=false;
					break;
			}
		}
	}
}
