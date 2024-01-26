package me.wcaquino.seubarriga.page;

import me.wcaquino.seubarriga.core.BaseTest;
import me.wcaquino.seubarriga.selectors.ContasSelector;
import org.openqa.selenium.By;

public class ContasPage extends BaseTest {
    ContasSelector contaSelector = new ContasSelector();

    public void clicarContas(){
        clicarBotao(contaSelector.bttnContas);

    }
    public void acessarAdicionarContas(){
        clicarBotao(contaSelector.adicionarContas);

    }
    public void preencherCampoNome(String txt){
        escreve(contaSelector.campoNome,txt);
    }

    public void salvarNome(){
        clicarBotao(contaSelector.btnSalvar);

    }

    public void acessarListagem(){
        clicarBotao(contaSelector.listarContas);
    }


public String msgRetornoDeAcao() {
    String txt;
    txt = pegaTexto(contaSelector.msgSucesso);
    return txt ;
}


public void  clicarExcluirConta(String string){
        obterCelula("Conta", string, "Ações", contaSelector.tabela, contaSelector.bttnExcluir);
}
    public void  clicarEditarConta(String string){
        obterCelula("Conta", string, "Ações", contaSelector.tabela, contaSelector.bttnEditar);
    }


}