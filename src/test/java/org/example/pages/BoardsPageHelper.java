package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoardsPageHelper extends PageBase{
    @FindBy(xpath = "//button[@data-test-id ='header-boards-menu-button']")
    WebElement boardsButton;

    public BoardsPageHelper(WebDriver driver){
        super(driver);
        this.driver= driver;
    }
    public BoardsPageHelper waitUntilPageIsLoaded() {
        waitUntilElementIsClickable(boardsButton,45);
        return this;
    }

    public BoardsPageHelper openCurrentBoardPage2(String boardName) {
        //div[@class='_1fp0H2u2NFTsxl'][.//a[@title ='QAHaifa7']]
        //String xpath = "//div[@class='_1fp0H2u2NFTsxl'][.//a[@title ='"+boardName+"']]";
       String xpath = "//li[@class='boards-page-board-section-list-item'][.//div[@title ='"+boardName+"']]";
        waitUntilElementIsVisible(driver.findElement(By.xpath(xpath)),25);
        WebElement board = driver.findElement(By
                .xpath(xpath));
        board.click();
        return this;
    }
    public BoardsPageHelper openCurrentBoardPage(String boardName) {
        String xpath = "//li[@class='boards-page-board-section-list-item'][.//div[@title ='" + boardName+"']]";
        waitUntilElementIsVisible(driver.findElement(By.xpath(xpath)),15);
        WebElement board = driver.findElement(By
                .xpath(xpath));
        board.click();
        return this;
    }

    public String getBoardsIconName(){
        return boardsButton.getText();
    }
}
