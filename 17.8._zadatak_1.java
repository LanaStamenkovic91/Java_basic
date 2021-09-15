import java.util.Scanner;

public class Domaci {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x = 0;
		String grad = "Proba";

		do {
			System.out.print(
					"Izaberite jednu od ponudjenih opcija:\r\n1. Francuska\r\n2. Italija\r\n3. Srbija\r\n4. Izlaz\r\n");
			x = s.nextInt();
			if (x == 1) {
				System.out.println("Koji je glavni grad Francuske?");
				grad = s.next();
				grad = grad.toLowerCase();
				grad = grad.strip();
				if (grad.equals("pariz")) {
					System.out.println("Odgovor je tacan\r\n");
				} else {
					System.out.println("Odgovor nije tacan.\r\n");
				}

			} else if (x == 2) {
				System.out.println("Koji je glavni grad Italije?");
				grad = s.next();
				grad = grad.toLowerCase();
				grad = grad.strip();
				if (grad.equals("rim")) {
					System.out.println("Odgovor je tacan\r\n");
				} else {
					System.out.println("Odgovor nije tacan.\r\n");
				}

			} else if (x == 3) {
				System.out.println("Koji je glavni grad Srbije?");
				grad = s.next();
				grad = grad.toLowerCase();
				grad = grad.strip();
				if (grad.equals("beograd")) {
					System.out.println("Odgovor je tacan\r\n");
				} else {
					System.out.println("Odgovor nije tacan.\r\n");
				}

			} else if (x == 4) {
				System.out.println("Kraj.");
				break;
			}

			else {
				System.out.println("Pogresan unos.\r\n");
			}
		} while (true);

	}
}
