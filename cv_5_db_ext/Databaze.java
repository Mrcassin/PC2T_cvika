package cv5_db_rozsirena;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Databaze {
	public Databaze(int pocetPrvku)
	{
		prvkyDatabaze=new Student[pocetPrvku];
		sc=new Scanner(System.in);
	}
	
	public void setStudent()
	{
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno=sc.next();
		int rok=sc.nextInt();
		prvkyDatabaze[posledniStudent++]=new Student(jmeno,rok);
	}
	
	public Student getStudent(int idx)
	{
		return prvkyDatabaze[idx];
	}
	
	public void setPrumer(int idx, float prumer) throws MojeVyjimka
	{
		prvkyDatabaze[idx].setStudijniPrumer(prumer);
	}
	
	public void vypisDB() throws MojeVyjimka {
		for(int i=0;i<prvkyDatabaze.length;i++) {
			System.out.println("Jmeno: "+prvkyDatabaze[i].getJmeno()+", rok narozeni: "
					+prvkyDatabaze[i].getRocnik()+", studijni prumer:"+prvkyDatabaze[i].getStudijniPrumer());
		}
	}
	
	public boolean ulozDatabazi(String vystup) throws MojeVyjimka
	{
		try {
			FileWriter fw = new FileWriter(vystup);
			BufferedWriter output = new BufferedWriter(fw);
			output.write(new String("Pocet " + prvkyDatabaze.length));
			output.newLine();
			for (int i=0;i<prvkyDatabaze.length;i++){
				if (prvkyDatabaze[i]!=null)
					output.write(prvkyDatabaze[i].getJmeno() +" " + prvkyDatabaze[i].getRocnik() +" " + prvkyDatabaze[i].getStudijniPrumer());
				else
					output.write("null");
				output.newLine();
			}
			output.close();
			fw.close();
		}
		catch (IOException e) {
			System.out.println("Soubor nelze vytvorit");
			return false;
		}
		return true;
	}

	public boolean nactiDatabazi(String vstup) throws MojeVyjimka {
		FileReader fr=null;
		BufferedReader input=null;
		try {
			fr = new FileReader(vstup);
			input = new BufferedReader(fr);
			String radek=input.readLine();
			String oddelovac = "[ ]+";
			String[] castiTextu = radek.split(oddelovac);
			if (castiTextu.length!=2)
				return false;
			int pocetPrvku=Integer.parseInt(castiTextu[1]);
			prvkyDatabaze=new Student[pocetPrvku];
			for (int i=0;i<pocetPrvku;i++)
			{
				radek=input.readLine();
				castiTextu = radek.split(oddelovac);
				if (castiTextu.length==3)
				{
					prvkyDatabaze[i]=new Student(castiTextu[0], Integer.parseInt(castiTextu[1]));
					prvkyDatabaze[i].setStudijniPrumer(Float.parseFloat(castiTextu[2]));
				}
			}
		}
		catch (IOException e) {
			System.out.println("Soubor nelze otevøít");
			return false;
		} 
		catch (NumberFormatException e) {
			System.out.println("Chyba integrity dat v souboru");
			return false;
		}
		finally
		{
			try
			{	if (input!=null)
				{
					input.close();
					fr.close();
				}
			}
			catch (IOException e) {
				System.out.println("Soubor  nelze zavrit");
				return false;
			} 
		}
		
		return true;
	}
	
	private Scanner sc;
	private Student [] prvkyDatabaze;
	private int posledniStudent;
}