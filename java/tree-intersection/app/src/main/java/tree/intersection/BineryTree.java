package tree.intersection;

import java.util.ArrayList;
import java.util.HashSet;

public class BineryTree {
    BTNode root;



    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }

    public BineryTree() {

    }
    HashSet<String> Data = new HashSet<String>();
    public  HashSet<String> fetchData(){
       this.Data.clear();
      return   preOrder(this.root);

    }
    public HashSet<String> preOrder(BTNode node) {



        if (node == null) {
            return null;
        }

        this.Data.add(node.getValue().toString());
      //  System.out.println(node.getValue());

        preOrder(node.getLeft());

        preOrder(node.getRight());



        return Data;
    }
}
