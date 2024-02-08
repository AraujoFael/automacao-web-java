package me.wcaquino.seubarriga.suite;


import me.wcaquino.seubarriga.test.ContasTest;
import me.wcaquino.seubarriga.test.LoginTest;
import me.wcaquino.seubarriga.test.MovimentacaoTest;
import me.wcaquino.seubarriga.test.SaldoTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses ({
        LoginTest.class, // substitua com suas próprias classes de teste
        ContasTest.class, // substitua com suas próprias classes de teste
        MovimentacaoTest.class,
        SaldoTest.class
        // adicione mais classes de teste aqui
})
public class SuiteGeral {
}