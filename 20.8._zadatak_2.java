package domaci;

import java.util.Scanner;

public class Domaci {

	public static void main(String[] args) {
		/*Napisati program gde u nizu napisete 5 gradova, 
		a program vam odstampa sve osim prvog i poslednjeg unosa.
		-Napisati program gde u nizu napisete ovih 5 gradova 
		(Lisabon, London, Helsinki, Prag i Madrid) a program
		stampa gradove sve dok ne dodje do "Prag"-a*/
		
		Scanner s = new Scanner (System.in);
		System.out.println("Unesite 5 gradova: ");
		String unosKorisnika = s.nextLine();
		String[] gradovi = unosKorisnika.split("\\W");
		int x = gradovi.length;
		for (int i =1; i<(x-1); i++){	
			System.out.println(gradovi[i]);
		}

	
		System.out.println("");
		
		String [] gradovi2 = {"Lisabon", "London", "Helsinki", "Prag", "Madrid"};
		for (String grad : gradovi2) {
				if (grad.equals("Prag")) {
					break;
				}
				System.out.println(grad);
			}
	//za prvi zadatak bi bilo pitanje da li gradove unosi korisnik ili ja direktno u kodu
	//za drugi bi bilo pitanje sta program radi kad dodje do Praga
	//shodno manjku vremena predajem bez navedenih pitanja
		
	}
}

