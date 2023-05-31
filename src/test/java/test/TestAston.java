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

        step("Кликнуть на раздел 'Java'", () -> {
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

        step("Кликнуть на раздел 'Стажировка'", () -> {
            astonPage.clickInternship("Стажировка");
        });

        step("На новой открывшейся странице проверить заголовок 'Стажировка в Aston'", () -> {
            astonPage.checkingTextInternship("Стажировка в Aston");
        });
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

        step("Проверить заголовок главной страницы", () -> {
            astonPage.checkMainPageTitle("ИТ-решения для развития бизнеса");
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
    }
}
