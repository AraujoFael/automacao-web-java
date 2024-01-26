package me.wcaquino.seubarriga.page;

import me.wcaquino.seubarriga.core.BaseTest;
import me.wcaquino.seubarriga.selectors.SaldoSelector;
import org.openqa.selenium.WebElement;

public class SaldoPage extends BaseTest {

    SaldoSelector saldo = new SaldoSelector();
    public Boolean retornaSaldo(String txt){
         WebElement valorColuna = obterCelulaApenasOvalor("Conta", txt, "Saldo",saldo.tabelaSaldo);
         String saldoConta = valorColuna.getText();
         Double valorColunaConvertido = Double.parseDouble(saldoConta);
         return valorColunaConvertido != 0 ;
    }
    public void acessarHome(){
        clicarBotao(saldo.acessarHome);
    }
}
