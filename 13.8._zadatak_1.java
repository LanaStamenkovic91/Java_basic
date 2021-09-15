import java.util.Scanner;

public class Domacii {

	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);
		System.out.print("Unesite neki broj: ");
		double broj = s.nextDouble();
		
		if (broj < 10) {
				double x = broj * 100;
				System.out.println("Broj je manji od 10, kad se pomnozi sa 100 daje " + x);
		}  else if (broj > 100) {
				double y = broj / 10;
				System.out.println("Broj je veci od 100, podeljen sa 10 daje " + y);
		}  else {
			System.out.println("Broj je veci od 9, a manji od 101");
		}

	}

}

// Brojevi za proveru: -1, 10, 100, 101, 8.2
