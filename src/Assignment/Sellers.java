package Assignment;

public abstract class Sellers extends  Users {
    public Sellers(String name, String phoneNumber, int age, String emailAddress, HomeAddress homeAddress, String password) {
        super(name, phoneNumber, age, emailAddress, homeAddress, password);
    }

    @Override
    public void accessGoods(String emailAddress, String password) {

    }
}
