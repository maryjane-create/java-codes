package DeitelExercises;

public class Grade2 {
    public static void main(String[] args) {
int score=0;

        char[] answer = {'a', 'b', 'c', 'd'};
        char[][] studentScore = {{'a', 'a', 'c', 'd'}, {'d', 'a', 'b', 'c'}, {'a', 'd', 'a', 'c'}};

for (int i=0; i< answer.length;i++){
    for (int j=0; j< studentScore.length;j++) {
        if (answer[j] == studentScore[j][i]){
            score+=1;
        }
    }
}

        System.out.printf("%d", score);



    }
}
