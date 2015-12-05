/**
 * Define la clase SonIguales que lea dos valores numéricos, y determine si son iguales y,
 * en caso de no serlo, indique cuál de ellos es el mayor.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class SonIguales{
	public static void main(String[] args){
		int n1,n2;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("\nIntroduzca un numero entero: ");
		n1 = scanner.nextInt();
		System.out.print("\nIntroduzca otro numero entero: ");
		n2 = scanner.nextInt();

		if(n1==n2){
			System.out.print("\nLos numeros introducidos son iguales\n");
		}
		else if(n1>n2){
			System.out.print("\n"+n1+" es mayor que "+n2+"\n");
		}
		else if(n1<n2){
			System.out.print("\n"+n1+" es menor que "+n2+"\n");
		}
	}
}
