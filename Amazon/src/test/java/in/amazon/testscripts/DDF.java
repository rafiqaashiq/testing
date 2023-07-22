package in.amazon.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;
import utils.ReadExcel;

public class DDF extends BaseTest {

	@Test
	public void verifyErrorMsg() throws IOException {
		// 4) hover the pointer over "Hello Sign In" menu
		LandingPage landingPage = new LandingPage(driver);
		landingPage.hoverOverHelloSignInMenu();
		
		// 5) click on 'Sign-In' button in the sub-menu
		landingPage.clickSignInBtn();
		
		String[][] data = ReadExcel.getData("resources//TestData.xlsx", "Sheet1");
		
		for(int i=1; i<data.length; i++) {
			String username = data[i][1];
			
			// 6) enter invalid username in the email textbox
			SignIn signIn = new SignIn(driver);
			signIn.enterEMail(username);
			
			// 7) click on 'Continue' button
			signIn.clickContinueBtn();
			
			// 8) verify the error message - 'we cannot find an account with that email address', is displayed to user
			String expectedErrMsg = "We cannot find an account with that email address";
			String actualErrMsg = signIn.getErrMsg();
			Assert.assertEquals(actualErrMsg, expectedErrMsg);
		}
		
	}
}
