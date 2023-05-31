package test;

import data.SoftwareSolution;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;


public class FillFormAston extends TestBase {

    String industry = randomUtils.getRandomIndustry();
    SoftwareSolution softwareSolution = randomUtils.getRandomSoftwareSolution();

    @Owner("aemelyanova")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    @DisplayName("Заполнение формы 'Запросить оценку стоимости выделенной команды'")
    @Tags({@Tag("form"), @Tag("aston")})

    void fillForm() {
        step("Открыть сайт на главной странице", () -> {
            astonPage.openPage();
        });

        step("Навести мышку на раздел 'Услуги'", () -> {
            astonPage.hoverServiceButton();
           //fillFormPage.hoverService();
       });

        step("Кликнуть на 'Выделенная команда'", () -> {
            astonPage.hoverServiceButton();
           // $(byTagAndText("tabindex", "Услуги")).hover();
            fillFormPage.clickAndCheckTextTeam();
          //  $(byTagAndText("a", "Выделенная команда")).click();
            //fillFormPage.clickAndCheckTextTeam("Выделенная команда");
        });

        step("Скролл до раздела 'Выберите отрасль бизнеса'", () -> {
            fillFormPage.scrollSectionIndustryBusiness(true);
        });
        step("Выбор отрали бизнеса", () -> {
            fillFormPage.chooseBusinessSector(industry);
        });
        step("Закрыть всплывающее окно формы", () -> {
            fillFormPage.closePopupWindow();
        });
        step("Скролл до раздела 'Какой тип программного решения вы хотели бы разработать?'", () -> {
            fillFormPage.scrollSectionSoftwareSolution(true);
        });
        step("Выбрать тип программного решения", () -> {
            fillFormPage.chooseTypeOfSoftwareSolution(softwareSolution);
        });
        step("Скролл до раздела 'Укажите приблизительную продолжительность вашего проекта'", () -> {
            fillFormPage.scrollToEndOfForm(true);
        });
        step("Нажать кнопку 'Узнать стоимость'", () -> {
            fillFormPage.clickToSeePrice();
        });
        step("Проверка формы. Заголовок 'Чтобы получить ценовое предложение'", () -> {
            fillFormPage.checkResultModalHeader("Чтобы получить ценовое предложение");
        });
        step("Проверка формы. Отображение введённых данных", () -> {
            fillFormPage.checkDataIndustryResultModal(industry);
            fillFormPage.checkDataSoftwareSolutionResultModal(softwareSolution.toString());
        });



////        step("Навести мышку на раздел услуги", () -> {
//        $("[tabindex=Услуги]").hover();
////            fillFormPage.hoverService();
////        });
////
////        step("Кликнуть на 'Выделенная команда'", () -> {
//        $("#gatsby-focus-wrapper").$(byText("Выделенная команда")).click();



//
//        //"Проверка формы. Отображение введённых данных"
//        $(".TagsLayout-module--elements--WDaBi").shouldHave(text(industry));
//        $(".TagsLayout-module--elements--WDaBi").shouldHave(text(softwareSolution.toString()));

        // скрол до раздела "Выберите отрасль бизнеса, наиболее подходящую для вашего проекта"
        // $("#calculator").scrollIntoView(true);
      //  $(byTagAndText("p", "Выберите отрасль бизнеса, наиболее подходящую для вашего проекта")).scrollIntoView(true);

//        step("Навести мышку на раздел услуги", () -> {
//        fillFormPage.hoverService();
//        });
        //"Скролл до 3 блока формы"
 //       $(byTagAndText("p", "Укажите приблизительную продолжительность вашего проекта")).scrollIntoView(true);
        // скрол до раздела "Какой тип программного решения вы хотели бы разработать?"
 //       $(byTagAndText("p", "Какой тип программного решения вы хотели бы разработать?")).scrollIntoView(true);
//
//        //"Закрыть всплывающее окно формы"
//        $(".CloseButton-module--closeIcon--wOdet").click();
        //"Выбрать тип программного решения"
//        $(".DesktopSection-module--wrapper--FmE-w").$(byText(softwareSolution.toString())).click();
        //Выбор отрали бизнеса
       // $(".DesktopSection-module--wrapper--FmE-w").$(byText(industry)).click();
        //Нажать кнопку 'Узнать стоимость'
   //     $(byTagAndText("button", "Узнать стоимость")).click();
//        step("Кликнуть на 'Выделенная команда'", () -> {
//        fillFormPage.clickAndCheckTextTeam("Выделенная команда");
//        });
        //"Проверка формы. Заголовок 'Чтобы получить ценовое предложение'"
//        $(".ResultModal-module--layout--yBGoY").shouldHave(text("Чтобы получить ценовое предложение"));
        // скрол до раздела "Какой тип программного решения вы хотели бы разработать?"
//        $(byTagAndText("p", "Какой тип программного решения вы хотели бы разработать?")).scrollIntoView(true);
//
//        step("Проверить заголовок формы 'Запросить оценку стоимости выделенной команды'", () -> {
//        fillFormPage.checkFormHeader("Запросить оценку стоимости выделенной команды");
//        });

//        step("Выбор отрали бизнеса", () -> {
//        fillFormPage.chooseBusinessSector(industry);
//        });
//
//
//
//        step("Скролл до 2 блока формы", () -> {
//        fillFormPage.scrollToFormBlock(false);
//        });
//
////        step("Выбрать тип программного решения", () -> {
////        fillFormPage.chooseTypeOfSoftwareSolution(softwareSolution);
////        });
//
//        step("Скролл до 3 блока формы", () -> {
//        fillFormPage.scrollToEndOfForm(true);
//        });
//
//        step("Нажать кнопку 'Узнать стоимость'", () -> {
//        fillFormPage.clickToSeePrice("Узнать стоимость");
//        });
//
//        step("Проверка формы. Заголовок 'Чтобы получить ценовое предложение'", () -> {
//        fillFormPage.checkResultModalHeader("Чтобы получить ценовое предложение");
//        });
//
//        step("Проверка формы. Отображение введённых данных", () -> {
//        fillFormPage.checkDataIndustryResultModal(industry);
//        fillFormPage.checkDataSoftwareSolutionResultModal(softwareSolution.toString());
//        });
    }
}


