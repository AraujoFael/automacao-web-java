package me.wcaquino.seubarriga.testExecution;

import me.wcaquino.seubarriga.page.LoginPage;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends LoginPage {

    @Test
    @DisplayName("Valida login de sucesso")
    public void loginDeSucesso(){
        preencheEmail("FirstNewTest@ggmail.com");
        preecheSenha("Teste@123");
        clickEntrar();
        assertEquals("Bem vindo, Teste First Araujo!", msgDeSucessLogin());

    }
    @Test
    @DisplayName("Valida login de senha invalida")
    public void loginSenhaInvalida(){
        preencheEmail("FirstNewTest@ggmail.com");
        preecheSenha("");
        clickEntrar();
        assertEquals("Senha é um campo obrigatório", msgDeErroSenha());
    }
    @Test
    @DisplayName("Valida login de email invalido")
    public void loginUsuarioInvalido(){
        preencheEmail("");
        preecheSenha("Teste@123");
        clickEntrar();
        assertEquals("Email é um campo obrigatório", msgDeErroEmail());

    }
    @Test
    @DisplayName("Valida login de email/senha invalido")
    public void loginInvalido(){
        preencheEmail("");
        preecheSenha("");
        clickEntrar();
        assertEquals("Email é um campo obrigatório", msgDeErroEmail());
        assertEquals("Senha é um campo obrigatório", msgDeErroSenha());
    }

}
