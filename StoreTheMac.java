package ListadoBasico2;
/**
 * Class StoreTheMac
 *
 * Mac addresses are 6 bytes numbers that identify network cards.
 * When they are containing the maximum value (FFFFFFFFFFFF) considers that the 
 * message you want to send not a network card, but to all network. At this special
 * address it is called broadcast address.
 * 
 * Create class StoreTheMac that stores and displays the broadcast address. 
 * 
 * @author Miguel Angel López Moyano
 * @version 1.0
 */
public class StoreTheMac{
	public static void main(String []args){
		long broadcast=0xFFFFFFFFFFFFl;

		System.out.println(broadcast);
	}
}
