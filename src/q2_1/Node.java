package q2_1;

public class Node {
    private Node next;
    private String value;

    public Node(Node next, String value) {
        this.next = next;
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (next != null ? !next.equals(node.next) : node.next != null) return false;
        return value != null ? value.equals(node.value) : node.value == null;
    }

    @Override
    public int hashCode() {
        int result = next != null ? next.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
