
# Проект по автоматизации тестирования для компании [Aston](https://astondevs.ru/)

 
<img src="images/logo/aston_logo.svg" width="200" height="44">

> Компания Aston представлена на российском рынке с 2007 года, предоставляя услуги разработки программного обеспечения и IT-аутсорса предприятиям, организациям и стартапам.

## **Содержание:**
____
- Технологии и инструменты
- Примеры автоматизированных тест-кейсов
- Примеры ручных тест-кейсов
- Запуск из терминала
- Cборка в Jenkins

- Allure отчет
- Интеграция с Allure TestOps
- Интеграция с Jira
- Уведомление в Telegram при помощи бота
- Примеры видео выполнения тестов на Selenoid

<a id="tools"></a>
## Технологии и инструменты:
____

| Java                                                                                                      | IntelliJ  <br>  Idea                                                                                               | GitHub                                                                                                     | JUnit 5                                                                                                           | Gradle                                                                                                     | Selenide                                                                                                         | Selenoid                                                                                                                  | Allure <br> Report                                                                                                         |  Jenkins                                                                                                        |   Jira                                                                                                                                  | Allure <br> TestOps                                                                                            | Telegram                                                                                                    
|:----------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  | <a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> | <a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a> | <a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a> | <a href="https://github.com/allure-framework"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> |<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> | <a href="https://www.atlassian.com/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50" alt="Java" title="Java"/></a> | <a href="https://qameta.io/"><img src="images\logo\Allure_TO.svg" width="50" height="50" alt="Allure_TO"/></a> | <a href="https://web.telegram.org/"><img src="images\logo\Telegram.svg" width="50" height="50" alt="Telegram"/></a>

- В данном проекте автотесты написаны на языке <code>Java</code> с использованием фреймворка для тестирования <code>Selenide</code>
- В качестве сборщика был использован - <code>Gradle</code>
- Использованы фреймворки <code>JUnit 5</code> и <code>Selenide</code>
- При прогоне тестов браузер запускается в <code>Selenoid</code>
- Для удаленного запуска реализована джоба в <code>Jenkins</code> с формированием <code>Allure-отчета</code> и отправкой результатов в <code>Telegram</code> при помощи бота.
- Осуществлена интеграция с <code>Allure TestOps</code> и <code>Jira</code>

## <a name="Примеры автоматизированных тест-кейсов">**Примеры автоматизированных тест-кейсов:**</a>
____
- ✓ *Параметризованный тест. При выборе города отображается корректный адрес на карте*
- ✓ *Заполнение формы 'Запросить оценку стоимости выделенной команды'*
- ✓ *Доступность вкладки 'QA аудит' из раздела 'Контроль качества ПО'*
- ✓ *Поиск несуществующего текста в разделе 'Стажировка в Aston'*
- ✓ *Проверка заголовка страницы при выборе стека 'Java' в разделе 'Технологии'*

____
## <a name="Примеры ручных тест-кейсов">**Примеры ручных тест-кейсов:**</a>
____
- ✓ *После заполнения формы "Рассчитать стоимость проекта" открывается окно для ввода данных*
- ✓ *Заполнение формы "Получите коммерческое предложение для вашего ИТ-решения"*
- ✓ *По кнопке 'Вакансии' в разделе 'Карьера в Aston' осуществляется переход на сайт hh.ru*
- ✓ *При нажатии на "Облачная разработка" открывается страница с заголовком "Услуги по разработке"*
- ✓ *При нажатии на город "Санкт-Петербург", отображается корректный адрес на карте*
____
## <a name="Команды для запуска из терминала">**Команды для запуска из терминала:**</a>

___
***Локальный запуск:***
```bash  
gradle clean aston_test
```

***Удалённый запуск через Jenkins:***
```bash  
clean aston_test
-Dbrowser=${BROWSER}"
-DbrowserVersion=${BROWSER_VERSION}"
-DbrowserSize=${BROWSER_SIZE}"
-DbaseUrl=${BASE_URL}}"
-Dremote=${REMOTE}"
```

## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/aemelyanova_aston_test/)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/a_emelyanova_aston_tests/"><img src="images/screen/jenkins_dashboard.png" alt="Jenkins" width="950"/></a>  
</p>


#### Параметры сборки

* <code>BROWSER</code> – браузер, в котором будут выполняться тесты. По-умолчанию - <code>chrome</code>
* <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты. По-умолчанию - <code>100.0</code>
* <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты. По-умолчанию - <code>"1980x1080"</code>
* <code>BASE_URL</code> – Url, по которому будет открываться тестируемое приложение. По-умолчанию - <code>https://astondevs.ru</code>.
* <code>REMOTE_BROWSER_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.

## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/aemelyanova_aston_test/18/allure/)</a>
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/allure_dashboard.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screen/allure_test_case.png" width="850">  
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/screen/allure_graphs.png" width="850">  
<img title="Allure Graphics" src="images/screen/allure_graphs1.png" width="850">  
</p>

___

## <img alt="Allure_TO" height="25" src="images/logo/Allure2.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/2489/dashboards">Allure TestOps</a>
____
### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screen/testops_dashboard.png" width="850">  
</p>  

### *Ручные тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screen/testops_manual.png" width="850">  
</p>

### *Авто тест-кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="images/screen/testops_auto.png" width="850">  
</p>

___