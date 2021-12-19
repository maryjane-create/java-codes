import java.util.Arrays;


public class ArrayList {
    public static void main(String[] args) {

//      int [] num = {7,3, 4, 9, 1, 0, 4};
//
//      Arrays.sort(num);
//
//      for (int ogu:num){
//          System.out.printf("%d ", ogu);
//          System.out.println();
//      }
//
//
//
//      int [] anotherArray= new  int[8];
//      Arrays.fill(anotherArray, 9);
//      for (int mofe:anotherArray){
//          System.out.printf("%d ", mofe);
//      }
//        System.out.println();





int [] array7 = {3, 8, 2, 0, 4, 5};
int [] wotArray = new  int [array7.length];
System.arraycopy(array7, 0, wotArray, 0, array7.length);
for (int iri:array7) System.out.printf("%d ", iri);
        System.out.println();
for (int ozue:wotArray) System.out.printf("%d ", ozue);

        boolean answer =Arrays.equals(array7, wotArray);
        System.out.println();
        System.out.printf("array7 is %s wotArray", answer? "==" :"!=");


        answer = Arrays.equals(array7, wotArray);
        System.out.println();
        System.out.printf("array7 is %s wotArray", answer?"==" : "!=");


int location = Arrays.binarySearch(array7, 8);

if (location>= 0){
    System.out.printf("found number 8 in array location %d", location);
}
Arrays.equals(wotArray, array7);


//public static  void display(int []array, String description){
//            System.out.printf("%n%s: ", description);
//            for (int value:array7){
//                System.out.printf("%d", value);
//            }
//        }
//
//
//ArrayList <Integer> stringArrayList =new ArrayList<Integer>();
//
//
//stringArrayList.add(4);
//stringArrayList.add(0, 3);
//for (int i=0; i<stringArrayList.size(); i++){
//    System.out.printf("%s", stringArrayList.get(i));
//    stringArrayList.remove
//}


//        int num=Integer.parseInt("20");
//        System.out.println(num);
        }

    }

