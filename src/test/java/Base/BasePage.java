package Base;


import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.Logger;

public class BasePage {
    private static Logger logger = LogManager.getLogger(BasePage.class);

    WebDriver webDriver = null;
    WebDriverWait webDriverWait = null;

    public BasePage(WebDriver webDriver) { //Driver Ayarlamaları Yapılıyor
        this.webDriver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 60);
    }

    public void titleAssertion(String tıtle) { //Başlıklar Kontrol Ediliyor
        Assert.assertEquals(tıtle, webDriver.getTitle());
    }

    public void hoverToElement(By by) { //Mouse Hareket Ettiriliyor
        Actions actions = new Actions(webDriver);
        actions.moveToElement(webDriver.findElement(by)).build().perform();
    }

    public void click(By by) { //Mouse'un Sol Tuşuna Basılıyor
        webDriverWait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public WebElement findElement(By by) { //Web elementi Aranıyor.
        webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return webDriver.findElement(by);
    }

    public void sendKeys(By by, String str) { //Klavyeye Tuş Gönderimi Yapılıyor

        findElement(by).sendKeys(str);
    }

    public void scrollToElement(By by) { //Sayfa Scroll Ediliyor.
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].scrollIntoView();", webDriver.findElement(by));
    }

    public List<WebElement> listElements(By by) { //Elemenetler Listeleniyor
        return webDriver.findElements(by);
    }

    public void randomItemClick(By by) { //liste İçerisinden Rastgele Ürün Seçiliyor
        Random random = new Random();
        listElements(by).get(random.nextInt(listElements(by).size())).click();
    }

    public void select(By by) { //Ürün Sayısı Arttırılıyor
        Select two = new Select(findElement(by));
        two.selectByIndex(1);
    }

    public void assertionUrl(String text) { //Sayfa Url'si Kontrol Ediliyor
        Assert.assertEquals(text, webDriver.getCurrentUrl());
    }

}
