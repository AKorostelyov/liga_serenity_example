import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.junit4.DisplayName;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;
import steps.CategorySteps;

@RunWith(SerenityRunner.class)
public class SimpleTest {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    CategorySteps categorySteps;

    @Test
    @Title("Check category name")
    @DisplayName("Test category page")
    @Description("Check category name")
    @Issue("123")
    public void simpleTest() {
        categorySteps.openCategoryPage("telefony");
        categorySteps.checkTitle("Телефоны");
    }

    @After
    public void takeScreenshot() {
        categorySteps.takeScreenShot();
    }

//    @After
//    public void screenShot() {
//        if ()
//        categorySteps.takeScreenShot()
//    }
}
