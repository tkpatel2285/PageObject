package Test;

import org.openqa.selenium.By;

public class BuyingProduct extends Utils
{
    public void buying()
    {
        click_Element(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div/div[1]"));
        click_Element(By.xpath("//input[@id=\"add-to-cart-button-4\"]"));
        // explicitywait();
        click_Element(By.linkText("Shopping cart"));
        click_Element(By.xpath("//input[@id='termsofservice']"));
        click_Element(By.id("checkout"));
        send_keys(By.id("Email"),("tkpatel2285@gmail.com"));
        send_keys(By.id("Password"),("Tarun123"));
        click_Element(By.xpath("//div[@class=\"returning-wrapper fieldset\"]/form/div[3]/input"));
        click_Element(By.xpath("//input[@id='termsofservice']"));
        click_Element(By.id("checkout"));
        click_Element(By.xpath("//div[@id=\"billing-buttons-container\"]/input"));
        click_Element(By.xpath("//div[@id=\"shipping-method-buttons-container\"]/input"));
        click_Element(By.id("paymentmethod_1"));
        click_Element(By.xpath("//div[@id=\"payment-method-buttons-container\"]/input"));
        // requirement of visa card exp (20/2011) is wrong so we cant go further as need to clarify with BA
    }

}
