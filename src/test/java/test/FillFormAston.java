package test;

import com.codeborne.selenide.Condition;
import data.SoftwareSolution;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

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

        //проверить заголвок
        $(".TitleWith-module--container--EFW0t").shouldHave(Condition.text("ИТ-решения для развития бизнеса"));

        step("Навести мышку на раздел 'Услуги'", () -> {
            astonPage.hoverServiceButton();

       });

        step("Кликнуть на 'Выделенная команда'", () -> {
            fillFormPage.clickAndCheckTextTeam();
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

        // astonPage.hoverServiceButton();
        // $(byTagAndText("tabindex", "Услуги")).hover();
        //fillFormPage.hoverService();
        //  $(byTagAndText("a", "Выделенная команда")).click();
        //fillFormPage.clickAndCheckTextTeam("Выделенная команда");
    }
}


