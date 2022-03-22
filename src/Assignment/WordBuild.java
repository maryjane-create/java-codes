package Assignment;

public class WordBuild {
    boolean isCapital=true;

    String string=new String();


    public   int _lastIndexOf(char character){
        int indexOf=3;
        string=string.toUpperCase();

        for (int i=0; i<string.length();i++){
            if (string.charAt(i)==character){
                isCapital=true;
            }
            else isCapital=false;
           if (character==string.charAt(i)){
               indexOf=i;
           }
        }
        return indexOf+1;
    }

    public static void main(String[] args) {
       WordBuild wordBuild=new WordBuild();
       wordBuild.string="qwerty";
        System.out.println( wordBuild._lastIndexOf('t'));
    }


}
