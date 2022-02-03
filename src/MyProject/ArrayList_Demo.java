package MyProject;

public class ArrayList_Demo {
    int num;
    String [] array=new String[num];

    public static void main(String[] args) {
        String [] letters={"dk", "hh", "jj"};
        ArrayList_Demo arrayList_demo=new ArrayList_Demo(6, letters);
        arrayList_demo.addElement("for", 0);
    }

    public ArrayList_Demo(int num, String [] array) {
        this.num = num;
        this.array=array;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void addElement(String element, int index){
//        while (index< array.length){
         array[index]=element;
            for (int i=0; i<array.length; i++){
                System.out.println(array[i]);

            }
        }
    }










//}
