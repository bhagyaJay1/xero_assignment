package com.xero.teststeps;

import org.junit.Assert;

import com.xero.ui.po.WelcomePage;
import com.xero.util.BaseTestObject;
import io.cucumber.java.en.Given;

public class LoginSteps extends BaseTestObject {
	
	@Given("as a user i should be able signed in to system using email {string} and password {string}")
	public void as_a_user_i_should_be_able_signed_in_to_system_using_email_and_password(String userName, String password) throws Exception {
	    
		welcomePage = new WelcomePage(driver);
		loginPage = welcomePage.clickLogin();
		loginPage.enterUserName(userName);
		loginPage.enterPassword(password);
		trustDevicePage = loginPage.clickLogin();
		
	}
	
	@Given("I can do two factor auth giving answers as {string} and {string} and {string}")
	public void i_can_do_two_factor_auth_giving_answers_as_and_and(String answer1, String answer2, String answer3) throws Exception {
	    
		authTypeSelectionPage = trustDevicePage.clickBackUpMethodButton();
		authSecurityQuestionsPage = authTypeSelectionPage.clickSecurityQuestionsButton();
		if(authSecurityQuestionsPage.isQuestion1Displayed())
			authSecurityQuestionsPage.enterQuestion1Answer(answer1);
		if(authSecurityQuestionsPage.isQuestion2Displayed())
			authSecurityQuestionsPage.enterQuestion2Answer(answer2);
		if(authSecurityQuestionsPage.isQuestion3Displayed())
			authSecurityQuestionsPage.enterQuestion3Answer(answer3);
		dashBoardPage = authSecurityQuestionsPage.clickConfirmButton();
		Assert.assertTrue(dashBoardPage.isTopNavigationDisplayed(50));
		
	}

}
