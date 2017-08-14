/**
 * This script uses Helium to automatically perform a Google search for the
 * term "Helium", and opens the Wikipedia article on the subject. If all goes 
 * well, it prints "Test passed". Otherwise, it prints "Test failed :(".
 */

import static com.heliumhq.API.*;

public class CloudSystem {
	public static void main(String[] args) {
		startChrome();
		goTo("http://www.bing.com");
		write("cloudsystems.sa");
		press(ENTER);
		click("Cloud Systems");
		click("Contact Us");
	}
}