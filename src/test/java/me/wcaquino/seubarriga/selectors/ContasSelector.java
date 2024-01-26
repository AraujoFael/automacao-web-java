package me.wcaquino.seubarriga.selectors;

import org.openqa.selenium.By;

public class ContasSelector {
    public By bttnContas = By.cssSelector(".dropdown");
    public By adicionarContas = By.cssSelector(".dropdown-menu li");

    public By campoNome = By.cssSelector("#nome");

    public By btnSalvar = By.cssSelector(".btn ");

    public By listarContas = By.cssSelector(".dropdown-menu li:nth-child(2)");

    public By msgSucesso = By.cssSelector(".alert");

    public By tabela = By.id("tabelaContas");

    public By bttnExcluir = By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']");

    public By bttnEditar = By.xpath(".//span[@class='glyphicon glyphicon-edit']");

}
