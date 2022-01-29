package Assignment;

public class ShoppingCart extends  Items {



    private Items items;

    public ShoppingCart(Items items) {
        super();
        this.items = items;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }
}
