package com.xero.ui.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.xero.util.BasePageObject;

public class QuotesPage extends BasePageObject {

	@FindBy(how = How.ID, using = "button-1024-btnInnerEl")
	private WebElement btnNewQuote;
	
	public QuotesPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	public NewQuotePage clickNewQuoteButton() throws Exception {

		try {
			Thread.sleep(5000);
			btnNewQuote.click();
			return new NewQuotePage(webDriver);

		} catch (Exception e) {
			throw e;
		}
	}

}
