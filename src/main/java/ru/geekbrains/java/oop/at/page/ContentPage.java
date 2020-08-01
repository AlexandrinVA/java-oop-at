package ru.geekbrains.java.oop.at.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.java.oop.at.block.LeftNavigation;

public class ContentPage extends PageFactory {



    @FindBy(css = "[id='top-menu']")
    private WebElement header;

    @FindBy(css = "[class='site-footer']")
    private WebElement footer;

    @FindBy(css = "[id=\"top-menu\"] [class=\"gb-header__title\"]")
    private WebElement namePage;


    @FindBy(css = "[class=\"gb-empopup-close\"]")
    private WebElement buttonClosePopUp1;


    @FindBy(css = "button [class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonClosePopUp2;



    private LeftNavigation leftNavigation;

    public ContentPage(WebDriver driver){
        initElements(driver, this);
        leftNavigation = new LeftNavigation(driver);
    }

    public void checkNamePage(String expectedNamePage){
        Assertions.assertEquals(expectedNamePage, namePage.getText());
    }


    public LeftNavigation getLeftNavigation() {
        return leftNavigation;
    }

    public WebElement getButtonClosePopUp1() {
        return buttonClosePopUp1;
    }

    public WebElement getButtonClosePopUp2() {
        return buttonClosePopUp2;
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getFooter() {
        return footer;
    }



}
