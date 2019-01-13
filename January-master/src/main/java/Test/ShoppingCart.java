package Test;

import org.openqa.selenium.By;

public class ShoppingCart extends Utils
{
    public void ClickTermsCondition() {
        click_Element(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div/div[1]"));
        click_Element(By.xpath("//input[@id=\"add-to-cart-button-4\"]"));
        click_Element(By.linkText("Shopping cart"));
        //explicitywait();//for explicity wait
        click_Element(By.xpath("//div[@class=\"cart-footer\"]/div[2]/div[4]/button"));
        String acualterms = get_text_Element(By.xpath("//div[@id=\"terms-of-service-warning-box\"]/p"));
        assert_element(acualterms,"Please accept the terms of service before the next step.", "you Must accept terms and conditions");
    }

}
