/**
 * Define la clase MenorDeTres que lea tres números y calcule cuál de ellos es el menor.
 * Suponemos que los tres números son distintos.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class MenorDeTres{
	public static void main(String[] args){
		int n1,n2,n3;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("\nIntroduzca el primer numero entero: ");
		n1 = scanner.nextInt();
		System.out.print("\nIntroduzca el segundo numero entero: ");
		n2 = scanner.nextInt();
		System.out.print("\nIntroduzca el tercer numero entero: ");
		n3 = scanner.nextInt();

		if(n1<n2 && n1<n3){
			System.out.print("\n"+n1+ " es el menor\n");
		}
		else if(n2<n1 && n2<n3){
			System.out.print("\n"+n2+ " es el menor\n");
		}
		else if(n3<n1 && n3<n2){
			System.out.print("\n"+n3+ " es el menor\n");
		}
	}
}
