package me.wcaquino.seubarriga.utils;

import me.wcaquino.seubarriga.selectors.LoginSelector;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInfo;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import static me.wcaquino.seubarriga.core.DriverCenter.getDriver;




public class Utils {
    static LoginSelector selector = new LoginSelector();
    public static  String retornaDataFutura(){
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyy");
        LocalDate diaFuturo = hoje.plusDays(2);
        String amanha = diaFuturo.format(formatadorData);
        return amanha;

    }
    public static void loginBar(String email, String password){
        getDriver().findElement(selector.email).sendKeys(email);
        getDriver().findElement(selector.password).sendKeys(password);
        getDriver().findElement(selector.enterButtom).click();
    }
    public static String retornaDataAtualEmString(){
        LocalDateTime dataAgora = LocalDateTime.now();
        String dataConvertida = String.valueOf(dataAgora.getSecond());
        return dataConvertida;

    }
    public static void printDaTela(String currentTestName){

            if (getDriver() instanceof TakesScreenshot) {
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
    }
}
