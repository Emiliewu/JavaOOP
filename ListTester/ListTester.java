
public class ListTester {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
        sll.addFirst(3);
        sll.addLast(4);
        sll.addLast(10);
        sll.addLast(5);
        sll.addLast(15);
        sll.addFirst(2);
        Object rm1 = sll.remove(3);
        System.out.println(rm1 + " is removed");
        Object rm2 = sll.removeFirst();
        System.out.println(rm2 + " is removed");
        Object rm3 = sll.removeLast();
        System.out.println(rm3 + " is removed");
        sll.printValues();
        Object n = sll.get(2);
        System.out.println("The index 2 is " + n);
        int idx = sll.findIdx(5);
        System.out.println("The value 5 is at " + idx);

	}

}
