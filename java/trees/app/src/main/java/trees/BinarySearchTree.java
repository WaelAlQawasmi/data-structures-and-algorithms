package trees;

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




    ///////////////////////
    public boolean Contains(T data) {

        if (data.compareTo (root.getData()) == 0)
        {
            return true;}
        else if( data.compareTo (root.getData())>0)

        {      System.out.println("CONTAINS8");
            if(root.getRightNode () != null){
                System.out.println("CONTAINS");
         return    ContainsRecargin(data,root.getRightNode());}
            else
            return false;
        }
            else {
            if(root.getLeftNode() != null) {
                return ContainsRecargin(data, root.getLeftNode());
            }
            }
    return false;}



       ///////////////////////////////////
       private boolean ContainsRecargin(T data, Node<T> root) {

          if(cheack( data,  root)) {
              return true;
          }

           if (root.getLeftNode() != null) {
               if (cheack(data, root.getLeftNode()))
                   return true;
           }
           if (data.compareTo (root.getData()) < 0)
           {

               if (root.getLeftNode () != null)
               {
                   if(cheack( data,  root.getLeftNode()))
                   return true;
                   ContainsRecargin(data, root.getLeftNode());
               }
               else {
                   return false;
               }
           }
           else if (data.compareTo(root.getData()) > 0) {
               if (root.getRightNode() != null) {
                   if(cheack( data,  root.getLeftNode()))
                       return true;
                   ContainsRecargin(data, root.getRightNode());
               }
               else {
                   return false;
               }

           }
           else {
              return false; }

return false;
       }





    public boolean cheack(T data, Node<T> root) {
        if (data.compareTo (root.getData()) == 0)
        { System.out.println(data+"*"+root.getData());
            return true;}
        else
            return false;
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
        inOrder(tree.getRoot());
       int summation= sum.stream()
                .mapToInt(Integer::intValue)
                .sum();
        ;

return summation;

    }

           private void inOrder(Node<T> treeNode) {
               if (treeNode == null) { // base case
                   return;
               }

               inOrder(treeNode.getLeftNode()); // left
        if((Integer) treeNode.getData()%2!=0){
sum.add((Integer)treeNode.getData());
        }


               inOrder(treeNode.getRightNode()); // right
           }


           public void preOrder(Node<T> root){
        if(root!=null){
        System.out.println(root.getData());
        preOrder(root.getLeftNode());
               preOrder(root.getRightNode());
           }}

}
