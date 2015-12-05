/**
 * Define la clase EnteroPorDiez que pide un entero por teclado y lo multiplica por 10
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class EnteroPorDiez{
	public static void main(String []args){
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int numero;

		System.out.print("\nIntroduzca un numero entero: ");
		numero = scanner.nextInt();
		System.out.println("\n"+numero+" x 10 = "+(numero*10));
	}
}
