package MyProject;

public class ValidateInput {

    public static boolean validateName(String name) {
     return name.matches("[A-Z][a-zA-Z]*");
    }

    public boolean validateFirstName(String firstName){
        return firstName.matches("[A-Z][a-zA-Z]*");
    }




}
