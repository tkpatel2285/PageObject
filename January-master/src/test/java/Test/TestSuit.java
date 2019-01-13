package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{
    BuyingProduct a1 = new BuyingProduct();
    UserShouldBeRegister usershouldberegister = new UserShouldBeRegister();
    UserShouldBeSentEmailSuccessfully userShouldBeSentEmailSuccessfully = new UserShouldBeSentEmailSuccessfully();
    UnregisterShouldNotbeAbleToSendEmail unreg = new UnregisterShouldNotbeAbleToSendEmail();
    ShoppingCart shopingcart = new ShoppingCart();
    HighPriceToLow highpricetolow = new HighPriceToLow();
    HomePage a2 = new HomePage();
    Jewellery a3 = new Jewellery();

    @Test
    public void buyingProductSuccesfully() {
        a1.buying();

    }

    @Test
    public void userShouldBeRegistersucessfullygkkkk()//for register new user
    {
        usershouldberegister.userShouldBeRegister();
        click_Element(By.linkText("Log out"));
    }

    @Test
    public void userShouldEmailSuccessfullyToFriend()//for send an email for product to friend with valid login
    {
        userShouldBeSentEmailSuccessfully.UserShouldBeSentEmailSuccessfully();

    }

    @Test
    public void userShouldNotEmail()//for cant send an email for product to friend without register email
    {
        unreg.unregisterEmailUserNotBeAble();
    }

    @Test
    public void termsConditions()//terms n condition needs to accept
    {
        shopingcart.ClickTermsCondition();
    }


    @Test
    public void highpriceToLowprice() {
        highpricetolow.SortThePriceHighToLow();
    }

    @Test
    public void addtoCartButtonPresentInHomepage()
    {
        a2.addtoCartButtonPresent();
    }
    @Test
    public void jewelleryEuroTodollor(){

        a3.dollorToEuro();
    }


}


