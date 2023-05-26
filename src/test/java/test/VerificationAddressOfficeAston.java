package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class VerificationAddressOfficeAston extends TestBase {

    @CsvFileSource(resources = "/testData.csv")
    @ParameterizedTest(name = "В городе {0} адрес офиса {1}")
    @DisplayName("При выборе города в разделе 'Главные офисы', отражается корректный адрес на карте")
    @Tags({@Tag("BLOCKER"), @Tag("SEARCH")})

    void searchForFullNameOfProductInSearchSite(
            String city,
            String address
    ) {
        // открыть сайт на главной странице
        astonPage.openPage();

        // кликнуть на кнопку Компания
        verificationAddressPage.clickButtonCompany("Компания");

        // проверить наличие заголовка "Главные офисы"
        verificationAddressPage.checkHeaderOffice("Главные офисы");

        // cкролл до раздела сайта 'Офисы'
        verificationAddressPage.scrollToSectionOffice(true);

        //при нажатии на Москву показывается на карте Адрес "Москва"
        verificationAddressPage.choiceHeadOffice(city);
        verificationAddressPage.checkCorrectAddress(address);

    }
}
