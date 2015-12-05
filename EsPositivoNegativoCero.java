/**
 * Define la clase EsPositivoNegativoCero que pide un entero por teclado e indica si es
 * positivo, negativo o cero.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class EsPositivoNegativoCero{
	public static void main(String []args){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int numero;

		System.out.print("\nIntroduzca un numero entero: ");
		numero = scanner.nextInt();
		if(numero==0)
			System.out.println("\nEl numero introducido es cero.");
		else if(numero>0)
			System.out.println("\nEl numero introducido es positivo.");
		else
			System.out.println("\nEl numero introducido es negativo.");
	}
}
