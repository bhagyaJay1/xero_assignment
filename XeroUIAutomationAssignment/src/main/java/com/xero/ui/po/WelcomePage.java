package com.xero.ui.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.xero.util.BasePageObject;

public class WelcomePage extends BasePageObject {

	// Element //
	@FindBy(how = How.XPATH, using = "(//a[text()='Log in'])[2]")
	private WebElement btnLogin;
	
	public WelcomePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	
    /**
     * method to get welcome page
     */
	public LoginPage clickLogin() {

		try {
			btnLogin.click();
			return new LoginPage(webDriver);

		} catch (Exception e) {
			throw e;
		}
	}

}
