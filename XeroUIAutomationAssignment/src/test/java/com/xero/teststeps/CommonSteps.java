package com.xero.teststeps;

import java.time.Duration;

import com.xero.util.BaseTestObject;
import com.xero.util.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonSteps extends BaseTestObject {
	
	
	
	@Before
	public void startUp() {
		Config.setConfigFilePath("/config/config.cfg");
		browser = (System.getProperty("browser") == null)? Config.getProperty("default.browser") : System.getProperty("browser");
		System.out.println("Browser is - " + browser);
		driver = WebDriverManager.getInstance(browser).create();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(Config.getProperty("url"));
	}
	
	@After
	public void tearDown() throws InterruptedException {

		if(driver != null) {
			driver.close();
			driver.quit();
		}
	}
	
}
