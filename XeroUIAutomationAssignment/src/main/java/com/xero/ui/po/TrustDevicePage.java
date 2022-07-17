package com.xero.ui.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.xero.util.BasePageObject;

public class TrustDevicePage extends BasePageObject {

	// Element//
	@FindBy(how = How.XPATH, using = "//button[text()='Use a backup method instead']")
	private WebElement btnBackUpMethod;
	
	public TrustDevicePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	
    /**
     * method to direct to the auth type selection for two factor authentication
     */
	public AuthTypeSelectionPage clickBackUpMethodButton() {

		try {
			btnBackUpMethod.click();
			return new AuthTypeSelectionPage(webDriver);

		} catch (Exception e) {
			throw e;
		}
	}

}
