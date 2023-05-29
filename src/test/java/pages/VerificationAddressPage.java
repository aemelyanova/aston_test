package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class VerificationAddressPage {

     SelenideElement
            titleAndTextTeam = $("#gatsby-focus-wrapper"),
            headerOffice = $(".SideMenu-module--title--bj1-e"),
            selectCity = $("#offices"),
            addressHeadCity = $(".ymaps-2-1-79-balloon__content");

    public VerificationAddressPage clickButtonCompany(String value) {
        titleAndTextTeam.$(byText(value)).click();

        return this;
    }

    public VerificationAddressPage checkHeaderOffice(String value) {
        headerOffice.shouldHave(text(value));

        return this;
    }
    public VerificationAddressPage scrollToSectionOffice(Boolean value){
        selectCity.scrollIntoView(value);

        return this;
    }

    public VerificationAddressPage choiceHeadOffice(String value) {
        selectCity.$(byText(value)).click();

        return this;
    }

    public VerificationAddressPage checkCorrectAddress(String value) {
        addressHeadCity.shouldHave(text(value)).click();

        return this;
    }
}
