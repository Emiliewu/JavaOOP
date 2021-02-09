
public class Node<E> {
	public E value;
    public Node next;
    public Node(E value, Node next) {
        this.value = value;
        this.next = next;
    }
    public Node(E value) {
        this(value, null);
    }
    public Node() {
        this.value = null;
        this.next = null;
//    	this(null, null);
    }
//    @Override
//    public String toString(){
//      return value.toString();
//    }
}
