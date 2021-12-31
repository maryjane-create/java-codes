package MyProject;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int []numbers= {3,56,78,9,2,1,0};
        linearSearch(numbers,78);
        System.out.println();
        displayNum(numbers,5);
        binarySearch(numbers, 9);
    }

    public  static int linearSearch(int []numbers, int key){
        for (int count =0; count< numbers.length; count++){
            if (key==numbers[count])return count;
            System.out.printf("%d ",count);
        }
        return -1;

    }
    public  static  int displayNum(int []numbers, int key){
        for (int count=0; count<numbers.length; count++) {
            Arrays.binarySearch(numbers,count);
            System.out.printf("%d ", numbers[count]);}
        return -1;
    }

    public  static  int binarySearch(int []list, int key){
        int low=0;
        int high=list.length-1;
        while (high>=low){
            int mid =(low+high)/2;
            if (key<list[mid])high=mid-1;
            else if (key==list[mid])return mid;
            else
                low=mid+1;
        }
        return  -low-1;
    }
























































































//    public static void main(String[] args) {
//        int[] numbers= {5,7, 9,1,7,3,8,6};
//        displaySearchKey(numbers, 6);
//    }
//
//    public  static  int displaySearchKey(int [] numbers, int key){
//
//        for (int count =0; count <numbers.length; count++){
//            if (key==numbers[count]){int result =count;
//            return result;}
//
//
//            System.out.println(count);
//        }
//        return  -1;
//    }
}
