package com.example.jetbrains.selenide.tests;

import com.example.jetbrains.selenide.AllureLogger;
import com.example.jetbrains.selenide.pages.MetaProgrammingSystemPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.LoggerFactory;

import com.codeborne.selenide.Configuration;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class BaseTest {
    private static WebDriver driver;
    protected final AllureLogger LOG;

    MetaProgrammingSystemPage metaProgrammingSystemPage;


    @BeforeAll
    public static void setUpAll(){
        Configuration.browserSize = "1280x800";
    }

    @BeforeEach
    public void setUp() {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        metaProgrammingSystemPage = page();
        open("\"https://www.jetbrains.com/mps/\"");
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public BaseTest() {
        LOG = new AllureLogger(LoggerFactory.getLogger(this.getClass()));  // Инициализация экземпляра в конструкторе
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}

