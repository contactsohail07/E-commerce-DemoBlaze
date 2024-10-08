package demoblaze.ecom;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import pages.LoginPage;

/**
 * Unit test for simple App.
 */
public class LoginTest extends LoginPage
{
	@Test
 	public void loginCheck() throws IOException, InterruptedException {
 		
 		System.out.println("check logging in");
 		login();
 		
 	}
	

}
