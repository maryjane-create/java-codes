package Assignment;

public class BillingInfo {

    private String name;
    private String phoneNumber;
    private String deliveryAddress;
    private String creditCardNumber;
    private  String receiverPhoneNumber;
    private  String receiverName;


    public BillingInfo(String name, String phoneNumber, String deliveryAddress, String creditCardNumber, String receiverPhoneNumber, String receiverName) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.deliveryAddress = deliveryAddress;
        this.creditCardNumber=creditCardNumber;
        this.receiverPhoneNumber=receiverPhoneNumber;
        this.receiverName=receiverName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }


    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        if (receiverPhoneNumber.length()>11 || receiverPhoneNumber.length()<1){
            throw new IllegalArgumentException("please input a valid phone number");
        }
        this.receiverPhoneNumber = receiverPhoneNumber;
    }
}



