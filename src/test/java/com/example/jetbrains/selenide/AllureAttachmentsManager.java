package com.example.jetbrains.selenide;

import com.example.jetbrains.selenide.tests.BaseTest;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AllureAttachmentsManager {

    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] screenshot() {
        return ((TakesScreenshot) BaseTest.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}

