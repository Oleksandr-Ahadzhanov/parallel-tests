package module.with.test.classes;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FirstTest {

    @Test
    void oneTestMethod() {
        open("http://google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $$(By.xpath("//div[@class='g']")).shouldHave(CollectionCondition.size(7));
    }
    @Test
    void twoTestMethod() throws Exception {
        Thread.sleep(5000);
    }
    @Test
    void threeTestMethod() throws Exception {
        Thread.sleep(5000);
    }
    @Test
    void fourTestMethod() throws Exception {
        Thread.sleep(5000);
    }
    @Test
    void fiveTestMethod() throws Exception {
        Thread.sleep(5000);
    }
    @Test
    void sixTestMethod() throws Exception {
        Thread.sleep(5000);
    }
    @Test
    void sevenTestMethod() throws Exception {
        Thread.sleep(5000);
    }
    @Test
    void eightTestMethod() throws Exception {
        Thread.sleep(5000);
    }
    @Test
    void nineTestMethod() throws Exception {
        Thread.sleep(5000);
    }
    @Test
    void tenTestMethod() throws Exception {
        Thread.sleep(5000);
    }
}