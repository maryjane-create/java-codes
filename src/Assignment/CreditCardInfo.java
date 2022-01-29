package Assignment;

import java.time.LocalDate;

public class CreditCardInfo {


    private  String name;
    private  String cvv;
    private LocalDate cardExpirationDate;
    private  String cardType;

    public CreditCardInfo(String name, String cvv, LocalDate cardExpirationDate, String cardType) {
        this.name = name;
        this.cvv=cvv;
        this.cardExpirationDate=cardExpirationDate;
        this.cardType=cardType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public LocalDate getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(LocalDate cardExpirationDate) {
        cardExpirationDate=LocalDate.now();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        if (!cardType.equals("master-card")) {
            throw new IllegalArgumentException("enter valid card type");
        }
        else if (!cardType.equals("visa-card") ) {
            throw new IllegalArgumentException("enter valid card type");
        }
        else if ( !cardType.equals("America-express")){
            throw  new IllegalArgumentException("enter valid card type");
        }

        this.cardType = cardType;
    }
}
