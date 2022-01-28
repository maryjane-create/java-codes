package MyProject;

import java.util.ArrayList;

public class Diary {


    private  String ownerName;
    private  ArrayList<String>entriesList;
    private  String password;

    public Diary(String ownerName,ArrayList<String> entriesList, String password) {
        this.ownerName = ownerName;
        this.entriesList=entriesList;
        this.password=password;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ArrayList<String> getEntriesList() {
        return entriesList;
    }

    public void setEntriesList(ArrayList<String> entriesList) {
        if ( entriesList==null){throw new NullPointerException("entry list must not be null");}
        this.entriesList.addAll(entriesList);
    }

    public String getPassword() {
        return password;
    }
}
