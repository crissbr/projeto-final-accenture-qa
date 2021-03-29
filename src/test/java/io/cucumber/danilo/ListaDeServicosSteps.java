package io.cucumber.danilo;

import io.cucumber.danilo.servicos.Configuracao;
import io.cucumber.java.pt.*;
import static org.junit.Assert.*;

import java.util.List;

public class ListaDeServicosSteps{

    

    @Dado("clico no menu servicos")
    public void clico_no_menu_servicos() throws InterruptedException {
    
    Configuracao.cssSelector("div[data-id='primaryLink2_Servios']").click();
    Thread.sleep(5000);
    
    }

    @Entao("devo ver os servicos abaixo")
    public void devo_ver_os_servicos_abaixo(List<String> valores) {

    assertEquals(valores.toString(), "["+Configuracao.cssSelectors(".no-l3").get(1).getText().replace("\n", ", ")+"]");
       Configuracao.fechar();
    }
}