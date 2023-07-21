package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

/**
 * 2.ResultPage
 *   Locators - resultText
 *   Method - verifyTheResults(String expected)
 */

public class ResultPage extends Utility
{

    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;


    public void verifyTheResults(String expected) {

        assertVerifyText(resultText,expected,"Message not match");
    }

}
