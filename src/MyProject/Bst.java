package MyProject;

public class Bst {

    public  static  int findTargetNumber(BST tree, int target){
        return  -1;
    }

    static class BST{
        public  int value;
        public  BST left;
        public BST right;

        private  BST(int value){
            this.value=value;
        }
    }
}
