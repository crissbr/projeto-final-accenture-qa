package io.cucumber.equipe200;

import io.cucumber.equipe200.servicos.Configuracao;
import io.cucumber.java.pt.*;

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

    @Dado("clico em configuracoes de cookie")
    public void clico_em_configuracoes_de_cookie() {
        Configuracao.cssSelector("button[class='cookie-setting-link']").click();
    }

}