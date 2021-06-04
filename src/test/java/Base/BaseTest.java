package Base;

import Constants.Constants;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

public class BaseTest {


    static WebDriver webDriver=null;


    @Before
    public void setUp() {  //Driver Ayarları Yapılıyor.

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe"); // Chrome Web Tarayıcısı Olarak Ayarlandı.
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized"); // Tarayıcı Tam Ekran Başlatıldı
        chromeOptions.addArguments("disable-notifications"); // Bildirimler Kapatıltıldı
        chromeOptions.addArguments("disable-popup-blocking"); // Pop-Up'lar Kapatıldı
        setWebDriver(new ChromeDriver(chromeOptions));
        getWebDriver().navigate().to(Constants.FIRST_LINK); // GittiGidiyor Sitesine Yönlendirildi.
        getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //TimeOut Ayarlandı

    }

    public static WebDriver getWebDriver() { //

        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;
    }

    public void tearDown(){
        getWebDriver().quit(); //Chrome kapatıldı
    }
}