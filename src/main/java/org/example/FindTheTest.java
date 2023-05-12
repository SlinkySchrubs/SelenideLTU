package org.example;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class FindTheTest {

    public void TestMethod() throws InterruptedException {

        System.setProperty("selenide.holdBrowserOpen", "true");

        Configuration.browser = "chrome";
        // set up configuration

        Configuration.browser = "chrome";
        // open LTU website
        open("https://www.ltu.se");
        getWebDriver().manage().window().maximize();

        sleep(1000);

    }
}
