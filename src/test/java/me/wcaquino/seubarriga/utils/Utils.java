package me.wcaquino.seubarriga.utils;

import me.wcaquino.seubarriga.selectors.LoginSelector;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import static me.wcaquino.seubarriga.core.DriverCenter.getDriver;




public class Utils {
    static LoginSelector selector = new LoginSelector();
    public static  String retornaDataFutura(){
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate diaFuturo = hoje.plusDays(2);
        String amanha = diaFuturo.format(formatadorData);
        return amanha;

    }
    public static void loginBar(String email, String password){
        getDriver().findElement(selector.email).sendKeys(email);
        getDriver().findElement(selector.password).sendKeys(password);
        getDriver().findElement(selector.enterButtom).click();
    }
    //public static void adicionarConta()
}
