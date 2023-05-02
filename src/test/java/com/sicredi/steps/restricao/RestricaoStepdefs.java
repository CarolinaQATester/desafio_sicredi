package com.sicredi.steps.restricao;

import java.util.HashMap;
import java.util.Map;

import com.sicredi.suporte.domain.Restricoes;
import org.apache.http.HttpStatus;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestricaoStepdefs {
    private  Map<String, String> cpfComRestricao = new HashMap<>();
    public static String cpfSemRestricoes = "63271443653";

    private Restricoes restricoes;


    @Quando("eu faço consulto o CPF sem restricao")
    public void eu_faço_consulto_o_cpf_sem_restricao() {
        given().when().get("restricoes/" + cpfSemRestricoes).then().log().all();
    }

    @Entao("valido seu retorno")
    public void valido_seu_retorno() {
        given().when().get("restricoes/" + cpfSemRestricoes).then().log().all().statusCode(HttpStatus.SC_NO_CONTENT);
    }


    @Quando("eu faço um GET para consultar com os seguntes CPF")
    public void eu_faço_um_GET_para_consultar_com_os_seguntes_CPF( Map<String, String> cpf) {
       cpfComRestricao = cpf;
       given().when().get("restricoes/" + cpfComRestricao).then().statusCode(HttpStatus.SC_OK);
    }



    @Entao("valido seu retorno o status")
    public void valido_seu_retorno_o_status() {
        given().when().get("restricoes/" + cpfComRestricao).then().log().all().statusCode(HttpStatus.SC_OK);
    }


    @Entao("mensagem O CPF {} tem problema")
    public void mensagem_O_CPF_tem_problema(String mensagem) {
        given().when().get("restricoes/" + cpfComRestricao).then().log().all().body("mensagem", is(mensagem));
    }


    
}
