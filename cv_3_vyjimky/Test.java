package cv_3_vyjimky;

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
	
	//obdobná metoda jako PouzeCelaCisla akorat pro desetinna
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


	public static void main(String[] args) throws MojeVyjimka {	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze(1);
		int idx;
		float prumer;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					System.out.println("Zadejte pocet studentu");
					mojeDatabaze=new Databaze(pouzeCelaCisla(sc)); //vyuziti predpripravene metody na cela cisla
					break;
				case 2:
					try {
						mojeDatabaze.setStudent();
					}
					catch(ArrayIndexOutOfBoundsException e) { //pokus o pridani mimo pole
						System.out.println("Databaze je plna, zaznam nebyl pridan!"); 
					}
					break;
				case 3:
					System.out.println("Zadejte index a prumer studenta");
					idx=pouzeCelaCisla(sc); //vyuziti predpripravene metody na cela cisla
					prumer =pouzeDesetinna(sc); //vyuziti metody na desetinna cisla
					try {
						mojeDatabaze.setPrumer(idx,prumer);
					}
					catch(NullPointerException e) { //odkazujeme na neexistujici pole
						System.out.println("Neexistuje zaznam v databazi.");
					}
					catch(ArrayIndexOutOfBoundsException e) { //zadany index mimo existujici pole
						System.out.println("Zadany index studenta mimo databazi.");
					}
					break;
				case 4:
					System.out.println("Zadejte index studenta");
					idx=pouzeCelaCisla(sc);//vyuziti predpripravene metody na cela cisla
					Student info = null;
					try {
						info=mojeDatabaze.getStudent(idx);
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
					}
					catch(NullPointerException e) { //odkazujeme na neexistujici pole
						System.out.println("Neexistuje zaznam v databazi.");
					}
					catch(ArrayIndexOutOfBoundsException e) { //zadany index mimo existujici pole
						System.out.println("Zadany index studenta mimo databazi.");
					}	
					break;
				case 5:
					run=false;
					break;
			}
			
		}
	}

}
