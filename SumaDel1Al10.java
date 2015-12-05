/**
 * Define la clase SumaDel1Al10 que calcule la suma de los enteros entre 1 y 10, es decir
 * 1+2+3+4+5,...
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class SumaDel1Al10{
	public static void main(String[] args){
		int suma=0;
		for(int i=1;i<=10;i++){
			suma=suma+i;
		}
		System.out.print("\nLa suma de los diez primeros numeros enteros es: "+suma+"\n");
	}
}
