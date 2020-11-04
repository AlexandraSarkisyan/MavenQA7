package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HelpMenuPageHelper extends PageBase{

    public HelpMenuPageHelper(WebDriver driver) {
        super(driver);
    }
    public String getTitleText(){
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='vsc7lMp7MQFsrC']")));
        return driver.findElement(By.xpath("//a[contains(text(),'Getting Started Guide')]")).getText();

    }
    public String getTitleText2(){
        return driver.findElement(By.xpath("//a[contains(text(),'Getting started with Trello video Demo')]")).getText();

    }
    public String getTitleText3(){
        return driver.findElement(By.xpath("//a[contains(text(),'Troubleshooting browser issues with Trello')]")).getText();

    }
    public String getTitleText4(){
         return driver.findElement(By.xpath("//a[contains(text(),'What are teams?')]")).getText();

    }
    public String getTitleText5(){
         return driver.findElement(By.xpath("//a[contains(text(),'How to use Trello like a pro')]")).getText();

    }
    /*public List<WebElement>  getListText(){
        List<WebElement> helpList =driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='vsc7lMp7MQFsrC']")));
       return driver.findElement(By.xpath("//a[@target='_blank']")).getText();
    }*/
}
