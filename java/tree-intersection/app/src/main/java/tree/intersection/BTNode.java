package tree.intersection;

public class BTNode<T> {

    BTNode left;
    BTNode right;
    T value;

    public BTNode(T value) {
        this.value=value;

    }

    public BTNode getLeft() {
        return left;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
