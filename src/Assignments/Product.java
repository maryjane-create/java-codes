package Assignments;

public class Product {

    private  ProductCategory productCategory;
    private String productId;
    private  String productName;
    private  String productDescription;
//    private String productCategory;


    public Product(String productId, String productName, String productDescription) {

        this.productId = productId;
        this.productName=productName;
        this.productDescription=productDescription;
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
}
