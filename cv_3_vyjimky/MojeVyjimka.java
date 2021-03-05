package cv_3_vyjimky;

public class MojeVyjimka extends java.lang.Exception{
	//pokud neni zadan prumer, vyhodi tuto vyjimku
	public MojeVyjimka() {
		super("Nebyl jeste zadny prumer studenta zadan!");
	}
	//pokud je zadan prumer ve spatnem rozsahu vyhodi tuto vyyjimku
	public MojeVyjimka(float v) {
		super("Prumer "+v+" není v rozsahu 1-5,0!");
	}
}
