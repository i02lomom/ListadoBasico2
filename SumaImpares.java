/**
 * Define la clase SumaImpares. Visualiza la suma de los números impares del 1 al 75,
 * ambos inclusive.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class SumaImpares{
	public static void main(String[] args){
		int numero;
		int suma=0;

		for(numero=1;numero<=75;numero=numero+2){
			suma=suma+numero;
		}

		System.out.println("\nLa suma de los numeros impares del 1 al 75 es: "+suma);
	}
}
