package me.wcaquino.seubarriga.suite;


import me.wcaquino.seubarriga.testExecution.ContasTest;
import me.wcaquino.seubarriga.testExecution.LoginTest;
import me.wcaquino.seubarriga.testExecution.MovimentacaoTest;
import me.wcaquino.seubarriga.testExecution.SaldoTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({ContasTest.class, LoginTest.class, MovimentacaoTest.class, SaldoTest.class})
public class SuiteGeral  {
    /*1- Ajustar execução geral
     2- Reasistir aula para rodar a automação com o selenium grid
     3- Refatorar instanciação do driver do firefox*/
}