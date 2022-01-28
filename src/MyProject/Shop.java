package MyProject;

public class Shop {
    String itemName;
    double amount;




    public Shop(String itemName) {

        this.itemName=itemName;
        amount=amount;

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getAmount() {
        if ( itemName=="orange"){return 50;}
        if (itemName=="banana"){return  30;}
        if (itemName=="fresh yo"){return  80;}
        return  0;

    }


}
