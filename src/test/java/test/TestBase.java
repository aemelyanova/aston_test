package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.AstonPage;
import pages.FillFormPage;
import pages.VerificationAddressPage;
import utils.RandomUtils;

import java.util.Map;


public class TestBase {
    AstonPage astonPage = new AstonPage();
    FillFormPage fillFormPage = new FillFormPage();
    RandomUtils randomUtils = new RandomUtils();
    VerificationAddressPage verificationAddressPage = new VerificationAddressPage();

    @BeforeAll
    static void configurationSiteDemoQa() {

        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.baseUrl = System.getProperty("baseUrl", "https://astondevs.ru/");
        Configuration.browserSize = System.getProperty("browserSize", "1980x1080");
        Configuration.browserVersion = System.getProperty("browserVersion", "100.0");
        Configuration.remote = System.getProperty("remote", "https://user1:1234@selenoid.autotests.cloud/wd/hub");
        Configuration.browserPosition = "0x0";
        Configuration.pageLoadStrategy = "eager";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}

