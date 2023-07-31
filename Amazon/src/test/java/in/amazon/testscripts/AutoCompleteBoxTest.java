package in.amazon.testscripts;

import org.testng.annotations.Test;

import in.amazon.pages.LandingPage;

public class AutoCompleteBoxTest extends BaseTest {

	@Test
	public void selectItem() {
		
//		4) type 'computer' in the search box and select
		LandingPage landingPage = new LandingPage(driver);
		landingPage.searchItem("computer");
	}
}
