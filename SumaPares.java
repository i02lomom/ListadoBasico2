/**
 * Define la clase SumaPares que sume los números pares comprendidos entre 7 y 101.
 *
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class SumaPares{
	public static void main(String[] args){
		int numero;
		int suma=0;

		for(numero=8;numero<=100;numero=numero+2){
			suma=suma+numero;
		}

		System.out.println("\nLa suma de los numeros pares del 7 al 101 es: "+suma);
	}
}
