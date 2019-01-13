package Test;

import org.openqa.selenium.By;

public class HighPriceToLow extends Utils
{
    public void SortThePriceHighToLow() {

        click_Element(By.linkText("Electronics"));
        click_Element(By.linkText("Camera & photo"));
        click_Element(By.xpath("//select[@aria-label=\"Select product sort order\"]/option[5]"));
        String highprice = get_text_Element(By.xpath("//div[@class='item-grid']/div[1]/div/div[2]/div[3]/div[1]/span"));
        String lowprice = get_text_Element(By.xpath("//div[@class=\"item-grid\"]/div[3]/div/div[2]/div[3]/div[1]/span"));
        float hp = Float.parseFloat(((highprice.replace("$", ""))));
        float lp = Float.parseFloat((lowprice.replace("$", "")));


    }

}
