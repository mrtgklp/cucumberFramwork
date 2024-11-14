package stepDefitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Locates;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;

public class Steps {
    Locates locates = new Locates();
    WebDriver driver = Driver.getDriver();

    @Given("{string} web sayfası acilir")
    public void web_sayfası_acilir(String webPage) {
        driver.get(ConfigReader.getProperty(webPage));
        ReusableMethod.bekle(3);
    }
    @Given("{string} web sayfasını acildigini dogrulayalim")
    public void web_sayfasını_acildigini_dogrulayalim(String string) {

        Assert.assertTrue(driver.getCurrentUrl().contains("trendyol.com") );
    }

    @And("web sayfasini kapatir")
    public void webSayfasiniKapatir() {
        driver.close();
    }
}
