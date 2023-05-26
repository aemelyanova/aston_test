package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class TestAston extends TestBase {
    @Test
    @DisplayName("Проверка заголовка страницы при выборе стека 'Java' в разделе 'Технологии'")
    void checkHeaderWhenStackIsSelected() {

        //Открыть главную страницу сайта и подтвердить куки
        astonPage.openPage();
        astonPage.acceptCookies();

        //Навести мышку на Технологии
        astonPage.hoverTechnologyButton();

        //Выбрать раздел Java
        astonPage.clickTechnologyJava("Java");

        //Проверить заголовок страницы "Java-разработка"
        astonPage.checkHeaderJava("Java-разработка");
    }


    @Test
    @DisplayName("Поиск несуществующего текста в разделе 'Стажировка в Aston'")
    void searchForNonExistentText() {

        //Открыть главную страницу сайта и подтвердить куки
        astonPage.openPage();
        astonPage.acceptCookies();

        //найти и проверить заголовок "по вопросам стажировки"
        astonPage.checkTitleInternship("по вопросам стажировки");

        // кликнуть на "стажировка в астон"\
        astonPage.clickInternship();

        // на новой открывшейся странице проверить несуществующий текст "Стажировка в McDonald's"
        astonPage.checkingNonExistentText("Стажировка в McDonald's");
    }


    @Test
    @DisplayName("Доступность вкладки 'QA аудит' из раздела 'Контроль качества ПО'")
    void checkQaAuditTab() {
        //Открыть главную страницу сайта и подтвердить куки
       // astonPage.openPage();
     open("https://astondevs.ru/");
        astonPage.acceptCookies();

//        //потдвердить куки
//        $(".CookiesPolicy-module--button--JZrW1").click();

        // Навести мышку на раздел услуги
        astonPage.hoverServiceButton();
       // $("[tabindex=Услуги]").hover();

        // Кликнуть на Контроль качечества ПО
        astonPage.clickQualityControl("Контроль качества ПО");
        //$("#gatsby-focus-wrapper").$(byText("Контроль качества ПО")).click();

        // На окрывшейся странице нажать на QA аудит
        astonPage.clickQaAudit();
//        $("#page-interlinking-tab-1").click();

        // проверить текст "Услуга нужна, чтобы оценить эффективность процессов"
        astonPage.checkTitleQaAudit("Услуга нужна, чтобы оценить эффективность процессов");
      //  $("#page-interlinking-panel-1").shouldHave(text("Услуга нужна, чтобы оценить эффективность процессов"));
        sleep(4000);


    }
}
