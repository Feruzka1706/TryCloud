package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.utility.BrowserUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class FileActionsStepDefs {
    FilesPage filesPage = new FilesPage();
    String expectedName;

    /**
     * Add To favorites
     */
    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        expectedName = filesPage.chooseRandomFileInFilesPage();
    }

    @When("user choose {string} option")
    public void user_choose_option(String action) {
        filesPage.chooseAction(action);
    }

    @When("user click {string} sub-module on the left side")
    public void user_click_sub_module_on_the_left_side(String subModule) {
        filesPage.chooseSubModule(subModule);
    }

    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {
        List<String> favoritesListNames = BrowserUtil.getElementsText(filesPage.allFileNamesInFavorites);
        System.out.println("favoritesListNames = " + favoritesListNames);
        System.out.println("expectedName = " + expectedName);

        Assert.assertTrue(favoritesListNames.contains(expectedName));
    }
}
