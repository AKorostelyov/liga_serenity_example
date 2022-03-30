package pages;


import io.qameta.allure.Attachment;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.model.TakeScreenshots;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.FindBy;

import java.io.ByteArrayInputStream;
import java.util.List;

public class CategoryPage extends PageObject {

    @FindBy(xpath = "//h1[contains(@class,'fl-h1')]")
    WebElementFacade categoryTitle;


    public void getSubCategories() {
        List<WebElementFacade> elementList = findAll(
                By.xpath("//div[contains(@class,'categories')]//li[contains(@class, 'gallery-list-item')]//div[contains(@class, 'title')]")
        );
    }

    public String getCategoryTitle() {
        return categoryTitle.getText();
    }
}
