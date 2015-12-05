/**
 * Define la clase SumaYProducto que obtenga la suma y el producto de los números del
 * 1 al 100.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class SumaYProducto{
	public static void main(String[] args){
		int suma=0;
		double producto=1;

		for(int i=1;i<=100;i++){
			suma=suma+i;
			producto=(double)producto*i;
		}
		System.out.print("\nLa suma de los cien primeros numeros enteros es: "+suma+"\n");
		System.out.print("\nEl producto de los cien primeros numeros enteros es: "+producto+"\n");
	}
}
