package com.xero.util;

import org.openqa.selenium.WebDriver;

import com.xero.ui.po.AuthSecurityQuestionsPage;
import com.xero.ui.po.AuthTypeSelectionPage;
import com.xero.ui.po.DashBoardPage;
import com.xero.ui.po.LoginPage;
import com.xero.ui.po.NewInvoicePage;
import com.xero.ui.po.NewQuotePage;
import com.xero.ui.po.QuotesPage;
import com.xero.ui.po.TrustDevicePage;
import com.xero.ui.po.ViewQuotePage;
import com.xero.ui.po.WelcomePage;

public class BaseTestObject {
	
	public static WebDriver driver;
	public static String browser;

	protected WelcomePage welcomePage; 
	protected LoginPage loginPage;
	protected TrustDevicePage trustDevicePage;
	protected AuthTypeSelectionPage authTypeSelectionPage;
	protected AuthSecurityQuestionsPage authSecurityQuestionsPage;
	protected DashBoardPage dashBoardPage; 
	protected QuotesPage quotesPage;
	protected NewQuotePage newQuotePage;
	protected ViewQuotePage viewQuotePage;
	protected NewInvoicePage newInvoicePage;
}
