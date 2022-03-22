import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
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
    public void simpleTest() {
        categorySteps.openCategoryPage("telefony");
        categorySteps.checkTitle("Телефоны");
    }
}
