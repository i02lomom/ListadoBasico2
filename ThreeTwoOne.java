package ListadoBasico2;
/**
 * Create the class ThreeTwoOne that displays:
 * At 3... 
 * At 2... 
 * At 1....
 * Using the loop while, do..while and for
 * Also use -- in the counter
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class ThreeTwoOne{
	public static void main(String[] args){
		int i=3;

		System.out.println("\nWith while\n");
		while (i>0)
			System.out.println("At " + i-- + "...");

		i=3;

		System.out.println("\nWith do..while\n");
		do
			System.out.println("At " + i-- + "...");
		while(i>0);

		System.out.println("\nWith for\n");
		for (i=3;i>0;)
			System.out.println("At " + i-- + "...");
	}
}
