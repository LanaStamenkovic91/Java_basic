import java.util.Scanner;

public class while1domaci {

	public static void main(String[] args) {
		/*
		 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
		 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
		 */

		Scanner s = new Scanner(System.in);
		int x = 0;
		int zbir = 0;

		while (x >= 0) {

			System.out.print("Unesite broj: ");
			x = s.nextInt();

			if (x < 0) {
				break;
			}

			zbir = zbir + x;

		}
		System.out.println("Zbir pozitivnih brojeva je: " + zbir);

	}

}
