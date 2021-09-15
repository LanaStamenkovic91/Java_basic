import java.util.Scanner;

public class Domaci1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double x = 0;
		double zbir = 0;

		while (x >= 0) {

			System.out.print("Unesite broj: ");
			x = s.nextDouble();

			if (x < 0) {
				break;
			}

			zbir = zbir + x;

		}
		System.out.println("Zbir prethodno unetih brojeva je: " + zbir);

		// test 1 0, 5, 2.5, -1

	}

}
