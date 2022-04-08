package sum.odd.b.tree;

import java.util.ArrayList;

public class BinarySearchTree<T extends Comparable<T>> {
    private  Node<T> root;
    private int size;

    public Node<T> getRoot() {
        return root;
    }

    public String insert(T data) {
        if (isTreeEmpty()) {
            this.root = new BinaryNode <> (data);

            size++;
            return "root";
        } else {
            return insertNew(data, root);
        }
    }

    private String insertNew(T data, Node<T> root) {

        if (data.compareTo (root.getData()) < 0)
        {
            if (root.getLeftNode () != null)
            {
                insertNew(data, root.getLeftNode());
            }
            else {
                Node<T> newNode= new BinaryNode <> (data);
                root.setLeftNode (newNode);
                size++;
            }
            return "left";
        }
        else if (data.compareTo(root.getData()) > 0) {

            if (root.getRightNode() != null) {
                insertNew(data, root.getRightNode());
            } else {
                Node<T> newNode = new BinaryNode(data);
                root.setRightNode(newNode);
                size++;
                System.out.println("INSERT" + data);
            }
            return "right";
        }
        return "no";

    }



    public boolean isTreeEmpty() {
        if(root == null)
        {
            return true;
        }
        return false ;
    }


    ////////
    ArrayList<Integer> sum=new ArrayList();


    public int sumOdd(BinarySearchTree tree) {
        odd(tree.getRoot());
        int summation= sum.stream()
                .mapToInt(Integer::intValue)
                .sum();
        ;

        return summation;

    }

    private void odd(Node<T> treeNode) {
        if (treeNode == null) { // base case
            return;
        }

        odd(treeNode.getLeftNode()); // left
        if((Integer) treeNode.getData()%2!=0){
            sum.add((Integer)treeNode.getData());
        }


        odd(treeNode.getRightNode()); // right
    }



}
