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


public class BaseTest extends BasePage {


    static LoginSelector selector = new LoginSelector();

    @BeforeEach
    public void inicializa(){
        getDriver().get("https://seubarriga.wcaquino.me/login");
        //loginBar("FirstNewTest@ggmail.com", "Teste@123");

    }
    @AfterEach
    public  void finaliza(TestInfo testInfo){
        if (getDriver() instanceof TakesScreenshot) {
            String currentTestName = testInfo.getTestMethod().get().getName();
            File screenshotFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            String screenshotFileName = "screenshot_" + currentTestName + ".png";

            try {
                // Criar a pasta "evidências" se ela não existir
                Path evidenciasPath = Paths.get("target/evidências");
                if (!Files.exists(evidenciasPath)) {
                    Files.createDirectories(evidenciasPath);
                }

                // Salvar o screenshot na pasta "evidências"
                Path screenshotPath = evidenciasPath.resolve(screenshotFileName);
                Files.copy(screenshotFile.toPath(), screenshotPath, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        KillDriver();


    }




}
