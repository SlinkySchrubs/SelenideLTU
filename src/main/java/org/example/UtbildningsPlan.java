package org.example;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class UtbildningsPlan {
    public void UtbildningsPlanMethod() {

        System.setProperty("selenide.holdBrowserOpen", "true");

        Configuration.browser = "chrome";
        // set up configuration

        Configuration.browser = "chrome";
        // open LTU Student website
        open("https://www.ltu.se/student");
        getWebDriver().manage().window().maximize();

        sleep(1000);

        $(By.className("fa-search")).click();

        $(By.id("cludo-search-bar-input")).sendKeys("Systemvetenskap");

        $(By.xpath("//button[contains(text(),'Sök')]")).click();

        $(By.xpath("//h2[contains(text(),'Systemvetenskap, kandidat, 180 högskolepoäng')]")).click();

        $(By.xpath("//div[contains(text(),'Utbildningsplan')]")).click();

        $(By.xpath("//div[contains(text(),'Utbildningsplan')]")).click();

    }
}
