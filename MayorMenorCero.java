/**
 * Define la clase MayorMenorCero que permita saber si un número leído por teclado es
 * mayor, menor o igual a cero, mostrando en pantalla las diferentes salidas. Ha de
 * mostrar 10 resultados.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class MayorMenorCero{
	public static void main(String[] args){
		int numero;
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		for(int i=1;i<=10;i++){
			System.out.print("\nIntroduzca un numero entero: ");
			numero = scanner.nextInt();
			if(numero==0){
				System.out.println("\nEl numero introducido es igual a cero.");
			}
			else if(numero>0){
				System.out.println("\nEl numero introducido es mayor que cero.");
			}
			else{
				System.out.println("\nEl numero introducido es menor que cero.");
			}
		}
	}
}
