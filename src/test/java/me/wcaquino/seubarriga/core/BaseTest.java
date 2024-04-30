package me.wcaquino.seubarriga.core;


import me.wcaquino.seubarriga.selectors.LoginSelector;
import org.junit.jupiter.api.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static me.wcaquino.seubarriga.core.DriverCenter.*;

/**
 * Esta classe é a base para todos os testes do projeto SeuBarriga.
 * Ela fornece métodos comuns e configurações para os testes.
 * - Seletor para a página de login
 * - Método executado antes de cada teste para inicializar o navegador e abrir a página de login
 * - Método executado após cada teste para tirar um screenshot em caso de falha e encerrar o navegador
 */


public class BaseTest extends BasePage {


    static LoginSelector selector = new LoginSelector();

    @BeforeEach
    public void inicializa() {
        getDriver().get("https://seubarriga.wcaquino.me/login");
        //loginBar("FirstNewTest@ggmail.com", "Teste@123");

    }

    @AfterEach
    public void finaliza(TestInfo testInfo) {
        if (getDriver() instanceof TakesScreenshot) {
            String currentTestName = testInfo.getTestMethod().get().getName();
            File screenshotFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            String screenshotFileName = "screenshot_" + currentTestName + ".png";

            try {
                Path evidenciasPath = Paths.get("target/evidências");
                if (!Files.exists(evidenciasPath)) {
                    Files.createDirectories(evidenciasPath);
                }

                Path screenshotPath = evidenciasPath.resolve(screenshotFileName);
                Files.copy(screenshotFile.toPath(), screenshotPath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        KillDriver();

    }


}