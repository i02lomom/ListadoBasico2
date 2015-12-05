/**
 * Define la clase SumaMientrasNoSeaNegativo que sume todos aquellos números leídos
 * mientras no sean negativos.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class SumaMientrasNoSeaNegativo{
	public static void main(String[] args){
		int numero,suma=0;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("\nIntroduzca un numero entero: ");
		numero = scanner.nextInt();

		while(numero>0){
			suma=suma+numero;
			System.out.println("\nSuma vale "+suma);

			System.out.print("\nIntroduzca un numero entero: ");
			numero = scanner.nextInt();
		}
	}
}
