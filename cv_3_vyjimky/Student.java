package cv_3_vyjimky;


public class Student {
	public Student(String jmeno, int rocnik)
	{
		this.jmeno=jmeno;
		this.rocnik=rocnik;
	}
	
	public String getJmeno()
	{
		return jmeno;
	}
	
	public int getRocnik()
	{
		return rocnik;
	}
	
	public float getStudijniPrumer()throws MojeVyjimka{
		if (studijniPrumer==0) { //testovani jestli je uz zadan nejaky prumer, pokud ne, vyhodi vyjimku
			throw new MojeVyjimka();
		}else
			return studijniPrumer;
	}

	public void setStudijniPrumer(float studijniPrumer) throws MojeVyjimka {
		if(studijniPrumer<=1 ||studijniPrumer>=5) {//testovani jestli je prumer ve spravnem rozsahu, pokud ne, vyhodi vyjimku
			throw new MojeVyjimka(studijniPrumer);
		}else
			this.studijniPrumer = studijniPrumer;
	}

	private String jmeno;
	private int rocnik;
	private float studijniPrumer;
}