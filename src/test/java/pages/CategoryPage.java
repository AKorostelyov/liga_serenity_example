package pages;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends PageObject {

    @FindBy(xpath = "//h1[contains(@class,'fl-h1')]")
    WebElementFacade categoryTitle;


    public void getSubCategories() {
        ListOfWebElementFacades elementList = findAll(
                By.xpath("//div[contains(@class,'categories')]//li[contains(@class, 'gallery-list-item')]//div[contains(@class, 'title')]")
        );
    }

    public String getCategoryTitle() {
        return categoryTitle.getText();
    }
}
