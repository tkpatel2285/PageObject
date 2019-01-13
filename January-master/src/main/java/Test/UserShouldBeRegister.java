package Test;

import org.openqa.selenium.By;

import java.text.SimpleDateFormat;
import java.util.Date;


public class UserShouldBeRegister extends Utils{

    public void userShouldBeRegister()
    {

        click_Element(By.linkText("Register"));//click on register page
        click_Element(By.id("gender-male"));//select gender
        send_keys(By.id("FirstName"),("Tarun"));//type firstname
        send_keys(By.id("LastName"),("Patel"));//type last name
    //select date of Birth
        click_Element(By.xpath("//div[@class=\"page registration-page\"]/div[2]/form/div[1]/div[2]/div[4]/div/select[1]/option[5]"));
        click_Element(By.xpath("//div[@class=\"page registration-page\"]/div[2]/form/div[1]/div[2]/div[4]/div/select[2]/option[3]"));
        click_Element(By.xpath("//div[@class=\"page registration-page\"]/div[2]/form/div[1]/div[2]/div[4]/div/select[3]/option[79]"));
    //Date format so no need to change email
    SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyyMMddHHmm");
    Date date = new Date();
    String date1 = dateFormat1.format(date);
        send_keys(By.id("Email"),("tkpatel22851789+" + date1 + "@gmail.com"));//enter email address
        send_keys(By.id("Company"),("Shreeji Ltd"));
        click_Element(By.id("Newsletter"));
        send_keys(By.id("Password"),("Tkpat1"));//enter password
        send_keys(By.id("ConfirmPassword"),("Tkpat1"));//reenter password
        click_Element(By.id("register-button"));//click on register button
    String actualRegisterSuccessMessage = driver.findElement(By.xpath("//div[@class='result']")).getText();//expected result"Your registration completed"
    // actual result "Your registration completed"
        assert_element(actualRegisterSuccessMessage,"Your registration completed","Test case failed");

    }
}
