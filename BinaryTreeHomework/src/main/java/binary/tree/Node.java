package binary.tree;

public class Node<E extends Comparable<E>> implements Comparable<Node<E>> {
    private Node leftValue;
    private Node rightValue;
    private E value;

    public Node(E value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "leftValue=" + leftValue +
                ", rightValue=" + rightValue +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node<?> node = (Node<?>) o;

        if (leftValue != null ? !leftValue.equals(node.leftValue) : node.leftValue != null) return false;
        if (rightValue != null ? !rightValue.equals(node.rightValue) : node.rightValue != null) return false;
        return value != null ? value.equals(node.value) : node.value == null;
    }

    @Override
    public int hashCode() {
        int result = leftValue != null ? leftValue.hashCode() : 0;
        result = 31 * result + (rightValue != null ? rightValue.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    public Node getLeftValue() {

        return leftValue;
    }

    public void setLeftValue(Node leftValue) {
        this.leftValue = leftValue;
    }

    public Node getRightValue() {
        return rightValue;
    }

    public void setRightValue(Node rightValue) {
        this.rightValue = rightValue;
    }

    public E getValue() {
        return this.value;
    }

    public void setValue(E value) {
        this.value = value;
    }


    // this is bulshit dar nu stiu deocamdata cum sa nu imi dea null pointer exception
    public void printNode() {

        if (getLeftValue() != null && getRightValue() == null) {
            System.out.println("node value: " + this.value + " left node value " + this.getLeftValue().getValue());
        }
        if (getLeftValue() == null && getRightValue() != null) {
            System.out.println("node value: " + this.value + " right node value " + this.getRightValue().getValue());
        }
        if (getLeftValue() == null && getRightValue() == null) {
            System.out.println("node value: " + value);
        }
        if (getLeftValue() != null && getRightValue() != null) {
            System.out.println("node value: " + this.value + " right node value " + this.getRightValue().getValue() + " left node value : " + this.getLeftValue().getValue());
        }
    }

//    public int compareTo(Node<E> o) {
//        return getValue().compareTo(o.getValue());
//    }


    @Override
    public int compareTo(Node o) {
        return value.compareTo((E) o.getValue());
    }
}
