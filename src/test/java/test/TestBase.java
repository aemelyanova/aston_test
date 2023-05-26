package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.AstonPage;
import pages.FillFormPage;
import pages.VerificationAddressPage;
import utils.RandomUtils;


public class TestBase {
    AstonPage astonPage = new AstonPage();
    FillFormPage fillFormPage = new FillFormPage();
    RandomUtils randomUtils = new RandomUtils();
    VerificationAddressPage verificationAddressPage = new VerificationAddressPage();

    @BeforeAll
    static void beforeAll() {
//        Configuration.baseUrl = "https://astondevs.ru/";
        Configuration.browserSize = "1980x1080";
//     //   $(".CookiesPolicy-module--button--JZrW1").click(); // это наверно в пейдж

    }
}

