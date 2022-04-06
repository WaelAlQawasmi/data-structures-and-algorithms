package tree.fizz.buzz;


import javax.swing.*;
import java.util.ArrayList;

public class kArrTree<T> {
    ArrayList data=new ArrayList<>();
    public Node getRoot() {
        return root;
    }

    private Node root;

    public kArrTree(Node node)
    {
        this.root = node;
    }


    public ArrayList print() {
        data.clear();
        printall(getRoot());
        return data;
    }
    public void printall(Node node)
    {
        if (node == null)
        {
            return;
        }
        int i = 0;
        Node temp = null;
data.add(node.getValue());
        System.out.print(node.getValue()+" ");

        while (i < node.getChild().size())
        {
            temp = (Node) node.getChild().get(i);
            printall(temp);
            i++;
        }
    }








}
