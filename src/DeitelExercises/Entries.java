package DeitelExercises;

import java.time.LocalDate;

public class Entries {
    private  String title;
    private LocalDate date;
    private  String gist;

    public Entries(String title, LocalDate date, String gist) {
        this.title = title;
        this.date=date;
        this.gist=gist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getGist() {
        return gist;
    }

    public void setGist(String gist) {
        this.gist = gist;
    }
}
