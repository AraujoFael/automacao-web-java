package me.wcaquino.seubarriga.page;

import me.wcaquino.seubarriga.core.BaseTest;
import me.wcaquino.seubarriga.core.DriverCenter;
import me.wcaquino.seubarriga.selectors.MovimentacaoSelector;
import org.openqa.selenium.By;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MovimentacaoPage extends BaseTest {
    LocalDate dataHoje = LocalDate.now();
    MovimentacaoSelector mov = new MovimentacaoSelector();
    public void selecionarTipoMovimentacao(String txt){
       selecionarCombo(mov.tipoMovimentaacao, txt);

    }
    public void acessarAbaDeMovimentacao(){
         clicarBotao(mov.criarMovimentacaoBttn);
    }
    public void preencherData(){
        LocalDate dataHoje = LocalDate.now();
        escreve(mov.dataMovimentacao, dataHoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    public void preencherDataPagamento(){

        escreve(mov.dataPagamento, dataHoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
    public void preencherDataFutura(){
        escreve(mov.dataMovimentacao, retornaDataFutura());
    }
    public void preencherDescricao(String txt){
        escreve(mov.descricao, txt);
    }

    public void preencherInteressado(String txt){
        escreve(mov.interessado, txt);
    }
    public void preencherValor(String txt){
        escreve(mov.valor, txt);
    }
    public void adiconarConta(String txt){
        selecionarCombo(mov.conta, txt);
    }

    public void escolheStatus(String txt){
        if(txt == "Pago"){
            clicarBotao(mov.situacaoPago);
        }else{
            clicarBotao(mov.situacaoPendente);
        }

    }
    public void salvarMovimentacao(){
        clicarBotao(mov.bttnSalvar);
    }
    public String msgSucesso(){
        String txt = pegaTexto(mov.alertSucess);
        return txt;


    }
    public boolean validgaMsgDeErro(String msgDesejada){
        List <String> msgs = new ArrayList<>();

        for (int i = 1 ; i <= 6 ; i++ ){
            msgs.add(DriverCenter.getDriver().findElement(By.xpath("//div[@class='alert alert-danger']/ul/li["+i+"]")).getText());
        }

        for(int i = 0 ; i < msgs.size(); i++){
            if(msgs.contains(msgDesejada)== true){
                return true;
            }
        }
        return false;
    }

    public String msgDeFalha(){
        String txt = pegaTexto(mov.movimentacaoFutura);
        return txt;

    }
    public void acessarAbaResumoMensal(){
        clicarBotao(mov.resumoMensal);
    }
    public void excluirMovimentcao(String txt){
        obterCelula("Descrição",  txt,"Ações", mov.idTabela, mov.excluirMov );
    }

    public void selecionarDataMovimentacao(){
        List <String> meses = new ArrayList<>();
        meses.addAll(List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"));
        int mes =  dataHoje.getMonthValue();
        String txt = null;
        for (int i = 0 ; i <= meses.size(); i++){
            if(i + 1 == mes){
                txt = meses.get(i);
                break;
            }
        }
        selecionarCombo(mov.comboMes, txt);
    }
 public void selecionarAnoMovimentacao(){
        int ano = dataHoje.getYear();
        String anoSelecao = String.valueOf(ano);
        selecionarCombo(mov.comboAno, anoSelecao);
        clicarBotao(mov.buscarMovimentacao);
 }
    public String msgDeSucessoExclusao(){
        String txt = pegaTexto(mov.mensagemExclusaoSucesso);
        return txt;

    }
}
