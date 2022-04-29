package DeitelExercises;

public class Pig {

    public StringBuilder reversedWord(StringBuilder word) {
        StringBuilder worder= word.append(word.charAt(0)).deleteCharAt(0).append('a').append('y');
        return  worder;

    }
}
