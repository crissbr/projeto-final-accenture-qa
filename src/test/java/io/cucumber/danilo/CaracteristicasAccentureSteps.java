package io.cucumber.danilo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import io.cucumber.danilo.servicos.Configuracao;
import io.cucumber.java.pt.*;
import static org.junit.Assert.*;

public class CaracteristicasAccentureSteps{
	
    @Dado("clico no menu sobre a accenture")
    public void clico_no_menu_sobre_a_accenture() {        
        Configuracao.cssSelector("div[data-target='#primaryLink5_SobreaAccenture']").click();
    }
    
    @Dado("clico no item do menu sobre a accenture")
    public void clico_no_item_do_menu_sobre_a_accenture() throws InterruptedException {
        Thread.sleep(5000);
        Configuracao.cssSelector("a[aria-label='Sobre a Accenture']").click();
    }

    @Entao("devo ver o destaque em {string}")
    public void devo_ver_o_destaque_em(String string) throws InterruptedException  {
        Thread.sleep(5000);
        assertEquals(string, Configuracao.cssSelector(".sectionTitle").getText()); 
        Configuracao.fechar();       
    }

}