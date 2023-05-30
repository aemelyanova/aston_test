package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AstonPage {
     SelenideElement
 //           cookies = $(".CookiesPolicy-module--button--JZrW1"),
            technologyButton = $("[tabindex=Технологии]"),
            technologyJava = $(".SubMenu-module--left--R5vB-"),
            headerJava = $("#intro"),
            titleInternship = $(".Footer-module--contactUs--6nPqr"),
            pageInternship = $("#___gatsby"),
            servicesButton = $("[tabindex=Услуги]"),
            serviceQa = $("#gatsby-focus-wrapper"),
            qaAudit = $("#page-interlinking-tab-1"),
            descriptionQaAudit = $("#page-interlinking-panel-1");

     ElementsCollection
            internshipAston = $$(".Contacts-module--withoutButtonLink--q6Ass");



    public AstonPage openPage() {
        open("https://astondevs.ru/");

        return this;
    }
//    public AstonPage acceptCookies() {
//        cookies.click();
//
//        return this;
//    }
    public AstonPage hoverTechnologyButton() {
        technologyButton.hover();

        return this;
    }
    public AstonPage clickTechnologyJava(String value) {
        technologyJava.$(byText(value)).click();

        return this;
    }
    public AstonPage checkHeaderJava(String value) {
       headerJava.shouldHave(text(value));

        return this;
    }
    public AstonPage checkTitleInternship(String value) {
        titleInternship.shouldHave(text(value));

        return this;
    }
    public AstonPage clickInternship() {
        internshipAston.get(1).click();

        return this;
    }
    public AstonPage checkingNonExistentText(String value) {
        pageInternship.shouldNot(text(value));

        return this;

   }
    public AstonPage hoverServiceButton() {
        servicesButton.hover();

        return this;
    }
    public AstonPage clickQualityControl(String value) {
        serviceQa.$(byText(value)).click();

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
