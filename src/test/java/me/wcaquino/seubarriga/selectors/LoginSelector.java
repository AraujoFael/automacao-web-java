package me.wcaquino.seubarriga.selectors;

import org.openqa.selenium.By;

public class LoginSelector {

    public By email = By.id("email");
    public By password = By.id("senha");

    public By enterButtom = By.xpath("//button[@class='btn btn-primary']");

    public By msgErrorEmail = By.xpath("//div[contains(text(),'Email é um campo obrigatório')]");

    public By msgErrorSenha = By.xpath("//div[contains(text(),'Senha é um campo obrigatório')]");

    public By msgSucessLogin = By.cssSelector(".alert-success");
}
