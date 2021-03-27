package io.cucumber.danilo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import io.cucumber.danilo.servicos.Configuracao;
import io.cucumber.java.pt.*;
import static org.junit.Assert.*;

public class ListaDeCarreirasSteps{

    @Dado("clico no menu carreiras")
    public void clico_no_menu_carreiras() {
        Configuracao.cssSelector("div[data-target='#primaryLink4_Carreiras']").click();
    }

    @Dado("clico no item do menu vagas em tecnologia")
    public void clico_no_item_do_menu_vagas_em_tecnologia() throws InterruptedException {
        Thread.sleep(5000);
        Configuracao.cssSelector("a[aria-label='Vagas em tecnologia']").click();
    }
    
    @Entao("devo ver o destaque {string}")
    public void devo_ver_o_destaque(String string) throws InterruptedException  {
        Thread.sleep(5000);
        assertEquals(string, Configuracao.cssSelector(".page-title-long").getText()); 
        Configuracao.fechar();       
    }

    @Dado("digito no campo de busca {string}")
    public void digito_no_campo_de_busca(String string) {
        Configuracao.cssSelector("a[href='/br-pt/search/results']").click();
        Configuracao.id("search-form-label").sendKeys(string); 
    }

    @Dado("clico no botao procurar")
    public void clico_no_botao_procurar()throws InterruptedException  {
        Configuracao.cssSelector("button[class='btn btn-primary col-xs-2']").click();
        //Foi necessario implementar um refresh no browser devido problemas no tempo de retorno da busca
        Configuracao.browser.navigate().refresh();
    }

    @Entao("devo encontrar vagas para programadores")
    public void devo_encontrar_vagas_para_programadores() {
        assertTrue(Configuracao.cssSelectors(".search-results-container").size() > 0); 
        Configuracao.fechar(); 
    }
}