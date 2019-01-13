package Test;

import org.openqa.selenium.By;


public class UserShouldBeSentEmailSuccessfully extends Utils
{

   public void UserShouldBeSentEmailSuccessfully() {

      click_Element(By.linkText("Log in"));//click on Login page
      send_keys(By.id("Email"),("tkpatel2285@gmail.com"));//enter register email address
      send_keys(By.id("Password"),("Tarun123"));//enter valid Password
      click_Element(By.xpath("//form[@method=\"post\"]/div[3]/input"));//click on login button
      //click on any product
      click_Element(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div/div[2]/h2/a"));
      click_Element(By.xpath("//div[@class=\"overview-buttons\"]/div[3]"));//click on "Email a friend" Button
      driver.findElement(By.xpath("//input[@id='FriendEmail']")).sendKeys(new CharSequence[]{"tkpatel2285@gmail.com"});//enter friend's email address
      click_Element(By.xpath("//form[@method=\"post\"]/div[2]/input"));//click on SEND EMAIL button
      String AculatMessgae = driver.findElement(By.xpath("//div[@class=\'result\']")).getText();
      assert_element(AculatMessgae,"Your message has been sent.", "Email address is not valis");//expected result "Your message has been sent"
      //actual result "Your message has been sent"
      click_Element(By.linkText("Log out"));//test case pass

   }

   }