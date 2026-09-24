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
		// if (values.length == 1) {
		// 	this.head = new ListNode<E>(values[0]);
		// 	this.tail = head;
		// } else {
		// 	this.head = new ListNode<E>(values[0]);
		// 	this.tail = new ListNode<E>(values[1]);
		// 	head.setNext(tail);
		// 	for (int i = 2; i < values.length; i++) {
		// 		add(values[i]);
		// 	}
		// }

		head = null;
		tail = null;
		nodeCount = 0;

		for (int i = 0; i < values.length; i++) {
			add(values[i]);
		}
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
		for (int i = 0; i < nodeCount; i++) {
			if (get(i).equals(obj)) {
				return true;
			}
		}

		return false;
	}

	// Returns the index of the first element in equal to obj;
	// if not found, returns -1.
	public int indexOf(E obj) {
		ListNode<E> current = head;
		for (int i = 0; i < nodeCount; i++) {
			if (current.getValue().equals(obj)) {
				return i;
			}
			current = current.getNext();
		}
		return -1;
	}

	// Adds obj to this collection. Returns true if successful;
	// otherwise returns false.
	public boolean add(E obj) {
		if (nodeCount == 0) {
			ListNode<E> add = new ListNode<E>(obj);
			this.head = add;
			this.tail = add;
			nodeCount++;
			return true;
		}
		ListNode<E> add = new ListNode<E>(obj);
		nodeCount++;
		this.tail.setNext(add);
		this.tail = add;
		return true;
	}

	// Removes the first element that is equal to obj, if any.
	// Returns true if successful; otherwise returns false.
	public boolean remove(E obj) {
		ListNode<E> current = head;
		for (int i = 0; i < nodeCount; i++) {
			if (current.getValue().equals(obj)) {
				if (i == 0) {
					this.head = getNode(1);
					nodeCount--;
					return true;
				} else if (i == nodeCount - 1) {
					getNode(i - 1).setNext(null);
					this.tail = getNode(i - 1);
					nodeCount--;
					return true;
				}
				ListNode<E> before = getNode(i - 1);
				before.setNext(getNode(i + 1));
				nodeCount--;
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	// Returns the i-th element.
	public E get(int i) {
		if (i < 0 || i >= nodeCount) {
			throw new IndexOutOfBoundsException("The index must be within bounds of the list!");
		}

		ListNode<E> current = this.head;
		for (int j = 0; j < i; j++) {
			current = current.getNext();
		}
		return (E) current.getValue();
	}

	// Returns the i-th node (added by James)
	public ListNode<E> getNode(int i) {
		if (i < 0 || i >= nodeCount) {
			throw new IndexOutOfBoundsException("The index must be within bounds of the list!");
		}

		ListNode<E> current = this.head;
		for (int j = 0; j < i; j++) {
			current = current.getNext();
		}
		return current;
	}

	// Replaces the i-th element with obj and returns the old value.
	public E set(int i, E obj) {
		if (i < 0 || i >= nodeCount) {
			throw new IndexOutOfBoundsException("The index must be within bounds of the list!");
		}

		ListNode<E> replaced = getNode(i);
		E oldValue = replaced.getValue();
		replaced.setValue(obj);
		return oldValue;
	}

	// Inserts obj to become the i-th element. Increments the size
	// of the list by one.
	public void add(int i, E obj) {
		if (i < 0 || i >= nodeCount) {
			throw new IndexOutOfBoundsException("The index must be within bounds of the list!");
		}

		ListNode<E> add = new ListNode<E>(obj);
		if (i == nodeCount) {
			this.tail.setNext(add);
			this.tail = add;
			nodeCount++;
		} else if (i == 0) {
			add.setNext(head);
			this.head = add;
			nodeCount++;
		} else {
			ListNode<E> next = getNode(i);
			add.setNext(next);
			ListNode<E> previous = getNode(i - 1);
			previous.setNext(add);
			nodeCount++;
		}
	}

	// Removes the i-th element and returns its value.
	// Decrements the size of the list by one.
	public E remove(int i) {
		if (i < 0 || i >= nodeCount) {
			throw new IndexOutOfBoundsException("The index must be within bounds of the list!");
		}

		ListNode<E> removed = getNode(i);
		E removedObject = removed.getValue();
		getNode(i - 1).setNext(getNode(i + 1));
		nodeCount--;
		return removedObject;
	}

	// Returns a string representation of this list exactly like that for
	// MyArrayList.
	public String toString() {
		if (isEmpty()) {
			return "[]";
		} else if (nodeCount == 1) {
			return "[" + getNode(0).getValue() + "]";
		} else {
			String result = "[";
			for (int i = 0; i < nodeCount - 1; i++) {
				result += "" + getNode(i).getValue() + ", ";
			}
			result += "" + getNode(nodeCount - 1).getValue() + "]";
			return result;
		}
	}

}
