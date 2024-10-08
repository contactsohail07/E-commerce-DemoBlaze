package demoblaze.ecom;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.CartPage;

public class CartTest extends CartPage {
	
	@Test(priority=1)
	public void editCart() throws IOException {
		
		System.out.println("check edit cart");
		checkOut();
		
	}
	
	@Test(priority=2)
	public void order() throws IOException {
		placeOrder();
	}
}
