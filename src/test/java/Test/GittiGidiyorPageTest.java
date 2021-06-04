package Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Base.BaseTest;
import Page.GittiGidiyorPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GittiGidiyorPageTest extends BaseTest {
    GittiGidiyorPage GittiGidiyorPage;

    private static Logger logger = LogManager.getLogger(GittiGidiyorPageTest.class);

    @Before
    public void before() {
        logger.info("WebDriver Çalıştırılıyor");
        GittiGidiyorPage = new GittiGidiyorPage(getWebDriver());
        logger.info("WebDriver Çalıştı");
    }

    @Test
    public void testLogin() throws InterruptedException {
        logger.info("Sistem Başlatılıyor");
        GittiGidiyorPage.start().login().search().nextPage().randomClick().addToBasket().amount().trashBin();
        logger.info("Sistem Başarılı Calıstı");
    }

   @After
    public void after() throws InterruptedException {
        logger.info("WebDriver Sonlandırılıyor");
        tearDown();
       logger.info("WebDriver Sonlandı");
    }
}
