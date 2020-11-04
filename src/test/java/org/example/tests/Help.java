package org.example.tests;

import org.example.pages.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Help  extends TestBase{
    HomePageHelper homePage;
    LoginPageHelper loginPage;
    BoardsPageHelper boardsPage;
    CurrentBoardPageHelper qaHaifa7currentBoard;
    MenuPageHelper menuPage;
    HelpMenuPageHelper helpMenu;

    @BeforeMethod
    public void initTest(){
        loginPage= PageFactory.initElements(driver, LoginPageHelper.class);
        boardsPage=PageFactory.initElements(driver, BoardsPageHelper.class);
        qaHaifa7currentBoard = new CurrentBoardPageHelper(driver,"QAHaifa7");
        homePage =PageFactory.initElements(driver, HomePageHelper.class);
        menuPage= PageFactory.initElements(driver,MenuPageHelper.class);
        helpMenu = PageFactory.initElements(driver,HelpMenuPageHelper.class);

        homePage.waitUntilHomePageLoaded().openLoginPage();
        loginPage.waitUntilLoginPageIsLoaded().loginAsAtlassian(LOGIN,PASSWORD);
        boardsPage.waitUntilPageIsLoaded().openCurrentBoardPage("QAHaifa7");
        qaHaifa7currentBoard.waitUntilPageIsLoaded();
        qaHaifa7currentBoard.openMemberMenu();
        menuPage.waitUntilPageIsLoaded();

    }

    @Test
    public void checkHelpList() {
        menuPage.openHelpMenu();
        Assert.assertEquals(helpMenu.getTitleText(),"Getting Started Guide");
        Assert.assertEquals(helpMenu.getTitleText2(),"Getting started with Trello video Demo");
        Assert.assertEquals(helpMenu.getTitleText3(),"Troubleshooting browser issues with Trello");
        Assert.assertEquals(helpMenu.getTitleText4(),"What are teams?");
        Assert.assertEquals(helpMenu.getTitleText5(),"How to use Trello like a pro");
       /* Assert.assertEquals(helpMenu.getListText(),"Getting Started Guide Getting started with Trello video Demo
                "Troubleshooting browser issues with Trello Troubleshooting browser issues with Trello How to use Trello like a pro");*/
}
}
