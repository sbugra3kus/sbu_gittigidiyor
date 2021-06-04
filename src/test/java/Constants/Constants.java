package Constants;

import org.openqa.selenium.By;



public class Constants {

    public static String FIRST_LINK = "https://www.gittigidiyor.com/";
    public static String TITLE = "GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi";
    public static String SECOND_TITLE = "Üye Girişi - GittiGidiyor";
    public static String USER = "bugra3kus@gmail.com";
    public static String USER_PW = "33Ay05@1";
    public static String PRODUCT = "Bilgisayar";
    public static String NEXT_LINK_CONTROL = "https://www.gittigidiyor.com/arama/?k=Bilgisayar&sf=2";
    public static final By USER_MENU = By.xpath("//div[@title='Giriş Yap']");
    public static final By LOGIN = By.xpath("//a[@data-cy='header-login-button']");
    public static final By USERNAME = By.id("L-UserNameField");
    public static final By USER_PASSWORD = By.id("L-PasswordField");
    public static final By SECOND_PAGE = By.xpath("//a[text()='2']");
    public static final By LOGIN_ENTER = By.id("gg-login-enter");
    public static final By SEARCH = By.xpath("//input[@data-cy='header-search-input']");
    public static final By PRODUCT_LIST = By.xpath("//div[@class='cell-border-css']");
    public static final By ADD_TO_BASKET = By.id("add-to-basket");
    public static final By GO_TO_BASKET = By.xpath("//div[@class='icon-sepet-line-wrapper']");
    public static final By PRODUCT_AMOUNT = By.xpath("//select[@class='amount']");
    public static final By TRASH_BIN = By.className("gg-icon-bin-medium");


}
