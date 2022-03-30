package steps;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.model.TakeScreenshots;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.CategoryPage;

import java.io.ByteArrayInputStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CategorySteps {
    private CategoryPage categoryPage;

    @Step("Bla bla")
    @io.qameta.allure.Step("Open URL")
    public void openCategoryPage(String categoryName) {
        categoryPage.openUrl("https://www.mvideo.ru/" + categoryName);
    }

    @Step
    @io.qameta.allure.Step("Check title")
    public void checkTitle(String name) {
        assertThat(name,is(equalTo(categoryPage.getCategoryTitle())));
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] takeScreenShot() {
        return ((TakesScreenshot)categoryPage.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
