package Test;

import org.openqa.selenium.By;

import static Test.Utils.click_Element;

public class UnregisterShouldNotbeAbleToSendEmail extends Utils
{

public void unregisterEmailUserNotBeAble()
{
    // click on any product
    click_Element(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div/div[2]/h2/a"));
    click_Element(By.xpath("//div[@class=\"overview-buttons\"]/div[3]"));////click on "Email a friend" Button
    driver.findElement(By.xpath("//input[@id='FriendEmail']")).sendKeys(new CharSequence[]{"tkpatel2285@gmail.com"});//enter friend's email address
    driver.findElement(By.xpath("//input[@id='YourEmailAddress']")).sendKeys(new CharSequence[]{"tkpaagv@gmail.com"});//enter unregister email address
    click_Element(By.xpath("//form[@method=\"post\"]/div[2]/input"));//click on SEND EMAIL button
    String actualerrormessage = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]")).getText();
    assert_element(actualerrormessage,"Only registered customers can use email a friend feature", "You need to Register ur email address");
    //expected result = "Only registered customers can use email a friend feature"
    //actual result = "Only registered customers can use email a friend feature"
    //Test case pass


}



}
