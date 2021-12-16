package fr.dawan.syntaxe_de_base;

/*
 * zone memoire qui va contenir une valeur typée
 * il existe huit types de base en Java:
 * 	-des types entier : byte(1o), short (2o), int(), long()
 * 	- un type caractère: char ()
 * 	- un type boolean : boolean ( ne peut prendre que deux valeurs : true ou false)
 * 	- deux types flottant : float(4o), et le double (8o)
 * 
 * type complexes
 * -Objet
 * -Tableaux
 * -String
 * -classes
 
 */

public class Variables {

	public static void main(String[] args) {
		// Types caractère : char
		char c = 'a';
		
		// Types Entier : byte, short, int, long
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		
		// on peut forcer une valeur littéral à etre comme un entier long
		long l2 = 100L;
				
		// pour plus de illisibilité il est également possible de séparer les milliers par un (_)
		long l3 = 1_000_000_000;
		System.out.println("Le contenu de l3 : " + l3);
		
		
		// les types à virgules flottante ( décimal) :float, double
		double d1 = 5;
		System.out.println("Le contenu de d : " + d1);
		
		//pour les varaibles de type Float il faut suffixer la valeur par F ou f

		float f= 0.5F;
		
		// L type boolean: boolean
		boolean bool = true;
		
		// tupe complexe
		String chaine = "Dawan";
		int[] tab = {200, 300,50};
		
		
		// Regles de nommage varaible
		// Une varaibles commebce par une miniscule
		int nombre_de_vie =5; //avec les _ underscores
		int nombreDeVie = 5;
		
	}

}
