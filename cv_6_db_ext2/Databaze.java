package cv5_db_rozsirena;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Databaze {
	public Databaze()
	{
		prvkyDatabaze=new HashMap<String,Student>();
	}
	
	public boolean setStudent(String jmeno, int rok)
	{
		if (prvkyDatabaze.put(jmeno,new Student(jmeno,rok))==null)
			return true;
		else
			return false;
	}
	
	public Student getStudent(String jmeno)
	{
		return prvkyDatabaze.get(jmeno);
	}
	
	public boolean setPrumer(String jmeno, float prumer) throws MojeVyjimka
	{
		if (prvkyDatabaze.get(jmeno)==null) {
			System.out.println("Zadany student neexistuje!");
			return false;
		}
		return prvkyDatabaze.get(jmeno).setStudijniPrumer(prumer);
	}
	
	public void vypisDB() throws MojeVyjimka {
		Set <String> klice=prvkyDatabaze.keySet();
		for(String jmeno:klice)
			System.out.println(jmeno);
	}
	
	public boolean delStudent(String jmeno) {
		if (prvkyDatabaze.get(jmeno)==null) {
			System.out.println("Zadany student neexistuje!");
			return false;
		}
		prvkyDatabaze.remove(jmeno);
		return true;
	}
	Map<String,Student> prvkyDatabaze;
}