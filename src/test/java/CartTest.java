import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class CartTest {

    JavascriptExecutor js;
    private WebDriver driver;
    private Map<String, Object> vars;
        @Before
        public void setUp() {
            js = (JavascriptExecutor) driver;
            vars = new HashMap<String, Object>();
        }
        @After
        public void tearDown() {
            driver.quit();
        }
        @Test
        public void cart() {
            driver = new ChromeDriver();
            driver.get("https://eu.wahoofitness.com");
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();
            String s = driver.findElement(By.xpath("/html/head")).getText();
            driver.findElement(By.xpath("/html/head")).getText().toString().contains("Indoor Bike Trainers, GPS Bike Computers, Cycling Sensors &amp; Heart Rate Monitors | Wahoo Fitness EU");

            driver.findElement(By.cssSelector("li:nth-of-type(1) > .cat > span")).click();

            // 3 | click | css=.item:nth-child(1) .button-hover > span |
            driver.findElement(By.cssSelector(".item:nth-child(1) .button-hover > span")).click();
            // 4 | mouseOver | css=.item:nth-child(2) .button-hover |
            {
                WebElement element = driver.findElement(By.cssSelector(".item:nth-child(2) .button-hover"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).perform();
            }
            // 5 | click | css=.coverup |
            driver.findElement(By.cssSelector(".coverup")).click();
            // 6 | click | css=.item:nth-child(27) .lazyloaded |
            driver.findElement(By.cssSelector(".item:nth-child(27) .lazyloaded")).click();
            // 7 | click | id=qty |
            driver.findElement(By.id("qty")).click();
            // 8 | click | id=qty |
            driver.findElement(By.id("qty")).click();
            // 9 | click | id=attribute231 |
            driver.findElement(By.id("attribute231")).click();
            // 10 | doubleClick | id=attribute231 |
            {
                WebElement element = driver.findElement(By.id("attribute231"));
                Actions builder = new Actions(driver);
                builder.doubleClick(element).perform();
            }
            // 11 | select | id=attribute231 | label=Small
            {
                WebElement dropdown = driver.findElement(By.id("attribute231"));
                dropdown.findElement(By.xpath("//option[. = 'Small']")).click();
            }
            // 12 | click | id=attribute231 |
            driver.findElement(By.id("attribute231")).click();
            // 13 | click | id=attribute231 |
            driver.findElement(By.id("attribute231")).click();
            // 14 | click | id=attribute231 |
            driver.findElement(By.id("attribute231")).click();
            // 15 | click | css=#product-addtocart-button > span |
            driver.findElement(By.cssSelector("#product-addtocart-button > span")).click();
            // 16 | click | id=top-cart-btn-checkout |
            driver.findElement(By.id("top-cart-btn-checkout")).click();
            // 17 | type | id=customer-email | 12345@12345.com
            driver.findElement(By.id("customer-email")).sendKeys("12345@12345.com");
            // 18 | click | id=RXGHVD8 |
            driver.findElement(By.id("RXGHVD8")).click();
            // 19 | type | id=RXGHVD8 | asd
            driver.findElement(By.id("RXGHVD8")).sendKeys("asd");
            // 20 | type | id=MVTQW8W | asd
            driver.findElement(By.id("MVTQW8W")).sendKeys("asd");
            // 21 | type | id=CQIUPQT | 1234 Street
            driver.findElement(By.id("CQIUPQT")).sendKeys("1234 Street");
            // 22 | type | id=BW4FBM1 | asdg
            driver.findElement(By.id("BW4FBM1")).sendKeys("asdg");
            // 23 | click | id=SRK6E2L |
            driver.findElement(By.id("SRK6E2L")).click();
            // 24 | select | id=SRK6E2L | label=Rheinland-Pfalz
            {
                WebElement dropdown = driver.findElement(By.id("SRK6E2L"));
                dropdown.findElement(By.xpath("//option[. = 'Rheinland-Pfalz']")).click();
            }
            // 25 | click | id=SRK6E2L |
            driver.findElement(By.id("SRK6E2L")).click();
            // 26 | click | id=O8SDM8I |
            driver.findElement(By.id("O8SDM8I")).click();
            // 27 | type | id=O8SDM8I | 040303
            driver.findElement(By.id("O8SDM8I")).sendKeys("040303");
            // 28 | click | id=FEDHF7T |
            driver.findElement(By.id("FEDHF7T")).click();
            // 29 | runScript | window.scrollTo(0,117) |
            js.executeScript("window.scrollTo(0,117)");
            // 30 | type | id=FEDHF7T | 111111
            driver.findElement(By.id("FEDHF7T")).sendKeys("111111");
            // 31 | click | css=.amasty > span |
            driver.findElement(By.cssSelector(".amasty > span")).click();
            // 32 | mouseOver | css=.amasty > span |
            {
                WebElement element = driver.findElement(By.cssSelector(".amasty > span"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).perform();
            }
            // 33 | mouseOut | css=.amasty > span |
            {
                WebElement element = driver.findElement(By.tagName("body"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element, 0, 0).perform();
            }
            // 34 | click | css=.action-primary > span |
            driver.findElement(By.cssSelector(".action-primary > span")).click();
            // 35 | click | css=.payment-method-amasty_stripe > .payment-method-title span |
            driver.findElement(By.cssSelector(".payment-method-amasty_stripe > .payment-method-title span")).click();
            // 36 | click | id=s_method_amstrates_amstrates22 |
            driver.findElement(By.id("s_method_amstrates_amstrates22")).click();
            // 37 | selectFrame | index=5 |
            driver.switchTo().frame(5);
            // 38 | click | name=cardnumber |
            driver.findElement(By.name("cardnumber")).click();
            // 39 | type | name=cardnumber | 4242 4242 4242 4242
            driver.findElement(By.name("cardnumber")).sendKeys("4242 4242 4242 4242");
            // 40 | type | name=exp-date | 11 / 21
            driver.findElement(By.name("exp-date")).sendKeys("11 / 21");
            // 41 | type | name=cvc | 111
            driver.findElement(By.name("cvc")).sendKeys("111");
            // 42 | selectFrame | relative=parent |
            driver.switchTo().defaultContent();
            // 43 | click | css=.amasty > span |
            driver.findElement(By.cssSelector(".amasty > span")).click();
            // 44 | runScript | window.scrollTo(0,92) |
            js.executeScript("window.scrollTo(0,92)");
            // 45 | mouseDownAt | id=checkout | 40,71
            {
                WebElement element = driver.findElement(By.id("checkout"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).clickAndHold().perform();
            }
            // 46 | mouseMoveAt | id=checkout | 40,71
            {
                WebElement element = driver.findElement(By.id("checkout"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).perform();
            }
            // 47 | mouseUpAt | id=checkout | 40,71
            {
                WebElement element = driver.findElement(By.id("checkout"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).release().perform();
            }
            // 48 | click | css=html |
            driver.findElement(By.cssSelector("html")).click();
            // 49 | click | css=.totals-tax > .amount |
            driver.findElement(By.cssSelector(".totals-tax > .amount")).click();
            // 50 | click | css=.product-item:nth-child(1) .delete |
            driver.findElement(By.cssSelector(".product-item:nth-child(1) .delete")).click();
            // 51 | click | css=.action-primary |
            driver.findElement(By.cssSelector(".action-primary")).click();
            // 52 | click | css=.wf-cart |
            driver.findElement(By.cssSelector(".wf-cart")).click();
            // 53 | mouseDownAt | id=cart-2190716-qty | 8.34375,28.03125
            {
                WebElement element = driver.findElement(By.id("cart-2190716-qty"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).clickAndHold().perform();
            }
            // 54 | mouseMoveAt | id=cart-2190716-qty | 8.34375,28.03125
            {
                WebElement element = driver.findElement(By.id("cart-2190716-qty"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).perform();
            }
            // 55 | mouseUpAt | id=cart-2190716-qty | 8.34375,28.03125
            {
                WebElement element = driver.findElement(By.id("cart-2190716-qty"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).release().perform();
            }
            // 56 | click | id=cart-2190716-qty |
            driver.findElement(By.id("cart-2190716-qty")).click();
            // 57 | type | id=cart-2190716-qty | 3
            driver.findElement(By.id("cart-2190716-qty")).sendKeys("3");
            // 58 | click | css=.update > span |
            driver.findElement(By.cssSelector(".update > span")).click();
            // 59 | click | css=.item-info > .subtotal |
            driver.findElement(By.cssSelector(".item-info > .subtotal")).click();
            // 60 | click | css=.item > .action |
            driver.findElement(By.cssSelector(".item > .action")).click();
            // 61 | mouseOver | css=.item > .action |
            {
                WebElement element = driver.findElement(By.cssSelector(".item > .action"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).perform();
            }
            // 62 | click | css=.amasty |
            driver.findElement(By.cssSelector(".amasty")).click();
            // 63 | selectFrame | index=5 |
            driver.switchTo().frame(5);
            // 64 | click | name=cardnumber |
            driver.findElement(By.name("cardnumber")).click();
            // 65 | type | name=cardnumber | 4242 4242 4242 4242
            driver.findElement(By.name("cardnumber")).sendKeys("4242 4242 4242 4242");
            // 66 | type | name=exp-date | 04 / 24
            driver.findElement(By.name("exp-date")).sendKeys("04 / 24");
            // 67 | type | name=cvc | 42
            driver.findElement(By.name("cvc")).sendKeys("42");
            // 68 | click | name=exp-date |
            driver.findElement(By.name("exp-date")).click();
            // 69 | click | name=cvc |
            driver.findElement(By.name("cvc")).click();
            // 70 | click | css=html |
            driver.findElement(By.cssSelector("html")).click();
            // 71 | click | name=cvc |
            driver.findElement(By.name("cvc")).click();
            // 72 | click | name=cvc |
            driver.findElement(By.name("cvc")).click();
            // 73 | type | name=cvc | 222
            driver.findElement(By.name("cvc")).sendKeys("222");
            // 74 | selectFrame | relative=parent |
            driver.switchTo().defaultContent();
            // 75 | click | css=.amasty |
            driver.findElement(By.cssSelector(".amasty")).click();
            // 76 | close |  |
            driver.close();
        }
    }

