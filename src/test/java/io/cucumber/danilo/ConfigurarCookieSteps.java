package io.cucumber.danilo;

import io.cucumber.java.pt.*;
import static org.junit.Assert.*;

import io.cucumber.danilo.servicos.Configuracao;

public class ConfigurarCookieSteps{


    @Entao("deve fechar a caixa de informacao")
    public void deve_fechar_a_caixa_de_informacao() throws InterruptedException{ 
        Thread.sleep(5000);
        Configuracao.cssSelector(".onetrust-close-btn-handler").click();
        Configuracao.fechar();
        
    }


    @Entao("devo ver o item de {string}")
    public void devo_ver_o_item_de(String string) throws InterruptedException{
        Thread.sleep(5000);
        assertEquals(string, Configuracao.id("privacy-text").getText()); 
        
    }

    @Entao("devo ver {string}")
    public void devo_ver(String string) throws InterruptedException{
        assertEquals(string, Configuracao.id("ot-header-id-"+Configuracao.numero(string)).getText());
        Thread.sleep(5000);
        
        if (string.equals("Cookies de Publicidade e Redes Sociais")){
            Configuracao.fechar();
        }

        
        
    }
            
}