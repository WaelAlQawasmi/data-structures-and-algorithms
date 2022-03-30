package tree.max;

import java.util.ArrayList;

public class BinaryTree<T extends Comparable<T>>  {

    private ArrayList<Integer> treeDataPost=new ArrayList<>();

    private BTNode root;
private int largest;
    public BTNode getRoot() {

        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }




    public   Integer treeMax(BTNode treeNode) {
        if (treeNode == null) {
            return null;
        }

        treeMax(treeNode.getLeft());
        treeMax(treeNode.getRight());
        if(treeNode.getData()>largest)
        {
            largest=treeNode.getData();
        }

        return  largest;

    }



}