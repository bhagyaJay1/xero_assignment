package com.xero.ui.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.xero.util.BasePageObject;

public class AuthSecurityQuestionsPage extends BasePageObject {

	/* Elements */
	
	@FindBy(how = How.XPATH, using = "//label[text()='What was the name of your first girlfriend / boyfriend?']/..//input")
	private WebElement txtQuestion1;
	
	@FindBy(how = How.XPATH, using = "//label[text()='What is your dream job?']/..//input")
	private WebElement txtQuestion2;
	
	@FindBy(how = How.XPATH, using = "//label[text()='What is your dream car?']/..//input")
	private WebElement txtQuestion3;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Confirm']")
	private WebElement btnConfirm;
	
	public AuthSecurityQuestionsPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}


    /**
     * Method to verify question1 for two factor auth
     */
	public boolean isQuestion1Displayed() {

		try {
			return txtQuestion1.isDisplayed();

		} catch (Exception e) {
			return false;
		}
	}
	
    /**
     * Method to send question1 answer for two factor auth
     */
	public void enterQuestion1Answer(String answer) {

		try {
			txtQuestion1.sendKeys(answer);

		} catch (Exception e) {
			throw e;
		}
	}
	
    /**
     * Method to verify question2 for two factor auth
     */
	public boolean isQuestion2Displayed() {

		try {
			return txtQuestion2.isDisplayed();

		} catch (Exception e) {
			return false;
		}
	}
	
    /**
     * Method to send question2 answer for two factor auth
     */
	public void enterQuestion2Answer(String answer) {

		try {
			txtQuestion2.sendKeys(answer);

		} catch (Exception e) {
			throw e;
		}
	}
	
    /**
     * Method to send question3 answer for two factor auth
     */
	public boolean isQuestion3Displayed() {

		try {
			return txtQuestion3.isDisplayed();

		} catch (Exception e) {
			return false;
		}
	}
	
    /**
     * Method to send question3 answer for two factor auth
     */
	public void enterQuestion3Answer(String answer) {

		try {
			txtQuestion3.sendKeys(answer);

		} catch (Exception e) {
			throw e;
		}
	}

	
    /**
     * Method to click confirm button for two factor auth
     */
	public DashBoardPage clickConfirmButton() {

		try {
			btnConfirm.click();
			return new DashBoardPage(webDriver);

		} catch (Exception e) {
			throw e;
		}
	}

}
