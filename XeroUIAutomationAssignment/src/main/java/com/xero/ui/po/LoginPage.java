package com.xero.ui.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.xero.util.BasePageObject;

public class LoginPage extends BasePageObject {

	/* Element */
	@FindBy(how = How.ID, using = "xl-form-email")
	private WebElement lblUserName;

	@FindBy(how = How.ID, using = "xl-form-password")
	private WebElement lblPassword;

	@FindBy(how = How.ID, using = "xl-form-submit")
	private WebElement btnLogin;

	public LoginPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

    /**
     * Method to enter user name
     */
	public void enterUserName(String userName) {

		try {
			lblUserName.sendKeys(userName);

		} catch (Exception e) {
			throw e;
		}
	}

    /**
     * Method to enter password
     */
	public void enterPassword(String password) {

		try {
			lblPassword.sendKeys(password);

		} catch (Exception e) {
			throw e;
		}
	}

	
    /**
     * Method to click login
     */
	public TrustDevicePage clickLogin() {

		try {
			btnLogin.click();
			return new TrustDevicePage(webDriver);

		} catch (Exception e) {
			throw e;
		}
	}

}
