package Assignment;

public class HomeAddress {
    String cityName;
    String stateOfOrigin;
    String countryName;
    int houseNUmber;
    String street;


    public HomeAddress(String cityName, String stateOfOrigin, String countryName, int houseNUmber, String street) {
         this.cityName=cityName;
         this.stateOfOrigin=stateOfOrigin;
         this.countryName=countryName;
         this.houseNUmber=houseNUmber;
         this.street=street;
    }


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateOfOrigin() {
        return stateOfOrigin;
    }

    public void setStateOfOrigin(String stateOfOrigin) {
        this.stateOfOrigin = stateOfOrigin;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) throws IllegalAccessException {
        if (countryName!="Nigeria"){
            throw  new IllegalAccessException("Please enter your country of residence");
        }
        this.countryName = countryName;
    }

    public int getHouseNUmber() {
        return houseNUmber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNUmber(int houseNUmber) throws IllegalAccessException {
        if (houseNUmber<0 || houseNUmber>1000){
            throw  new IllegalAccessException ("please enter a valid house number");

        }

        this.houseNUmber = houseNUmber;
    }
}
