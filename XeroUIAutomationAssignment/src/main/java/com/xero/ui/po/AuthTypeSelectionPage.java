package com.xero.ui.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.xero.util.BasePageObject;

public class AuthTypeSelectionPage extends BasePageObject {

	/* Element */
	@FindBy(how = How.XPATH, using = "//button[text()='Security questions']")
	private WebElement btnSecurityQuestions;
	
	public AuthTypeSelectionPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

    /**
     * Navigate to security question
     */
	public AuthSecurityQuestionsPage clickSecurityQuestionsButton() {

		try {
			btnSecurityQuestions.click();
			return new AuthSecurityQuestionsPage(webDriver);

		} catch (Exception e) {
			throw e;
		}
	}

}
