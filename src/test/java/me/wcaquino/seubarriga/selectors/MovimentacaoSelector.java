package me.wcaquino.seubarriga.selectors;

import org.openqa.selenium.By;

public class MovimentacaoSelector {


    public By tipoMovimentaacao = By.cssSelector("#tipo");
    public By dataMovimentacao = By.cssSelector("#data_transacao");
    public By dataPagamento = By.cssSelector("#data_pagamento");
    public By descricao = By.cssSelector("#descricao");
    public By interessado = By.cssSelector("#interessado");
    public By valor = By.cssSelector("#valor");
    public By conta = By.cssSelector("#conta");

    public By criarMovimentacaoBttn = By.xpath("//li/a[contains(text(),'Criar Movimentação')]");

    public By situacaoPago = By.id("status_pago");

    public By situacaoPendente = By.id("status_pendente");

    public By bttnSalvar = By.cssSelector(".btn");

    public By alertSucess = By.cssSelector(".alert");

    public By movimentacaoFutura = By.xpath("//div[@class='alert alert-danger']/ul/li[1]");

    public By resumoMensal = By.xpath("//li/a[contains(text(),'Resumo Mensal')]");

    public By idTabela = By.id("tabelaExtrato");

    public By excluirMov = By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']");

    public By comboMes = By.id("mes");

    public By comboAno = By.id("ano");

    public By buscarMovimentacao = By.cssSelector(".btn");

    public By mensagemExclusaoSucesso = By.cssSelector(".alert");
}