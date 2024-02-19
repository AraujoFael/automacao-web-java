package me.wcaquino.seubarriga.testExecution;


import me.wcaquino.seubarriga.page.MovimentacaoPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovimentacaoTest extends MovimentacaoPage {
    @Test
    public void movimentacaoComSucesso(){
        loginBar("FirstNewTest@ggmail.com", "Teste@123");
        acessarAbaDeMovimentacao();
        selecionarTipoMovimentacao("Receita");
        preencherData();
        preencherDataPagamento();
        preencherDescricao("Teste descrevendo2");
        preencherInteressado("Almeidinha2");
        preencherValor("456570");
        adiconarConta("conta alterada");
        escolheStatus("Pago");
        salvarMovimentacao();
        assertEquals("Movimentação adicionada com sucesso!", msgSucesso());
    }
    @Test
    public void validaCampoObrigatorioDataMovimentacao(){
        loginBar("FirstNewTest@ggmail.com", "Teste@123");
        acessarAbaDeMovimentacao();
        salvarMovimentacao();
        assertTrue(validgaMsgDeErro("Data da Movimentação é obrigatório"));
        assertTrue(validgaMsgDeErro("Data do pagamento é obrigatório"));
        assertTrue(validgaMsgDeErro("Descrição é obrigatório"));
        assertTrue(validgaMsgDeErro("Interessado é obrigatório"));
        assertTrue(validgaMsgDeErro("Valor é obrigatório"));
        assertTrue(validgaMsgDeErro("Valor deve ser um número"));

    }
    @Test
    public void validaImpossibilidadeMovimentacaoDataFutura(){
        loginBar("FirstNewTest@ggmail.com", "Teste@123");
        acessarAbaDeMovimentacao();
        selecionarTipoMovimentacao("Receita");
        preencherDataFutura();
        preencherDataFutura();
        preencherDescricao("Teste descrevendo");
        preencherInteressado("Almeidinha");
        preencherValor("456570");
        adiconarConta("conta alterada");
        escolheStatus("Pago");
        salvarMovimentacao();
        assertEquals("Data da Movimentação deve ser menor ou igual à data atual", msgDeFalha());
    }
    @Test
    public void validaRemocaoDeMovimentacao(){
        loginBar("FirstNewTest@ggmail.com", "Teste@123");
        acessarAbaDeMovimentacao();
        selecionarTipoMovimentacao("Receita");
        preencherData();
        preencherDataPagamento();
        preencherDescricao("Teste descrevendo2");
        preencherInteressado("Almeidinha2");
        preencherValor("456570");
        adiconarConta("conta alterada");
        escolheStatus("Pago");
        salvarMovimentacao();
        acessarAbaResumoMensal();
        selecionarDataMovimentacao();
        selecionarAnoMovimentacao();
        excluirMovimentcao("Teste descrevendo2");
        assertEquals("Movimentação removida com sucesso!", msgDeSucessoExclusao());



    }
}
