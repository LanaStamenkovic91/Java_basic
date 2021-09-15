package example_01;

import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {
		String ime = "Lana";
		String prezime = "Stamenkovic";
		char pol = 'z';
		
		System.out.println("Moje ime je " + ime + " " + prezime + " ,pol " + pol);
		
		Scanner medalje = new Scanner (System.in);
		System.out.println("Ukupan broj medalja koliko je Srbija osvojila na olimpijskim igrama je ");
		int medalja = medalje.nextInt ();
		Scanner zlatneMedalje =new Scanner (System.in);
		System.out.println("Ukupan broj zlatnih medalja koliko je Srbija osvojila na olimpijskim igrama je ");
		int zlatnaMedalja = zlatneMedalje.nextInt ();
		
		medalje.close();
		zlatneMedalje.close();
		
		double med = medalja;
		double zlMed = zlatnaMedalja;
		
		double procenat = zlMed * 100 / med;
		
		System.out.println("Procenat zlatnih medalja u odnosu na ukupan broj medalja je " + procenat);
				
		
		
		
		

	}

}
