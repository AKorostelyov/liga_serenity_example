package definitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import datatables.KeyList;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Steps;
import steps.CategorySteps;

import java.util.List;
import java.util.Map;

public class CategoryStepsDefinitions {
    @Steps
    CategorySteps categorySteps;

    @Пусть("пользователь открывает страницу {word}")
    public void userOpenPage(String pageName) {
        categorySteps.openCategoryPage(pageName);
    }

    @Тогда("на странице отображается заголовок {word}")
    public void pageTitleShouldBe(String title){
        categorySteps.checkTitle(title);
    }
}
