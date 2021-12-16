package fr.dawan.syntaxe_de_base;

public class Transtipageimplicite {
	
	public static void main (String [] args) {
	
	//Transtipage concerne le passage d'un type inferieur vers un type superieur implicite
	int i = 42;
	double d = i;
	System.out.println(d);
	
	//Transtipage explicite (cast)
	//Passage d'un type sup vers un type unf implique de faire un cast
	//Cast : concerne les conversion des types compatibles
	int i1 =123;
	short s = (short)i1;
	
	double d1 = 44.95;
	int i2 = (int) d1;
	
	
	//PERTE DE PR2CISION / IL FAUT QUE LE TYPE QUI RECOIT LA valeur ait la capacité de contenir cette valeur
	//ex : byte [-128 127]
	int i3 = 200;
	byte b = (byte) i3;
	System.out.println(b);
	
	

}
}