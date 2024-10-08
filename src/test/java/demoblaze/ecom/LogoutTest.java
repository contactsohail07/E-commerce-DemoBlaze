package demoblaze.ecom;

import org.testng.annotations.Test;

import pages.LogoutPage;

public class LogoutTest extends LogoutPage {
	
	@Test
	public void logoutCheck() throws InterruptedException {
		System.out.println("logout check");
		logout();
		
	}	


}
