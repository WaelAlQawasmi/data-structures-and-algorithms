package tree.fizz.buzz;

import java.util.ArrayList;

public class Node {

    public ArrayList < Node > child;
    public Object value;

    public ArrayList<Node> getChild() {
        return child;
    }


	public Node(Object value)
        {
            this.value = value;
            this.child = new ArrayList<Node>();}

        public void addChild(Object value)
        {
            Node newChild = new Node(value);
            this.child.add(newChild);
        }



    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
