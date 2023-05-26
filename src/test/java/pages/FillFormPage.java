package pages;


import com.codeborne.selenide.SelenideElement;
import data.SoftwareSolution;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FillFormPage {
     SelenideElement
            headerModule = $("#gatsby-focus-wrapper"),
            sectionService = $("[tabindex=Услуги]"),
            titleAndTextTeam = $("#gatsby-focus-wrapper"),
            formHeaderCostEstimate = $(".Calculator-module--wrapper--gk5WR"),
            businessSector = $(".DesktopSection-module--wrapper--FmE-w"),///
            popupWindow = $(".CloseButton-module--closeIcon--wOdet"),
            scrollToForm = $(".DesktopSection-module--footer--Upcr5"), //
            scrollToEndForm = $(".DesktopSection-module--footer--Upcr5"),//
            checkboxSoftwareSolution = $(".DesktopSection-module--wrapper--FmE-w"),///
            buttonSeePrice = $("#calculator"),
            headerResultModal = $(".ResultModal-module--layout--yBGoY"),
            dataResultModal = $(".TagsLayout-module--elements--WDaBi");


    public FillFormPage scrollHeaderModule(Boolean value) {
        headerModule.scrollIntoView(value);

        return this;
    }

    public FillFormPage hoverService() {
        sectionService.hover();

        return this;
    }

    public FillFormPage clickAndCheckTextTeam(String value) {
        titleAndTextTeam.$(byText(value)).click();

        return this;
    }

    public FillFormPage checkFormHeader(String value) {
        formHeaderCostEstimate.shouldHave(text(value));

        return this;
    }

    public FillFormPage chooseBusinessSector(String value) {
        businessSector.$(byText(value)).click();

        return this;
    }


    public FillFormPage closePopupWindow() {
        popupWindow.click();

        return this;
    }

    public FillFormPage scrollToFormBlock(Boolean value) {
        scrollToForm.scrollIntoView(value);

        return this;
    }

    public FillFormPage chooseTypeOfSoftwareSolution(SoftwareSolution value) {
        checkboxSoftwareSolution.$(byText(value.toString())).click();

        return this;
    }
    public FillFormPage scrollToEndOfForm(Boolean value) {
        scrollToEndForm.scrollIntoView(value);

        return this;
    }
    public FillFormPage clickToSeePrice(String value) {
        buttonSeePrice.$(byText(value)).click();

        return this;
    }
    public FillFormPage checkResultModalHeader(String value) {
        headerResultModal.shouldHave(text(value));


        return this;
    }

    public FillFormPage checkDataIndustryResultModal(String value) {
        dataResultModal.shouldHave(text(value));

        return this;
    }
    public FillFormPage checkDataSoftwareSolutionResultModal(String value) {
        dataResultModal.shouldHave(text(value));

        return this;
    }
}
