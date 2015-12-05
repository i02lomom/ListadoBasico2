/**
 * Define la clase IgualesDeTres que lea tres números de teclado y determine si la suma
 * de cualquier pareja de ellos es igual al tercer número. Si se cumple esta condición,
 * escribir Iguales y en caso contrario escribir Distintos.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class IgualesDeTres{
	public static void main(String[] args){
		int n1,n2,n3;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("\nIntroduzca el primer numero entero: ");
		n1 = scanner.nextInt();
		System.out.print("\nIntroduzca el segundo numero entero: ");
		n2 = scanner.nextInt();
		System.out.print("\nIntroduzca el tercer numero entero: ");
		n3 = scanner.nextInt();

		if(n1+n2==n3 || n1+n3==n2 || n2+n3==n1){
			System.out.print("\nIguales\n");
		}
		else{
			System.out.print("\nDistintos\n");
		}
	}
}
