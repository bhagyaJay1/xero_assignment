package com.xero.util;

import org.openqa.selenium.WebDriver;

import com.xero.ui.parts.TopHeaderPart;

public abstract class BasePageObject {

	protected static WebDriver webDriver;

	public BasePageObject(WebDriver webDriver) {
		BasePageObject.webDriver = webDriver;
	}
		
	public String getPageTitle() throws Exception {

		try {
			return webDriver.getTitle();

		} catch (Exception e) {
			throw e;
		}
	}
	
	public TopHeaderPart getTopHeaderPart() {
		return new TopHeaderPart(webDriver);
	}

}
