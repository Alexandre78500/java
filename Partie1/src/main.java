import java.util.Scanner;

public class main {

	static Scanner sc = new Scanner(System.in);

	public static void main (String[] args) {

		String repetition = "O";

		while (repetition.equals("O") || repetition.equals("o")) {

			System.out.println("MENU");
			System.out.println("=========================");
			System.out.println("Saisissez un nombre pour naviguer entre les différentes fonctionnalités");
			System.out.println("1 - Hello world");
			System.out.println("2 - Variables et opérateurs");
			System.out.println("3 - Entrées claviers");
			System.out.println("4 - Boucles");
			System.out.println("5 - Tableaux");
			System.out.println("6 - Méthodes");

			int choix = sc.nextInt();

			switch(choix) {

			case 1:
				//Hello World

				System.out.println("Hello world");
				System.out.println("\nSouhaitez-vous continuer ? (O/N)");
				repetition = sc.next();
				break;

			case 2:
				//Variables et opérateurs

				long anneeLumiere;
				anneeLumiere = 946070000000000L;
				System.out.println(anneeLumiere);

				float nombre;
				nombre = 2.0f;
				System.out.println(nombre);

				double nbre1 = 10, nbre2 = 3;
				int resultat = (int)(nbre1 / nbre2);
				System.out.println("Le résultat est " + resultat);

				int i = 179;
				String j = new String();
				j = String.valueOf(i);
				int k = Integer.valueOf(j).intValue();
				char l = j.charAt(0);
				char m = j.charAt(1);
				char n = j.charAt(2);
				System.out.println(j + " " + k + "\n" + l + " " + m + " " + " " + n);
				System.out.println("\nSouhaitez-vous continuer ? (O/N)");
				repetition = sc.next();
				break;

			case 3:
				//Entrées clavier

				System.out.println("Veuillez saisir un mot : ");
				String str = sc.next();
				char caract = str.charAt(0);
				System.out.println("Vous avez saisi : " + str + "\nLa première lettre de ce mot est : " + caract);
				System.out.println("\nSouhaitez-vous continuer ? (O/N)");
				repetition = sc.next();
				break;

			case 4:
				//Boucles

				System.out.println("Saisissez un nombre : ");
				int repeat = sc.nextInt();

				for (i = 1; i <= repeat; i++) {
					System.out.println("Bonjour " + i + " fois jusqu'à " + repeat + " fois !");
				}
				System.out.println("\nSouhaitez-vous continuer ? (O/N)");
				repetition = sc.next();
				break;

			case 5:
				//Tableaux

				char tableauCaractere[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
				System.out.println("Le tableau contient les " + tableauCaractere.length + " lettres de l'alphabet.");

				System.out.println("Saisissez une lettre en minuscule : ");
				char lettre = sc.next().charAt(0);
				int alphabet = 0;

				do {
					alphabet++;
				} while (alphabet <= tableauCaractere.length && lettre != tableauCaractere[alphabet]);

				System.out.println("La lettre " + tableauCaractere[alphabet] + " est la " + (alphabet+1) + "ème lettre de l'alphabet.\n");

				/*int tab[] = {55, 45144, 45455885, 69745, 7412555};

				for (int fois2 : tab) {
					fois2 *= 2;
					System.out.println(fois2);
				}*/
				System.out.println("\nSouhaitez-vous continuer ? (O/N)");
				repetition = sc.next();
				break;
				
			case 6:
				//Méthodes
				
				System.out.println("Saisissez un nombre entier : ");
				double entier = sc.nextInt();
				System.out.println("Combien de fois souhaitez-vous qu'il se fasse doubler ?");
				double exposant = sc.nextInt();
				doubleur(entier,exposant);
				break;

			default:
				System.out.println("Veuillez taper un nombre valide \n");
				break;
			}
		}
		
		System.out.println("Au revoir et à bientôt !");
	}
	
	static void doubleur(double a, double b) {
		
		for (int i = 0; i < b; i++) {
			a *= 2;
			System.out.println(a);
		}
		
	}
}