import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite broj redova (N): ");
		int brojRedova = s.nextInt();
		int i;
		String a = "";

		for (i = 0; i < brojRedova; i++) {
			a = a + "*";
			System.out.println(a);
		}
	}

}
