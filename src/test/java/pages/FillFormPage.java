package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FillFormPage {
    SelenideElement

            titleAndTextTeam = $(byTagAndText("a", "Выделенная команда")),
            sectionIndustryBusiness = $(byTagAndText("p", "Выберите отрасль бизнеса, наиболее подходящую для вашего проекта")),
            sectionSoftwareSolution = $(byTagAndText("p", "Какой тип программного решения вы хотели бы разработать?")),
            sectorForm = $(".DesktopSection-module--wrapper--FmE-w"),
            popupWindow = $(".CloseButton-module--closeIcon--wOdet"),
            scrollToEndForm = $(byTagAndText("p", "Укажите приблизительную продолжительность вашего проекта")),
            buttonSeePrice = $(byTagAndText("button", "Узнать стоимость")),
            headerResultModal = $(".ResultModal-module--layout--yBGoY"),
            dataResultModal = $(".TagsLayout-module--elements--WDaBi");


    public FillFormPage clickAndCheckTextTeam() {
        titleAndTextTeam.click();

        return this;
    }

    public FillFormPage scrollSectionIndustryBusiness(Boolean value) {
        sectionIndustryBusiness.scrollIntoView(value);

        return this;
    }

    public FillFormPage chooseBusinessSector(String value) {
        sectorForm.$(byText(value)).click();

        return this;
    }

    public FillFormPage closePopupWindow() {
        popupWindow.click();

        return this;
    }

    public FillFormPage scrollSectionSoftwareSolution(Boolean value) {
        sectionSoftwareSolution.scrollIntoView(value);

        return this;
    }

    public FillFormPage chooseTypeOfSoftwareSolution(String value) {
        sectorForm.$(byText(value)).click();

        return this;
    }

    public FillFormPage scrollToEndOfForm(Boolean value) {
        scrollToEndForm.scrollIntoView(value);

        return this;
    }

    public FillFormPage clickToSeePrice() {
        buttonSeePrice.click();

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
