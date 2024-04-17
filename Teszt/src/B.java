
public class B extends A {

	// Nem látszik az ős osztály azonos nevű változója!!
	private int ertek = 20;
	
	
	@Override
	public void Kiir() {
		// super.Kiir();
		System.out.println("B osztály  " + ertek  );
		
		
		// Nem érem el az ős osztály privát változóját!
		// System.out.println(szoveg);
	}

}
