import java.util.Scanner;

public class while2domaci {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!”
		 * onoliko puta koliko je korisnik zadao preko konzole
		 */

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite broj ponavljanja: ");
		int x = s.nextInt();
		int i = 0;

		while (i < x) {
			i++;
			System.out.println("Laku noc!");
		}

	}

}
