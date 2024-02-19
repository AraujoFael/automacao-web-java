package me.wcaquino.seubarriga.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverCenter {

    private static WebDriver driver; // Importa o driver no modelo privado

    public enum Browsers{
        CHROME,
        FIREFOX
    }
    public static Browsers browsers = Browsers.CHROME;

    private DriverCenter(){} // Gera um construtor para ter acesso ao driver porem privado

    public static WebDriver getDriver(){ // Aqui gera um get para o construtor privado
        // Aqui ele se o driver está ativo se não ele gera um novo driver se sim ele retorna o driver ativo




        if(driver == null ){
            switch (browsers){

                case FIREFOX:
                    FirefoxOptions options = new FirefoxOptions();
                    options.addArguments("--headless=true");// Aqui ele instancia a class ChromeOptios e usa o add aarguments
                    // Assim passando para rodar em headless
                    driver = new FirefoxDriver(options);
                case CHROME:
                    ChromeOptions optionsChrome = new ChromeOptions();
                    optionsChrome.addArguments("--headless=true");// Aqui ele instancia a class ChromeOptios e usa o add aarguments
                    // Assim passando para rodar em headless
                   driver = new ChromeDriver(optionsChrome);
                // driver = new ChromeDriver();
            }

        }

        return driver;


    }
    public static void KillDriver(){
        if(driver != null){ // Aqui ele ve se o driver existe se ele existir ele mata o driver
            driver.quit();
            driver = null;
        }

    }


}
