package io.cucumber.danilo;

import io.cucumber.java.pt.*;

import io.cucumber.danilo.servicos.Configuracao;

public class CompartilhadoSteps {


    @Dado("que eu estou no site da accenture")
    public void que_eu_estou_no_site_da_accenture() {
        Configuracao.abrir("https://www.accenture.com/br-pt");
    }

}