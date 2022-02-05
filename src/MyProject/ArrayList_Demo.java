package MyProject;

public class ArrayList_Demo {
    int num;
    String [] array=new String[num];
    private String element;

    public ArrayList_Demo(String[] letters) {
    }

    public static void main(String[] args) {
        String [] letters={"dk", "hh", "jj"};
        ArrayList_Demo arrayList_demo=new ArrayList_Demo( letters);
        arrayList_demo.addElement("fr", 0);

        System.out.println();
        arrayList_demo.removeElement(1);
        System.out.println();
        arrayList_demo.addElementSequentially("egg");


    }

    public void addElement(String element, int index){
         array[index]=element;
            for (int i=0; i<array.length; i++){
                System.out.println(array[i]);

            }
        }


    public String[] removeElement(int index){
                  for (int i=0; i<array.length-1;i++){
                    array[index]=array[i+1];
                    System.out.println(array[i]);
         }

                  return new String[0];
    }


    public String[] addElementSequentially(String element) {
        String[] newString = new String[array.length + 1];
        for (int count = 0; count < newString.length; count++) {
            newString[count] = array[count];
            newString[newString.length - 1] = element;
            System.out.println(newString[count]);
        }
        return newString;
    }
    }










//}
