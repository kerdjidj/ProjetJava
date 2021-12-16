package fr.dawan.syntaxe_de_basetranstipageOucasting;

public class TranstipageOucasting {
	
	public static void main (String[] args) {
		int var1 = 4;
		int var2 = 10;
		
		/*
		 * Exemple : remplacer le type quotient par un ttpe qui va contenir des valeur décimal (double)
		 * Result aprés execution = 0.0
		 */
		double quotient = var1 / var2;
		System.out.println("result = " + quotient);
		 
		/*
		 * * Exemple : transformation les var1 et var2 en type double
		 */
		double _var1 = 4;
		double _var2 = 10;
		double quotient = _var1/_var2;
		System.out.println("result : " + quotient2);
		
		/*
		 * * Exemple 3 : on veut garder var1 et var2 comme entiers
		 * 
		 * Solution : les types var1 et var2 peuvent etre converti en double  en utilisation le casting
		 * 
		 */
		double quotient3 = (double)var1/var2;
				System.out.println("result = " + quotient3);
		
		
	}

}
