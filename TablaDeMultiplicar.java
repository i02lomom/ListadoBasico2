/**
 * Define la clase TablaDeMultiplicar. Muestra la tabla de multiplicar. Para ello, solicita el
 * factor al usuario. Sólo se admiten la tabla de multiplicar de los número 1, 2... 12
 * (solicitud repetitiva)
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class TablaDeMultiplicar{
	public static void main(String[] args){
		int i,numero;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		while(true){
			System.out.print("\nIntroduzca un numero del 1 al 12 o 0 si desea salir: ");
			numero = scanner.nextInt();
			if(numero<0 || numero>12){
				System.out.println("\nError. El numero introducido es incorrecto\n");
			}
			else if(numero==0){
				System.out.println("\nSaliendo del programa\n");
				break;				
			}
			else{
				System.out.print("\n");
				for(i=1;i<11;i++){
					System.out.println(i+" x "+numero+"= "+(numero*i)+"\n");
				}
			}			
		}
	}
}
