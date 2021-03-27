package io.cucumber.danilo.servicos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Configuracao {

    public static WebDriver browser;

    public static void abrir(String url) {
        if (browser == null) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            browser = new ChromeDriver();
        }
        
        browser.get(url);
        browser.manage().window().maximize();

    }

    public static void fechar() {
        browser.close();
    }

    public static WebElement cssSelector(String selector) {
		return browser.findElement(By.cssSelector(selector));
	}
	
	// public static List<WebElement> cssSelectors(String selector) {
	// 	return browser.findElements(By.cssSelector(selector));
	// }

	public static WebElement id(String selector) {
		return browser.findElement(By.id(selector));
	}

}
