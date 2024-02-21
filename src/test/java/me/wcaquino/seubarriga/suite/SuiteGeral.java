package me.wcaquino.seubarriga.suite;


import me.wcaquino.seubarriga.testExecution.ContasTest;
import me.wcaquino.seubarriga.testExecution.LoginTest;
import me.wcaquino.seubarriga.testExecution.MovimentacaoTest;
import me.wcaquino.seubarriga.testExecution.SaldoTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({ContasTest.class, LoginTest.class, MovimentacaoTest.class, SaldoTest.class})
public class SuiteGeral  {
}