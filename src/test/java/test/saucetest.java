package test;

import org.testng.annotations.Test;

import base.saucebase;
import page.saucelogin;

public class saucetest extends saucebase {
	
	@Test
	public void test() throws InterruptedException {
		saucelogin sl=new saucelogin(driver);
		sl.setvalues("standard_user", "secret_sauce");
		sl.login();
	}

}
