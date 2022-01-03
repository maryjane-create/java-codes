package DeitelExercises;

public class Employee {


private  String firstName;
private  String lastName;
private  static int count =0;

private Employee(String firstName, String lastName){
    this.firstName= firstName;
    this.lastName= lastName;

    count++;

    System.out.printf("employee details: %s %s count :%d", firstName, lastName, count);
}

public String getFirstName(){
    return  firstName;
}

public  String getLastName(){
    return  lastName;
}

public static int getCount(){
    return  count;
}




















































































//    private  static  int count =0;
//    private  String firstName;
//    private String lastName;
//
//    public Employee(String firstName, String lastName){
//        this.firstName=firstName;
//        this.lastName=lastName;
//
//        count++;
//        System.out.printf("employee constructor:%s %s count :%d%n", firstName, lastName, count);
//
//    }
//
//    public  String getFirstName(){
//        return  firstName;
//    }
//    public String getLastName(){
//        return  lastName;
//    }
//    private static  int getCount(){
//        return  count;
//    }
}
