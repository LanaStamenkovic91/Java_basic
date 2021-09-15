import java.util.Scanner;

public class Domaci {
	static double myMethod(double a, double b, double c) {
		if (a >= b) {
			double tmp = a;
			a = b;
			b = tmp;
		}
		if (a <= c) {
			return a;
		} else {
			return c;
		}
		

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Unesi 3 cela broja: ");
		double x = s.nextDouble();
		double y = s.nextDouble();
		double z = s.nextDouble();

		System.out.println("Najmanji broj je: " + myMethod(x, y, z) + " .");

	}
}
