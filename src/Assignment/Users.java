package Assignment;

public abstract  class Users {



    String name="";
    String phoneNumber="";
    int age=0;
    String emailAddress="";
    HomeAddress homeAddress;
    String password="556677";

//    public Users(String name, String phoneNumber, int age, String emailAddress, HomeAddress homeAddress, String password ) {
//        this.name = name;
//        this.phoneNumber=phoneNumber;
//        this.age=age;
//        this.emailAddress=emailAddress;
//        this.homeAddress=homeAddress;
//        this.password=password;
//    }

    public Users(String name) {
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0 || age >150){
            throw  new ArithmeticException("age out of bounds");
        }
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public HomeAddress getHomeAddress() {
        return homeAddress;

    }

    public String getPassword() {
        return password;
    }

//    public void setPassword(String password) {
//
//
//        this.password = password;
//    }

    public void setHomeAddress(HomeAddress homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setEmailAddress(String emailAddress) {

        if (!password.equals("556677")){
            throw new IllegalArgumentException("incorrect password");
        }
        this.emailAddress = emailAddress;
    }

    public abstract   void  accessGoods(String emailAddress, String password );








}
