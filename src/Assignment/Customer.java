package Assignment;

public class Customer extends Users {
    BillingInfo billingInfo;
    ShoppingCart shoppingCart;

    public Customer(String name, String phoneNumber, int age, String emailAddress, HomeAddress homeAddress, String password) {
        super(name, phoneNumber, age, emailAddress, homeAddress, password);
    }


    @Override
    public void accessGoods(String emailAddress, String password) {

    }
}
