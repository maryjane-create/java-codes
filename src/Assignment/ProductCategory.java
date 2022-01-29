package Assignment;

public class ProductCategory extends  Sellers {
    private String electronics;
    private  String groceries;
    private  String utensils;
    private  String clothing;


    public ProductCategory(String name, String phoneNumber, int age, String emailAddress, HomeAddress homeAddress, String password) {
        super(name, phoneNumber, age, emailAddress, homeAddress, password);
    }
}
