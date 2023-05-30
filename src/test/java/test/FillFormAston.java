package test;

import data.SoftwareSolution;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

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

//        step("Подтвердить cookie", () -> {
//        astonPage.acceptCookies();
//        });
//
//        step("Оставить положение страницы неизменной после подтверждения cookie", () -> {
//        fillFormPage.scrollHeaderModule(true);
//        });

        step("Навести мышку на раздел услуги", () -> {
        fillFormPage.hoverService();
        });

        step("Кликнуть на 'Выделенная команда'", () -> {
        fillFormPage.clickAndCheckTextTeam("Выделенная команда");
        });

        step("Проверить заголовок формы 'Запросить оценку стоимости выделенной команды'", () -> {
        fillFormPage.checkFormHeader("Запросить оценку стоимости выделенной команды");
        });

        step("Выбор отрали бизнеса", () -> {
        fillFormPage.chooseBusinessSector(industry);
        });

        step("Закрыть всплывающее окно формы", () -> {
        fillFormPage.closePopupWindow();
        });

        step("Скролл до 2 блока формы", () -> {
        fillFormPage.scrollToFormBlock(false);
        });

        step("Выбрать тип программного решения", () -> {
        fillFormPage.chooseTypeOfSoftwareSolution(softwareSolution);
        });

        step("Скролл до 3 блока формы", () -> {
        fillFormPage.scrollToEndOfForm(true);
        });

        step("Нажать кнопку 'Узнать стоимость'", () -> {
        fillFormPage.clickToSeePrice("Узнать стоимость");
        });

        step("Проверка формы. Заголовок 'Чтобы получить ценовое предложение'", () -> {
        fillFormPage.checkResultModalHeader("Чтобы получить ценовое предложение");
        });

        step("Проверка формы. Отображение введённых данных", () -> {
        fillFormPage.checkDataIndustryResultModal(industry);
        fillFormPage.checkDataSoftwareSolutionResultModal(softwareSolution.toString());
        });
    }
}


