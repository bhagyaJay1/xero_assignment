package com.xero.ui.po;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.xero.util.BasePageObject;

public class DashBoardPage extends BasePageObject {

	@FindBy(how = How.CLASS_NAME, using = "xnav-header--main")
	private WebElement topNavigation;

	public DashBoardPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean isTopNavigationDisplayed(int timeout) {

		try {
			Wait wait = new FluentWait(webDriver).withTimeout(Duration.ofSeconds(timeout))
					.pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);

			wait.until(ExpectedConditions.visibilityOf(topNavigation));
			return true;

		} catch (NoSuchElementException e) {
			return false;
		} catch (Exception e) {
			throw e;
		}
	}

}
