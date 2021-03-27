package io.cucumber.danilo;

import io.cucumber.java.pt.*;

import io.cucumber.danilo.servicos.Configuracao;

public class CompartilhadoSteps {
    @Dado("que eu estou no site da accenture")
    public void que_eu_estou_no_site_da_accenture() throws InterruptedException {
        Thread.sleep(5000);
        Configuracao.abrir("https://www.accenture.com/br-pt");
    }

    @Dado("fechar o cookie")
    public void fechar_o_cookie() throws InterruptedException{
        Thread.sleep(5000);
        Configuracao.cssSelector("button[class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']").click();
    }

}