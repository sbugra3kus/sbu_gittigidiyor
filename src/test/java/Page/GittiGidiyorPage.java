package Page;

import Base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static Constants.Constants.*;


public class GittiGidiyorPage extends BasePage {

    public GittiGidiyorPage(WebDriver driver){
        super(driver);
    }

    private static Logger logger = LogManager.getLogger(BasePage.class);

    public GittiGidiyorPage start(){ //GittiGiyor.com Adresinde Üye Girişi Ekranı Açılıyor
        logger.info("Giriş Menüsü Açılıyor");
        titleAssertion(TITLE);
        hoverToElement(USER_MENU);
        logger.info("Giriş Menüsü Açıldı");
        return this;
    }
    public GittiGidiyorPage login() throws InterruptedException { //GittiGidiyor.com Adresine Üye Girişi Yapılıyot
        logger.info("Siteye Giriş Yapılıyor");
        click(LOGIN);
        sendKeys(USERNAME, USER);
        sendKeys(USER_PASSWORD, USER_PW);
        click(LOGIN_ENTER);
        Thread.sleep(5000);
        titleAssertion(TITLE);
        logger.info("Siteye Giriş Yapıldı");
        return this;
    }
    public GittiGidiyorPage search() { //Giriş Yapıldıktan Sonra Ürün Araması Yapılıyor
        logger.info(PRODUCT + "Ürün Arama Yapılıyor");
        findElement(SEARCH);
        sendKeys(SEARCH, PRODUCT);
        findElement(SEARCH).sendKeys(Keys.ENTER);
        logger.info( PRODUCT + "Bulundu");
        return this;
    }
    public GittiGidiyorPage nextPage() { //Sonuç Sayfalarından 2. Sayfaya Geçiliyor
        logger.info("Sonraki Sayfa Açılıyor");
        scrollToElement(SECOND_PAGE);
        click(SECOND_PAGE);
        assertionUrl(NEXT_LINK_CONTROL);
        logger.info("Sonraki Sayfa Açıldı");
        return this;
    }
    public GittiGidiyorPage randomClick() { //2. Sayfada Listelenen Ürünler İçerisinden Rastgele Ürün Seçiliyor
        randomItemClick(PRODUCT_LIST);
        logger.info("Rastgele Ürün Seçiliyor");
        return this;
    }
    public GittiGidiyorPage addToBasket(){ //Seçilen Ürün Sepete Ekleniyor ve Sepete Gidiliyor
        logger.info("Ürün Sepete Ekleniyor");
        scrollToElement(ADD_TO_BASKET);
        click(ADD_TO_BASKET);
        click(GO_TO_BASKET);
        logger.info("Ürün Sepete Eklendi");
        return this;
    }
    public GittiGidiyorPage amount(){ //Ürün Adeti Arttırılıyor
        logger.info("Ürün Adeti Arttırılıyor");
        select(PRODUCT_AMOUNT);
        click(PRODUCT_AMOUNT);
        logger.info("Ürün Adeti Arttırıldı");
        return this;
    }
    public GittiGidiyorPage trashBin() { //Sepet Temizleniyor.
        click(TRASH_BIN);
        logger.info("Çöp Kutusuna Basılıyor");
        return this;
    }
}
