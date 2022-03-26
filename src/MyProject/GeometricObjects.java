package MyProject;

import java.time.LocalDateTime;

public class GeometricObjects {

    boolean isFilled;
    LocalDateTime dateCreated;

    public GeometricObjects(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }
}
