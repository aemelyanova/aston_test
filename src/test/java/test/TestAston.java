package test;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
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

        step("Навести мышку на 'Технологии'", () -> {
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
    @DisplayName("Поиск несуществующего текста в разделе 'Стажировка в Aston'")
    @Tag("nonExist")
    void searchForNonExistentText() {

        step("Открыть сайт на главной странице", () -> {
            astonPage.openPage();
        });


        // навести мышку на карьера
        $("[tabindex=Технологии]").click();
        // кликнуть на стажировка
        $("#gatsby-focus-wrapper").$(byText("Стажировка")).click();
        // На новой открывшейся странице проверить несуществующий текст 'Стажировка в McDonald's
        $("#intro").shouldNot(text("Стажировка в McDonald's"));






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

        step("Кликнуть на 'Контроль качечества ПО'", () -> {
            astonPage.clickQualityControl("Контроль качества ПО");
        });

        step("На окрывшейся странице кликнуть на 'QA аудит'", () -> {
            astonPage.clickQaAudit();
        });

        step("Проверить текст 'Услуга нужна, чтобы оценить эффективность процессов'", () -> {
            astonPage.checkTitleQaAudit("Услуга нужна, чтобы оценить эффективность процессов");
        });
    }
}
