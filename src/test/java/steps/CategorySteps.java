package steps;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import pages.CategoryPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CategorySteps {
    private CategoryPage categoryPage;

    @Step
    public void openCategoryPage(String categoryName) {
        categoryPage.open("https://www.mvideo.ru/" + categoryName);
    }

    @Step
    public void checkTitle(String name) {
        assertThat(name,is(equalTo(categoryPage.getCategoryTitle())));
    }
}
