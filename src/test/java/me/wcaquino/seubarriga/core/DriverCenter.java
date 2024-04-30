package me.wcaquino.seubarriga.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Esta classe gerencia o WebDriver utilizado nos testes. Ela fornece métodos para obter uma instância do WebDriver
 * e para encerrar o WebDriver quando não for mais necessário.
 * - Instância estática do WebDriver
 * - Enumeração dos navegadores suportados
 * - Método para obter uma instância do WebDriver
 * - Método para encerrar o WebDriver
 */
public class DriverCenter {

    private static WebDriver driver;

    public enum Browsers {
        CHROME,
        FIREFOX
    }

    public static Browsers browsers = Browsers.CHROME;

    private DriverCenter() {
    }

    public static WebDriver getDriver() {

        if (driver == null) {
            switch (browsers) {

                case FIREFOX:
                    FirefoxOptions options = new FirefoxOptions();
                    options.addArguments("--headless=true");
                    driver = new FirefoxDriver(options);
                case CHROME:
                    ChromeOptions optionsChrome = new ChromeOptions();
                    optionsChrome.addArguments("--headless=true");
                    driver = new ChromeDriver(optionsChrome);

            }

        }

        return driver;


    }

    public static void KillDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }


}
