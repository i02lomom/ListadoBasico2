package ListadoBasico2;
/**
 * Define the class NegativeCounting. Read 10 integers and display how many are negative.
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class NegativeCounting{
	public static void main(String[] args){
		int number;
		int counter;
		int negative=0;

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		for(counter=0;counter<10;counter++){
			System.out.print("\nEnter a integer: ");

			number=scanner.nextInt();

			if(number<0)
				negative++;
		}

		System.out.print("\nHas been entered "+negative+" negative numbers \n");
	}
}
