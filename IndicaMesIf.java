/**
 * Define la clase IndicaMesIf que muestre el nombre del mes en función del número
 * obtenido por teclado (del 1 al 12). Utiliza la estructura condicional If. Ha de mostrar 10
 * resultados.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class IndicaMesIf{
	public static void main(String[] args){
		int mes;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		for(int i=1;i<=10;i++){
			System.out.print("\nIntroduzca el numero correspondiente a un mes: ");
			mes = scanner.nextInt();
			if(mes==1){
				System.out.println("\nEl mes es Enero");
			}
			else if(mes==2){
				System.out.println("\nEl mes es Febrero");
			}
			else if(mes==3){
				System.out.println("\nEl mes es Marzo");
			}
			else if(mes==4){
				System.out.println("\nEl mes es Abril");
			}
			else if(mes==5){
				System.out.println("\nEl mes es Mayo");
			}
			else if(mes==6){
				System.out.println("\nEl mes es Junio");
			}
			else if(mes==7){
				System.out.println("\nEl mes es Julio");
			}
			else if(mes==8){
				System.out.println("\nEl mes es Agosto");
			}
			else if(mes==9){
				System.out.println("\nEl mes es Septiembre");
			}
			else if(mes==10){
				System.out.println("\nEl mes es Octubre");
			}
			else if(mes==11){
				System.out.println("\nEl mes es Noviembre");
			}
			else if(mes==12){
				System.out.println("\nEl mes es Diciembre");
			}
			else{
				System.out.println("\nEl numero introducido no corresponde a un mes");
			}
		}
	}	
}
