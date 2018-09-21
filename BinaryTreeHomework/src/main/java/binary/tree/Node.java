package binary.tree;

public class Node {
    private Node leftValue;
    private Node rightValue;
    private int value;

    public Node(int value) {

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

        Node node = (Node) o;

        if (value != node.value) return false;
        if (leftValue != null ? !leftValue.equals(node.leftValue) : node.leftValue != null) return false;
        return rightValue != null ? rightValue.equals(node.rightValue) : node.rightValue == null;
    }

    @Override
    public int hashCode() {
        int result = leftValue != null ? leftValue.hashCode() : 0;
        result = 31 * result + (rightValue != null ? rightValue.hashCode() : 0);
        result = 31 * result + value;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
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
}