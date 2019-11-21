/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

// Use firefox as the default
// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
driver = { new ChromeDriver() }
//driver = { new PhantomJSDriver() }

environments {

	// run as â€œgradle -Dgeb.env=chrome cucumberâ€�
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	/*firefox {
		DesiredCapabilities capabilities =  DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
        capabilities.setCapability("networkConnectionEnabled", true);
        capabilities.setCapability("browserConnectionEnabled", true);
		capabilities.setJavascriptEnabled(true);
				
  		driver = { new FirefoxDriver(capabilities) }		
	}*/

	// run as â€œgradle -Dgeb.env=phantomjs cucumberâ€�
	// See: https://github.com/detro/ghostdriver
	phantomjs {
		driver = { new PhantomJSDriver() }
	}

	chrome {
		driver =  { new ChromeDriver() }
  	}

	ie {
    	driver = {new InternetExplorerDriver()}
  	}

	chromeheadless {
	  	//driver =  { new ChromeDriver() }
	    ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.addArguments("--headless");
		//chromeOptions.addArguments("--ignore-certificate-errors");
		chromeOptions.addArguments("--allow-insecure-localhost");
		chromeOptions.addArguments("--allow-running-insecure-content");		
		chromeOptions.addArguments("--disable-machine-cert-request");		
		chromeOptions.addArguments("--ignore-certificate-errors-spki-list");
		chromeOptions.addArguments("--ignore-urlfetcher-cert-requests");
		chromeOptions.addArguments("--incognito");
		chromeOptions.addArguments("--allow-external-pages");
		chromeOptions.addArguments("--ignore-user-profile-mapping-for-tests");
		chromeOptions.addArguments("--disable-gpu");
		

	    driver = {new ChromeDriver(chromeOptions)};
  	}

	chromeheadlessPipeline {
	  	//driver =  { new ChromeDriver() }
	    ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.addArguments("--headless");
		//chromeOptions.addArguments("--ignore-certificate-errors");
		chromeOptions.addArguments("--allow-insecure-localhost");
		chromeOptions.addArguments("--allow-running-insecure-content");		
		chromeOptions.addArguments("--disable-machine-cert-request");		
		chromeOptions.addArguments("--ignore-certificate-errors-spki-list");
		chromeOptions.addArguments("--ignore-urlfetcher-cert-requests");
		chromeOptions.addArguments("--incognito");
		chromeOptions.addArguments("--allow-external-pages");
		chromeOptions.addArguments("--ignore-user-profile-mapping-for-tests");
		chromeOptions.addArguments("--disable-gpu");
		

	    driver = {new ChromeDriver(chromeOptions)};
		
		baseUrl = "https://submarino.com.br"
  	}
	baseUrl = "https://submarino.com.br"
}

baseNavigatorWaiting = true
