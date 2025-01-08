package com.example.jetbrains.selenide.pages;

import com.example.jetbrains.selenide.AllureLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

// page_url = https://www.jetbrains.com/mps/
public class MetaProgrammingSystemPage {
    private final AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(MetaProgrammingSystemPage.class));
    WebDriver driver;

    private  static  final By DOWN_LOAD_BUTTON = By.cssSelector("a[data-test='button' ][href ='/mps/downloadd/']");

    private  static  final By EAP_PROGRAMM_BUTTON = By.cssSelector("a[href ='/mps/nextversion/']");

    private  static  final By WHATS_NEW_BUTTON = By.cssSelector("a[href ='/mps/whatsnew/']");

    private  static  final By HOW_ITS_WORK_BUTTON = By.cssSelector("a[href ='/mps/concepts/']");

    private  static  final By LEARN_MPS_BUTTON = By.cssSelector("a[href ='/mps/learn/']");

    private  static  final By SERVICE_BUTTON = By.cssSelector("a[href ='/mps/support/']");

    private  static  final By FAQ_BUTTON = By.cssSelector("a[href='/help/mps/mps-faq.html']");

    private  static  final By MIGRATION_GUIDE_BUTTON = By.cssSelector("a[href='https://www.jetbrains.com/help/mps/migration-guide.html']");

    private  static  final By TEXT_ON_DOWNLOAD_PAGE = By.cssSelector("h1[class='wt-h2']");

    private  static  final By GET_STARTED_BUTTON = By.cssSelector("a[href='https://www.jetbrains.com/help/mps/fast-track-to-mps.html']");

    private  static  final By SEARCH_BUTTON = By.cssSelector("button[data-test='site-header-search-action']");

    private  static  final By SEARCH_FIELD = By.cssSelector("input[data-test-id='search-input']");

    private  static  final By MAIN_PAGE_TEXT = By.cssSelector("h1[class='_rs-hero_18dgpd9_1 _rs-typography_theme_dark_18dgpd9_1 _rs-text_hardness_auto_18dgpd9_1 wt-offset-top-24']");

    private  static  final By MPS_MAIN_PAGE_TEXT = By.cssSelector("span[data-test='menu-second-title-box-title']");

    private  static  final By STORE_BUTTON = By.cssSelector("a[data-test='site-header-cart-action']");

    private  static  final By PROFILE_BUTTON = By.cssSelector("a[href='https://account.jetbrains.com/']");

    private  static  final By LANGUAGE_BUTTOM = By.cssSelector("button[aria-label='Open language selection']");

    public String checkSendTextIntoSearchField(String input) {
        LOG.infoWithScreenshot("Проверка URL после search");
        clickSearchButton();
        $(SEARCH_FIELD).sendKeys(input);
        $(SEARCH_FIELD).pressEnter();
        return getCurentUrlSearchPage("www");
    }

    public Boolean checkIfSearchButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки search");
        Boolean searchButton = $(SEARCH_BUTTON).isEnabled();
        return searchButton;
    }

    public Boolean checkIfLanguageButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки смены языка");
        Boolean languageButton = $(LANGUAGE_BUTTOM).isEnabled();
        return languageButton;
    }

    public Boolean checkIfProfileButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки profile");
        Boolean profileButton = $(PROFILE_BUTTON).isEnabled();
        return profileButton;
    }

    public Boolean checkIfStoreButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки store");
        Boolean storeButton = $(STORE_BUTTON).isEnabled();
        return storeButton;
    }

    public Boolean checkIfDownloadButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Download");
        Boolean downloadButton = $(DOWN_LOAD_BUTTON).isEnabled();
        return downloadButton;
    }

    public Boolean checkIfEapProgramButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки EAP Program");
        Boolean eapProgramButton = $(EAP_PROGRAMM_BUTTON).isEnabled();
        return eapProgramButton;
    }

    public Boolean checkIfWhatsNewButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Whats New");
        Boolean whatsNewButton = $(WHATS_NEW_BUTTON).isEnabled();
        return whatsNewButton;
    }

    public Boolean checkIfHowItsWorksButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки How Its Works");
        Boolean howItsWorksButton = $(HOW_ITS_WORK_BUTTON).isEnabled();
        return howItsWorksButton;
    }

    public Boolean checkIfLearnMpsButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Learn Mps");
        Boolean learnMpsButton = $(LEARN_MPS_BUTTON).isEnabled();
        return learnMpsButton;
    }

    public Boolean checkIfServicesButtonIsClickable() {
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Services");
        Boolean servicesButton = $(SERVICE_BUTTON).isEnabled();
        return servicesButton;
    }

    public Boolean checkIfFaqButtonIsClickable() {
        clickDownloadElement();
        LOG.infoWithScreenshot("Проверка кликабельности кнопки FAQ");
        Boolean faqButton = $(FAQ_BUTTON).isEnabled();
        return faqButton;
    }

    public Boolean checkIfMigrationGuideButtonIsClickable() {
        clickDownloadElement();
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Migration Guide");
        Boolean migrationGuideButton = $(MIGRATION_GUIDE_BUTTON).isEnabled();
        return migrationGuideButton;
    }

    public Boolean checkIfGetStartedButtonIsClickable() {
        clickLearnMpsElement();
        LOG.infoWithScreenshot("Проверка кликабельности кнопки Get Started");
        Boolean getStartedButton = $(GET_STARTED_BUTTON).isEnabled();
        return getStartedButton;
    }

    public String checkTextOnDownloadPage() {
        clickDownloadElement();
        LOG.infoWithScreenshot("Проверка текста Download MPS");
        String textOnDownloadPage = $(TEXT_ON_DOWNLOAD_PAGE).getText();
        return textOnDownloadPage;
    }

    public String checkMpsTextOnMainPage() {
        LOG.infoWithScreenshot("Проверка текста Download MPS");
        String mpsMainPageText = $(MPS_MAIN_PAGE_TEXT).getText();
        return mpsMainPageText;
    }

    public String checkTextOnMainPage() {
        LOG.infoWithScreenshot("Проверка текста Download MPS");
        String mainPageText = $(MAIN_PAGE_TEXT).getText();
        return mainPageText;
    }

    public String getCurentUrlDownloadPage() {
        LOG.infoWithScreenshot("Переход на страницу загрузки");
        clickDownloadElement();
        return webdriver().driver().getCurrentFrameUrl();
    }

    public String getCurentUrlLearnMpsPage() {
        LOG.infoWithScreenshot("Переход на страницу Learn MPS");
        clickLearnMpsElement();
        return webdriver().driver().getCurrentFrameUrl();
    }

    public String getCurentUrlSearchPage(String partOfUrl) {
        LOG.infoWithScreenshot("Переход на страницу Learn MPS");
        webdriver().shouldHave(urlContaining(partOfUrl.toLowerCase()), Duration.ofSeconds(3));
        return webdriver().driver().getCurrentFrameUrl();
    }

    public String getCurentUrlGetStartedPage() {
        LOG.infoWithScreenshot("Переход на страницу Get Started");
        clickGetStartedElement();
        return webdriver().driver().getCurrentFrameUrl();
    }

    public MetaProgrammingSystemPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDownloadElement() {
        $(DOWN_LOAD_BUTTON).click();
    }

    public void clickLearnMpsElement() {
        $(LEARN_MPS_BUTTON).click();
    }

    public void clickGetStartedElement() {
        $(GET_STARTED_BUTTON).click();
    }

    public void clickSearchButton() {
        $(SEARCH_BUTTON).click();
    }
}

