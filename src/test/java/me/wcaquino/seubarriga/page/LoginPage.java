package me.wcaquino.seubarriga.page;

import me.wcaquino.seubarriga.core.BaseTest;
import me.wcaquino.seubarriga.selectors.LoginSelector;


public class LoginPage extends BaseTest {
        LoginSelector loginSelector = new LoginSelector();
    public void preencheEmail (String txt){
        escreve(loginSelector.email, txt);


    }

    public void preecheSenha(String pass){

        escreve(loginSelector.password, pass);


    }
    public void clickEntrar(){
        clicarBotao(loginSelector.enterButtom);
    }

    public String msgDeErroSenha() {
        String txt;
        txt = pegaTexto(loginSelector.msgErrorSenha);
        return txt;

    }
    public String msgDeErroEmail() {
        String txt;
        txt = pegaTexto(loginSelector.msgErrorEmail);
        return txt;

    }
    public String msgDeSucessLogin() {
        String txt;
        txt = pegaTexto(loginSelector.msgSucessLogin);
        return txt;

    }
}