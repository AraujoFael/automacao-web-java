package me.wcaquino.seubarriga.suite;

import me.wcaquino.seubarriga.test.ContasTest;
import me.wcaquino.seubarriga.test.LoginTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.jupiter.api.Order;

@RunWith(JUnitPlatform.class)
@SelectClasses({ContasTest.class, LoginTest.class})
public class SuiteGeral {
    // realizar execução das classes, testes já estão independentes
}

