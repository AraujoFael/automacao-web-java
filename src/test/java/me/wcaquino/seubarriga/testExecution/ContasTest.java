package me.wcaquino.seubarriga.testExecution;

import me.wcaquino.seubarriga.page.ContasPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ContasTest extends ContasPage {
    @Test
    public void adicionarContaValida(){
        loginBar("FirstNewTest@ggmail.com", "Teste@123");
        clicarContas();
        acessarAdicionarContas();
        preencherCampoNome("tj988811*1");
        salvarNome();
        assertEquals("Conta adicionada com sucesso!", msgRetornoDeAcao());
        clicarContas();
        acessarListagem();
        clicarExcluirConta("tj988811*1");

    }
    @Test

    public void adicionarContaInvalidaMesmoNome(){
        loginBar("FirstNewTest@ggmail.com", "Teste@123");
        clicarContas();
        acessarAdicionarContas();
        preencherCampoNome("tj981*");
        salvarNome();
        clicarContas();
        acessarAdicionarContas();
        preencherCampoNome("tj981*");
        salvarNome();
        assertEquals("Já existe uma conta com esse nome!", msgRetornoDeAcao());
        clicarContas();
        acessarListagem();
        clicarExcluirConta("tj981*");

    }
    @Test
    public void alterarContaValida(){
        loginBar("FirstNewTest@ggmail.com", "Teste@123");
        clicarContas();
        acessarAdicionarContas();
        preencherCampoNome("tj971*18888");
        salvarNome();
        clicarContas();
        acessarListagem();
        clicarEditarConta("tj971*18888");
        preencherCampoNome("tj907112");
        salvarNome();
        assertEquals("Conta alterada com sucesso!", msgRetornoDeAcao());
        clicarContas();
        acessarListagem();
        clicarExcluirConta("tj907112");


    }
    @Test
    public void apagarConta(){
        loginBar("FirstNewTest@ggmail.com", "Teste@123");
        clicarContas();
        acessarAdicionarContas();
        preencherCampoNome("tj955*");
        salvarNome();
        clicarContas();
        acessarListagem();
        clicarExcluirConta("tj955*");
        assertEquals("Conta removida com sucesso!", msgRetornoDeAcao());
    }

    @Test
    public void apagarContaComMovimentacao(){
        loginBar("FirstNewTest@ggmail.com", "Teste@123");
        clicarContas();
        acessarListagem();
        clicarExcluirConta("conta alterada");
        assertEquals("Conta em uso na movimentações", msgRetornoDeAcao());
    }
   // configurações finais do projeto, parei no report do allure fazer projeto realizar a conversão de json para
    //Html, não está commitado colocar allure-results no git ignore
}
