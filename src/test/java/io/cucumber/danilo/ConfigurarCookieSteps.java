package io.cucumber.danilo;

import io.cucumber.java.pt.*;

import io.cucumber.danilo.servicos.Configuracao;

public class ConfigurarCookieSteps{

    @Dado("aceito os termos LGPD")
    public void aceito_os_termos_LGPD() {
        Configuracao.cssSelector("button[class='cookie-setting-link']").click();
    }

    @Entao("deve fechar a caixa de informacao")
    public void deve_fechar_a_caixa_de_informacao() throws InterruptedException{ 
        Thread.sleep(5000);
        Configuracao.cssSelector(".onetrust-close-btn-handler").click();
        Configuracao.fechar();
        
    }
        
}