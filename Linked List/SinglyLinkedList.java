// Implements a singly-linked list.

public class SinglyLinkedList<E> {
	private ListNode<E> head;
	private ListNode<E> tail;
	private int nodeCount;

	// Constructor: creates an empty list
	public SinglyLinkedList() {
		head = null;
		tail = null;
		nodeCount = 0;
	}

	// Constructor: creates a list that contains
	// all elements from the array values, in the same order
	public SinglyLinkedList(E[] values) {
	}

	public ListNode<E> getHead() {
		return head;
	}

	public ListNode<E> getTail() {
		return tail;
	}

	// Returns true if this list is empty; otherwise returns false.
	public boolean isEmpty() {
		return nodeCount == 0;
	}

	// Returns the number of elements in this list.
	public int size() {
		return nodeCount;
	}

	// Returns true if this list contains an element equal to obj;
	// otherwise returns false.
	public boolean contains(E obj) {

	}

	// Returns the index of the first element in equal to obj;
	// if not found, returns -1.
	public int indexOf(E obj) {
		Node current = head;
		for (int i = 0; i < nodeCount; i++) {
			if (current.getValue.equals(obj)) {
				return i;
			}
			current = current.getNext;
		}
		return -1;
	}

	// Adds obj to this collection. Returns true if successful;
	// otherwise returns false.
	public boolean add(E obj) {
		if (nodeCount == 0) {
			Node add = new ListNode(obj);
			this.head = add;
			this.tail = add;
			nodeCount++;
			return true;
		}
		Node add = new ListNode(obj);
		nodeCount++;
		this.tail.setNext(add);
		this.tail = add;
	}

	// Removes the first element that is equal to obj, if any.
	// Returns true if successful; otherwise returns false.
	public boolean remove(E obj) {
		Node current = head;
		for (int i = 0; i < nodeCount; i++) {
			if (current.getValue.equals(obj)) {
				Node before = get(i - 1);
				before.setNext = get(i + 1);
				nodeCount--;
				return true;
			}
			current = current.getNext;
		}
		return false;
	}

	// Returns the i-th element.
	public E get(int i) {
		Node current = this.head;
		for (int j = 0; j < i; j++) {
			current = current.getNext;
		}
		return current;
	}

	// Replaces the i-th element with obj and returns the old value.
	public E set(int i, E obj) {
		Node replaced = get(i);
		E oldValue = replaced.getValue;
		replaced.setValue(obj);
		return oldValue;
	}

	// Inserts obj to become the i-th element. Increments the size
	// of the list by one.
	public void add(int i, E obj) {
	}

	// Removes the i-th element and returns its value.
	// Decrements the size of the list by one.
	public E remove(int i) {
		
	}

	// Returns a string representation of this list exactly like that for
	// MyArrayList.
	public String toString() {

	}

}
