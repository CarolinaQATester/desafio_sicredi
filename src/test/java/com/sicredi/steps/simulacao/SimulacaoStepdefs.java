package com.sicredi.steps.simulacao;


import com.sicredi.util.Payload;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Assert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class SimulacaoStepdefs {


    @Dado("eu realizo um cadastro uma nova simulacao")
    public void eu_realizo_um_cadastro_uma_nova_simulacao() {
            String payload = Payload.getCriacaoPayload("Anthony Kevin Antonio Ramos", "29285406793", "anthony.kevin.ramos@nogueiramoura.adv.br", 1000, 4, true);
            System.out.println(payload);
            given().contentType(ContentType.JSON).body(payload).when().post("/simulacoes").then().log().all().contentType(ContentType.JSON).statusCode(HttpStatus.SC_CREATED);
    }


    @Entao("valido seu retorno {int}")
    public void valido_seu_retorno(Integer status) {

    }

    @Quando("insiro o valor nulo")
    public void insiro_o_valor_nulo() {
        String payload = Payload.getCriacaoPayload("Anthony Kevin Antonio Ramos", "29285406793", "anthony.kevin.ramos@nogueiramoura.adv.br", 0, 4, true);
        System.out.println(payload);
        given().contentType(ContentType.JSON).body(payload).when().post("/simulacoes").then().log().all().contentType(ContentType.JSON).statusCode(HttpStatus.SC_CREATED);
    }

    @Quando("inserir dados para cadastro de simulação com CPF já cadastrado")
    public void inserir_dados_para_cadastro_de_simulação_com_cpf_já_cadastrado() {
        String payload = Payload.getCriacaoPayload("Anthony Kevin Antonio Ramos", "29285406793", "anthony.kevin.ramos@nogueiramoura.adv.br", 1000, 4, true);
        System.out.println(payload);
        given().contentType(ContentType.JSON).body(payload).when().post("/simulacoes").then().log().all().contentType(ContentType.JSON).statusCode(HttpStatus.SC_CREATED);
    }

    @Então("deve validar mensangem {string}")
    public void deve_validar_mensangem(String msg) {
        msg = "CPF já existente";
       Assert.assertEquals(msg, is("CPF já existente"));
    }


    @Entao("valido seu retorno")
    public void valido_seu_retorno() {
        String payload = Payload.getCriacaoPayload("Anthony Kevin Antonio Ramos", "29285406793", "anthony.kevin.ramos@nogueiramoura.adv.br", 0, 4, true);
        System.out.println(payload);
        given().contentType(ContentType.JSON).body(payload).when().put("/simulacoes/{cpf}").then().log().all().contentType(ContentType.JSON).statusCode(HttpStatus.SC_OK);
    }

    @Quando("insiro o valor cpf que não tem uma simulacao")
    public void insiro_o_valor_cpf_que_não_tem_uma_simulacao() {
        String payload = Payload.getCriacaoPayload("Anthony Kevin Antonio Ramos", "95180195250", "anthony.kevin.ramos@nogueiramoura.adv.br", 0, 4, true);
        System.out.println(payload);
        given().contentType(ContentType.JSON).body(payload).when().put("/simulacoes/{cpf}").then().log().all().contentType(ContentType.JSON).statusCode(HttpStatus.SC_NOT_FOUND);
    }

    @Entao("mensagem {string}")
    public void mensagem(String msg) {
        msg = "CPF não encontrado";
        Assert.assertEquals(msg, is("CPF não encontrado"));
    }


    @Dado("que eu tenha um cadastro")
    public void que_eu_tenha_um_cadastro() {
        String payload = Payload.getCriacaoPayload("Anthony Kevin Antonio Ramos", "95180195250", "anthony.kevin.ramos@nogueiramoura.adv.br", 1000, 4, true);
        System.out.println(payload);
        given().body(payload).when().get("/simulacoes").then().log().all().extract().path("id");

    }

    @Quando("realizo a exclusao de uma simulacao")
    public void realizo_a_exclusao_de_uma_simulacao() {
        String payload = Payload.getCriacaoPayload("Anthony Kevin Antonio Ramos", "95180195250", "anthony.kevin.ramos@nogueiramoura.adv.br", 1000, 4, true);
        System.out.println(payload);
        long id = given().body(payload).when().get("/simulacoes").then().log().all().extract().path("id");
        given().when().delete("/simulacoes/" + id).then().log().all().statusCode(HttpStatus.SC_OK);
    }


    @Dado("que eu tenho id que foi excluido")
    public void que_eu_tenho_id_que_foi_excluido() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("e tento excluir novamente")
    public void e_tento_excluir_novamente() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Dado("que eu realize um consulta")
    public void que_eu_realize_um_consulta() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Quando("realizo a consulta")
    public void realizo_a_consulta() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("valido o retorno da consulta")
    public void valido_o_retorno_da_consulta() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Entao("valido o status {int} nao existe simulacao")
    public void valido_o_status_nao_existe_simulacao(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Quando("realizo a busca por cpf")
    public void realizo_a_busca_por_cpf() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
