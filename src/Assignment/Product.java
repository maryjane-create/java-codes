package Assignment;

public class Product  extends ProductCategory{

    private  ProductCategory productCategory;
    private String productId;
    private  String productName;
    private ProductCategory electronics;
    private ProductCategory groceries;
    private ProductCategory utensils;
    private ProductCategory clothing;
//    private  String productDescription;
//    private String productCategory;


    public Product(String productId, String productName) {

        this.productId = productId;
        this.productName=productName;
//        this.productDescription=productDescription;
//        this.productCategory=productCategory;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductCategory getProductCategory() {
        if ( productId== "222"){return electronics;}
        if (productId=="111"){return groceries;}
        if (productId=="333"){return utensils;}
        if (productId=="444"){return clothing;}
        return productCategory;

    }
//    public  String toString(){
//        return String.format("%s %s %s %n", electronics);
//    }


}
