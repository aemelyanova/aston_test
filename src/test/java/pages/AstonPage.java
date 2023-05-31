package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AstonPage {
    SelenideElement
            mainPageTitle = $(".TitleWith-module--container--EFW0t"),
            technologyButton = $("[tabindex=Технологии]"),
            technologyJava = $(".SubMenu-module--left--R5vB-"),
            headerPage = $("#intro"),
            servicesButton = $("[tabindex=Услуги]"),
            careerSection = $("[tabindex=Карьера]"),
            section = $("#gatsby-focus-wrapper"),
            ourServicesSection = $(byTagAndText("h2", "Наши услуги")),
            qaAudit = $("#page-interlinking-tab-1"),
            descriptionQaAudit = $("#page-interlinking-panel-1");


    public AstonPage openPage() {
        open("https://astondevs.ru/");

        return this;
    }

    public AstonPage checkMainPageTitle(String value) {
        mainPageTitle.shouldHave(text(value));

        return this;
    }

    public AstonPage hoverTechnologyButton() {
        technologyButton.hover();

        return this;
    }

    public AstonPage clickTechnologyJava(String value) {
        technologyJava.$(byText(value)).click();

        return this;
    }

    public AstonPage checkHeaderJava(String value) {
        headerPage.shouldHave(text(value));

        return this;
    }

    public AstonPage hoverCareerSection() {
        careerSection.hover();

        return this;
    }

    public AstonPage clickInternship(String value) {
        section.$(byText(value)).click();

        return this;
    }

    public AstonPage checkingTextInternship(String value) {
        headerPage.shouldHave(text(value));

        return this;
    }

    public AstonPage hoverServiceButton() {
        servicesButton.hover();

        return this;
    }

    public AstonPage clickQualityControl(String value) {
        section.$(byText(value)).click();

        return this;
    }

    public AstonPage scrollOurServicesSection(Boolean value) {
        ourServicesSection.scrollIntoView(value);

        return this;
    }

    public AstonPage clickQaAudit() {
        qaAudit.click();

        return this;
    }

    public AstonPage checkTitleQaAudit(String value) {
        descriptionQaAudit.shouldHave(text(value));

        return this;
    }
}
