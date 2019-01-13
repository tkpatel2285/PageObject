package Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;


import java.util.List;

public class HomePage extends Utils {

    SoftAssert softAssert = new SoftAssert();

    public void addtoCartButtonPresent() {
        int a = 0;
        // Arreylist method to get the list
        List<WebElement> addtocart = findElements(By.xpath("// div[@class=\"item-grid\"]/div/div[@class=\"product-item\"]/div[2]/div[3]/div[2]/input[1]"));

//for each to get the value for "Add to cart button" and increase
        for (WebElement b2 : addtocart) {
            softAssert.assertEquals("Add to cart", b2.getAttribute("value"));
            a++;
            System.out.println(b2.getAttribute("Value"));
        }

        System.out.println("****************************");
//      compare the actual vs expected addtocart button present
        assert_element(addtocart.size(), a, "Test case failed");

        System.out.println(addtocart.size() + "");
        System.out.println(a + "");
//        softAssert.assertAll();


    }
}