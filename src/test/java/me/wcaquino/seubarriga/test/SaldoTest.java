package me.wcaquino.seubarriga.test;

import me.wcaquino.seubarriga.core.BasePage;
import me.wcaquino.seubarriga.page.SaldoPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SaldoTest extends SaldoPage {
    @Test
    public void validoExistenciaDeSaldo(){
        loginBar("FirstNewTest@ggmail.com", "Teste@123");
        acessarHome();
        assertTrue(retornaSaldo("conta alterada"));
    }
}
// Ajusta elemento ele não está conseguindo pegar texto do saldo