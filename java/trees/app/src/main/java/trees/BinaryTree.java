package trees;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>>  {

    private ArrayList<String> treeDataPost=new ArrayList<>();
   private ArrayList<String> treeDataPre=new ArrayList<>();
   private ArrayList<String> treeDataIn=new ArrayList<>();
        private BTNode root;

        public BTNode getRoot() {

            return root;
        }

        public void setRoot(BTNode root) {
            this.root = root;
        }

    public  String[] inOrder(BTNode  treeNode) {
        if (treeNode == null) { // base case
            return null;
        }

        inOrder(treeNode.getLeft()); // left

System.out.println(treeNode.getData()); // root
        this.treeDataIn.add(treeNode.getData());
        inOrder(treeNode.getRight()); // right


        String[]data= treeDataIn.toArray(new String[0]);
        return  data ;
    }

    public  String[] preOrder(BTNode treeNode) {
        if (treeNode == null) {
            return null;
        }

        this.treeDataPre.add(treeNode.getData());
        System.out.println(treeNode.getData());

        preOrder(treeNode.getLeft());

        preOrder(treeNode.getRight());


        String[]data2= treeDataPre.toArray(new String[0]);
        System.out.println(treeDataPre);
        return  data2 ;
    }

    public   String[] postOrder(BTNode treeNode) {
        if (treeNode == null) {
            return null;
        }

        postOrder(treeNode.getLeft());
        postOrder(treeNode.getRight());




     this.treeDataPost.add(treeNode.getData());
     String[]data= treeDataPost.toArray(new String[0]);
return  data ;

    }



}
