package DeitelExercises;

public class Time1 {

    private  int hour;
    private  int minute;
    private  int second;

    public  void setTime(int hour, int minute, int second){
        if (hour<0||hour>12||minute<0||minute>59||second<0||second>59){
            throw new IllegalArgumentException("time out of bounds");

        }
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public  String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
        public String toString(){
            return String.format("%02d:%02d:02d %s", hour,minute,second);
        }

}
