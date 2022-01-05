package DeitelExercises;

public enum BookShop {
    JHTP("JAVA HOW TO PROGRAM", "2017"),
    CPPHTP("C++ HOW TO PROGRAM", "2018"),
    DJANGOHTP("DJANGO HOW TO PROGRAM", "2019"),
    VBHTP("VISUAL BASIC HOW TO PROGRAM", "2012");


    private  final  String title;
    private final  String copyrightYear;

    BookShop(String title, String copyrightYear){
        this.title= title;
        this.copyrightYear=copyrightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}
