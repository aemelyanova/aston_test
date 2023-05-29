package test;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static io.qameta.allure.Allure.step;


public class VerificationAddressOfficeAston extends TestBase {

    @Owner("aemelyanova")
    @Severity(SeverityLevel.BLOCKER)
    @CsvFileSource(resources = "/testData.csv")
    @ParameterizedTest(name = "В городе {0} адрес офиса: {1}")
    @DisplayName("При выборе города в разделе 'Главные офисы', отображается корректный адрес на карте. ")
    @Tags({@Tag("main"), @Tag("aston")})

    void searchForFullNameOfProductInSearchSite(
            String city,
            String address
    ) {
        step("Открыть сайт на главной странице", () -> {
            astonPage.openPage();
        });

        step("Кликнуть на кнопку 'Компания'", () -> {
        verificationAddressPage.clickButtonCompany("Компания");
        });

//        step("Проверить наличие заголовка 'Главные офисы'", () -> {
//        verificationAddressPage.checkHeaderOffice("Главные офисы");
//        });

//        step("Скролл до раздела сайта 'Офисы'", () -> {
//        verificationAddressPage.scrollToSectionOffice(true);
//        });

        step("При нажатии на 'Город' показывается на карте 'Адрес'", () -> {
        verificationAddressPage.choiceHeadOffice(city);
        verificationAddressPage.checkCorrectAddress(address);
        });

    }
}
