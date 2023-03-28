package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class MyMethods {
    public WebDriverWait wait = new WebDriverWait(BasicDriver.getDriver(), Duration.ofSeconds(10));
    public void sendKeysMethod(WebElement element, String keys){
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(keys);
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) BasicDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickMethod(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();

    }

    public void verifyContainsText(WebElement element, String value){
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(value));
    }

    public boolean isPresent(WebElement element) {
        waitUntilClickable(element);
        return element.isDisplayed();
    }

    public boolean isSelected(WebElement element) {
        waitUntilClickable(element);
        return element.isSelected();
    }

    public void setWait(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickLinks(String category) {

        WebElement element = BasicDriver.getDriver().findElement(
                By.xpath("//a[contains(text(),'" + category + "')]"));

        element.click();

    }

    public void clickSubLinks(String category, String subcategory) {

        WebElement element = BasicDriver.getDriver().findElement(
                By.xpath("//a[contains(text(),'" + category + "')]"));

        element.click();

         element = BasicDriver.getDriver().findElement(
                By.xpath("//a[contains(text(),'" + subcategory + "')]"));

        element.click();

    }

    public void clickTopSubLinks(String category, String subcategory) {

        WebElement element = BasicDriver.getDriver().findElement(
                By.xpath("//span[contains(text(),'" + category + "')]"));

        element.click();

        element = BasicDriver.getDriver().findElement(
                By.xpath("//button[contains(text(),'" + subcategory + "')]"));

        element.click();

    }

    public void clickMyAccountSubLinks(String category, String subcategory) {

        WebElement element = BasicDriver.getDriver().findElement(
                By.xpath("//span[contains(text(),'" + category + "')]"));

        element.click();

        element = BasicDriver.getDriver().findElement(
                By.xpath("//a[contains(text(),'" + subcategory + "')]"));

        element.click();

    }

    public void clickTopMenuLinks(String category) {

        WebElement element = BasicDriver.getDriver().findElement(
                By.xpath("//span[contains(text(),'" + category + "')]"));

        element.click();
    }

}
