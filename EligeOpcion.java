/**
 * Define la clase EligeOpcion que permita visualizar los siguientes mensajes,
 * dependiendo del número que pulsamos. Ha de mostrar 10 resultados.
 * a. (1) Procesador de textos
 * b. (2) Hoja de cálculo
 * c. (3) Base de datos
 * d. otro número, la tecla pulsada es errónea.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class EligeOpcion{
	public static void main(String[] args){
		int opcion;

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		for(int i=1;i<=10;i++){
			System.out.print("\nIntroduzca una de las opciones (1,2 o 3): ");
			opcion = scanner.nextInt();

			if(opcion==1){
				System.out.println("\nProcesador de textos");
			}
			else if(opcion==2){
				System.out.println("\nHoja de calculo");
			}
			else if(opcion==3){
				System.out.println("\nBase de datos");
			}
			else{
				System.out.println("\nLa letra pulsada es erronea");
			}
		}
	}
}
