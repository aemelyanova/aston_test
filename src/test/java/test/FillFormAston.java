package test;

import data.SoftwareSolution;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class FillFormAston extends TestBase {


    String industry = randomUtils.getRandomIndustry();
    SoftwareSolution softwareSolution = randomUtils.getRandomSoftwareSolution();

    @Test
    @DisplayName("Заполнение формы 'Запросить оценку стоимости выделенной команды'")
    void fillForm() {

        // открыть сайт на главной странице
        astonPage.openPage();

        //потдвердить куки
        astonPage.acceptCookies();

        // оставить положение страницы неизменной после подтверждения куки
        fillFormPage.scrollHeaderModule(true);

        // Навести мышку на раздел услуги
        fillFormPage.hoverService();

        // Кликнуть на Выделенная команда
        fillFormPage.clickAndCheckTextTeam("Выделенная команда");

        // Проверить заголовок формы Запросить оценку стоимости выделенной команды
        fillFormPage.checkFormHeader("Запросить оценку стоимости выделенной команды");

        // Выбор отрали бизнеса
        fillFormPage.chooseBusinessSector(industry);

        // Закрыть всплывающие окно формы
        fillFormPage.closePopupWindow();

        //cкролл до 2 блока формы
        fillFormPage.scrollToFormBlock(false);

        // Выбрать тип программного решения
        fillFormPage.chooseTypeOfSoftwareSolution(softwareSolution);

        // Закрыть всплывающие окна которое маленькое справа
        //$(".closeIcon_eb80").click();

        //скролл до 3 блока
        fillFormPage.scrollToEndOfForm(true);

        // нажать кнопку Узнать стоимость
        fillFormPage.clickToSeePrice("Узнать стоимость");

        //Проверка формы. Заголовок 'Чтобы получить ценовое предложение'"
        fillFormPage.checkResultModalHeader("Чтобы получить ценовое предложение");

        // Проверка формы. Отображение введённых и данных
        fillFormPage.checkDataIndustryResultModal(industry);
        fillFormPage.checkDataSoftwareSolutionResultModal(softwareSolution.toString());

    }
}


