package DeitelExercises;

public class Grade3 {
    public static void main(String[] args) {


        char[] answer = {'a', 'b', 'c', 'd'};
char[]student1Score={'a', 'a', 'c', 'd'};
char[]student2Score={'d', 'a', 'b', 'c'};
char[]student3Score={'a', 'd', 'c', 'c'};

int student1Grade=0;
int student2Grade=0;
int student3Grade=0;

for (int i=0; i< answer.length;i++){

        if (answer[i]==student1Score[i]){
            student1Grade+=1;
        }

}

for (int i =0; i< answer.length; i++){
    if (answer[i]==student2Score[i]){
        student1Grade+=1;
    }

}

for (int i =0; i< answer.length; i++){
    if (answer[i]==student3Score[i]){
        student3Grade+=1;
    }
}

        System.out.printf("%d%n %d%n %d%n", student1Grade, student2Grade, student3Grade);












    }

}
