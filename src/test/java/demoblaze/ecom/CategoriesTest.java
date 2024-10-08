package demoblaze.ecom;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.CategoriesPage;

public class CategoriesTest extends CategoriesPage{

	@Test
 	public void phoneSelect() throws InterruptedException {
 		
 		System.out.println("check phone selection");
 		phones();

 		
 	}
}
