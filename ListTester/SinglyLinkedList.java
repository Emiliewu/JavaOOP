
public class SinglyLinkedList<E> {
	public Node dummyhead;
	int size;
	public SinglyLinkedList() {
		dummyhead =new Node(null, null) ;
		size = 0;
	}
	public int getSize() {
		return size;
	}
  public boolean isEmpty() {
    return size == 0;
  }
  public void add(int index, E e) {
    if(index < 0 || index > size) {
    throw new IllegalArgumentException("Add Failed");
    }

    Node prev = dummyhead;
    for(int i = 0; i < index; i++) {
      prev = prev.next;
    }
		Node node = new Node(e);
		node.next = prev.next;
		prev.next = node;
		size ++;
	}
	public void addLast(E e) {
		add(size, e);
	}
	public void addFirst(E e) {
		// Node node = new Node(e);
		// node.next = head;
		// head = node;
		// head = new Node(e, head);
		// size ++;
		add(0, e);
	}
	    // SLL methods go here. As a starter, we will show you how to add a node to the list.
//	    public void add(int value) {
//	        Node newNode = new Node(value);
//	        if(head == null) {
//	            head = newNode;
//	        } else {
//	            Node runner = head;
//	            while(runner.next != null) {
//	                runner = runner.next;
//	            }
//	            runner.next = newNode;
//	        }
//	    }
	public Object remove(int index) {
	if(index < 0 || index >=size) {
		throw new IllegalArgumentException("Cannot find");
	}
	Node prev = dummyhead;
	for (int i = 0; i < index; i++) {
		prev = prev.next;
	}
	Node retNode = prev.next;
	prev.next = retNode.next;
	retNode.next = null;
	size --;
	return retNode.value;
}
	public Object removeFirst() {
		return remove(0);
	}
	public Object removeLast() {
		return remove(size-1);
	}
	public void remove() {
		if(dummyhead.next == null) {
			System.out.println("The list is empty");
		} else {
			Node prev = dummyhead;
		
			while(prev.next != null) {
						prev = prev.next;
					}
			prev = null;
			size --;
		}
	}
	public void printValues() {
		if(dummyhead.next == null) {
			System.out.println("The list is empty");
		} else {
			Node prev = dummyhead;
//	    		System.out.println("The head "+dummyhead.next.value);

			while(prev.next != null) {
				prev = prev.next;
				System.out.println("The node "+prev.value);
			}
		}
	}
	public Object get(int index) {
		if(index < 0 || index >=size) {
			throw new IllegalArgumentException("Cannot find");
		}
		Node cur = dummyhead.next;
		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}
		return cur.value;
	}
	public int findIdx(E e) {
		Node cur = dummyhead.next;
		for (int i = 0; i < size; i ++) {
			if(cur.value.equals(e)) {
				return i;
			} else {
			cur = cur.next;
			}
		}
		return -1;
		
	}
}
