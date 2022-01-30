package MyProject;

public class Staff {

    private final String firstName;
    private  final  String lastName;
    private final String StaffId;
    private final String faculty;


    public Staff(String firstName, String lastName, String staffId, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        StaffId = staffId;
        this.faculty = faculty;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStaffId() {
        return StaffId;
    }

    public String getFaculty() {
        return faculty;
    }

    public  String toString(){
        return  String.format("%s", getFaculty(), "%s", getStaffId());
    }
}
