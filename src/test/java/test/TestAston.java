package test;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("aston")

public class TestAston extends TestBase {

    @Owner("aemelyanova")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Проверка заголовка страницы при выборе стека 'Java' в разделе 'Технологии'")
    @Tag("header")
    void checkHeaderWhenStackIsSelected() {
        step("Открыть сайт на главной странице", () -> {
            astonPage.openPage();
        });

        step("Навести мышку на раздел 'Технологии'", () -> {
            astonPage.hoverTechnologyButton();
        });

        step("Выбрать раздел 'Java'", () -> {
            astonPage.clickTechnologyJava("Java");
        });

        step("Проверить заголовок страницы 'Java-разработка'", () -> {
            astonPage.checkHeaderJava("Java-разработка");
        });
    }

    @Owner("aemelyanova")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Проверка кликабельности кнопки 'Стажировка' в разделе 'Карьера'")
    @Tag("internship")
    void checkClickInternshipButton() {

        step("Открыть сайт на главной странице", () -> {
            astonPage.openPage();
        });
        step("Навести мышку на раздел 'Карьера'", () -> {
            astonPage.hoverCareerSection();
        });
        step("Кликнуть на 'Стажировка'", () -> {
            astonPage.clickInternship("Стажировка");
       });
       step("На новой открывшейся странице проверить заголовок 'Стажировка в Aston'", () -> {
           astonPage.checkingTextInternship("Стажировка в Aston");
        });

        //Проверка кликабельности кнопки "Стажировка" в разделе "Карьера"
//        //открыть главную страницу
//        open("https://astondevs.ru/");
//        // навести мышку на карьера
//        $("[tabindex=Карьера]").click();
        // кликнуть на стажировка
//        $("#gatsby-focus-wrapper").$(byText("Стажировка")).click();
        // На новой открывшейся странице проверить несуществующий текст 'Стажировка в McDonald's
//        $("#intro").shouldHave(text("Стажировка в Aston"));
//
//        step("Открыть сайт на главной странице", () -> {
//            astonPage.openPage();
//        });
//////////////////////////////////////////////////////////////////////
        //Проверка кликабельности кнопки "Стажировка" в разделе "Карьера"
        //открыть главную страницу
//        open("https://astondevs.ru/");
//        // навести мышку на карьера
//        $("[tabindex=Карьера]").click();
//        // кликнуть на стажировка
//        $("#gatsby-focus-wrapper").$(byText("Стажировка")).click();
//        // На новой открывшейся странице проверить несуществующий текст 'Стажировка в McDonald's
//        $("#intro").shouldHave(text("Стажировка в Aston"));
//////////////////////////////////////////////////////////////////////////

//        // навести мышку на карьера
//        $("[tabindex=Технологии]").click();
//        // кликнуть на стажировка
//        $("#gatsby-focus-wrapper").$(byText("Стажировка")).click();
//        // На новой открывшейся странице проверить несуществующий текст 'Стажировка в McDonald's
//        $("#intro").shouldNot(text("Стажировка в McDonald's"));






//        step("Найти и проверить заголовок 'по вопросам стажировки'", () -> {
//            astonPage.checkTitleInternship("по вопросам стажировки");
//        });
//
//        step("Кликнуть на 'Стажировка в Aston'", () -> {
//            astonPage.clickInternship();
//        });
//
//        step("На новой открывшейся странице проверить несуществующий текст 'Стажировка в McDonald's'", () -> {
//            astonPage.checkingNonExistentText("Стажировка в McDonald's");
//        });
    }

    @Owner("aemelyanova")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    @DisplayName("Доступность вкладки 'QA аудит' из раздела 'Контроль качества ПО'")
    @Tag("qa")
    void checkQaAuditTab() {
        step("Открыть сайт на главной странице", () -> {
            astonPage.openPage();
        });

        step("Навести мышку на раздел 'Услуги'", () -> {
            astonPage.hoverServiceButton();
        });

        step("Кликнуть на 'Контроль качества ПО'", () -> {
            astonPage.clickQualityControl("Контроль качества ПО");
        });
        step("Скролл до раздела 'Наши услуги'", () -> {
            astonPage.scrollOurServicesSection(true);
        });

        step("На окрывшейся странице кликнуть на 'QA аудит'", () -> {
            astonPage.clickQaAudit();
        });

        step("Проверить текст 'Услуга нужна, чтобы оценить эффективность процессов'", () -> {
            astonPage.checkTitleQaAudit("Услуга нужна, чтобы оценить эффективность процессов");
        });

//        open("https://astondevs.ru/");
        // "Навести мышку на раздел 'Услуги'"
//        $("[tabindex=Услуги]").click();
//        // кликнуть на стажировка
//        $("#gatsby-focus-wrapper").$(byText("Контроль качества ПО")).click();
//
//        //скрол до раздела наши услуги
////        $(byTagAndText("h2", "Наши услуги")).scrollIntoView(true);
//
//        //кликнуть на QA-аудит
//        $("#page-interlinking-tab-1").click();;
//
//        //"Проверить текст 'Услуга нужна, чтобы оценить эффективность процессов'"
//        $("#page-interlinking-panel-1").shouldHave(text("Услуга нужна, чтобы оценить эффективность процессов"));
   }
}
