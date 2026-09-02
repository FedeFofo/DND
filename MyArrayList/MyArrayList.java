/* See ArrayList documentation here:
 * http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 */

/*
 * Your indexed functions should throw IndexOutOfBoundsException if index is invalid!
 */

public class MyArrayList<E> {

	/* Internal Object counter */
	protected int objectCount;

	/* Internal Object array */
	protected E[] internalArray;

	/* Constructor: Create it with whatever capacity you want? */
	@SuppressWarnings("unchecked")
	public MyArrayList() {
		this.internalArray = (E[]) new Object[100];
	}

	/* Constructor with initial capacity */
	@SuppressWarnings("unchecked")
	public MyArrayList(int initialCapacity) {
		this.internalArray = (E[]) new Object[initialCapacity];
	}

	/* Return the number of active slots in the array list */
	public int size() {
		return objectCount;
	}

	/* Are there zero objects in the array list? */
	public boolean isEmpty() {
		return objectCount == 0;
	}

	/* Get the index-th object in the list. */
	public E get(int index) {
		return internalArray[index];
	}

	/* Replace the object at index with obj. returns object that was replaced. */
	public E set(int index, E obj) {
		E replaced = internalArray[index];
		internalArray[index] = obj;
		return replaced;
	}

	/*
	 * Returns true if this list contains an element equal to obj;
	 * otherwise returns false.
	 */
	public boolean contains(E obj) {
		boolean contains = false;

		for (E e : internalArray) {
			if (e.equals(obj)) {
				contains = true;
				break;
			}
		}

		return contains;
	}

	public E[] resize(E[] array) {
		int currentSize = array.length;
		E[] newArray = (E[]) new Object[currentSize * 2];
		
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}

		return newArray;
	}

	/* Insert an object at index */
	@SuppressWarnings("unchecked")
	public void add(int index, E obj) {
		if (objectCount >= internalArray.length) {
			internalArray = resize(internalArray);
		}

		for (int i = objectCount; i > index; i--) {
			internalArray[i] = internalArray[i - 1];
		}

		internalArray[index] = obj;

		objectCount++;
	}

	/* Add an object to the end of the list; returns true */
	@SuppressWarnings("unchecked")
	public boolean add(E obj) {
		if (objectCount >= internalArray.length) {
			internalArray = resize(internalArray);
		}

		internalArray[objectCount] = obj;

		objectCount++;

		return true;
	}

	/* Remove the object at index and shift. Returns removed object. */
	public E remove(int index) {
		E removed = internalArray[index];

		for (int i = index; i < objectCount; i++) {
			internalArray[i] = internalArray[i + 1];
		}

		return removed;
	}

	/*
	 * Removes the first occurrence of the specified element from this list,
	 * if it is present. If the list does not contain the element, it is unchanged.
	 * More formally, removes the element with the lowest index i such that
	 * (o==null ? get(i)==null : o.equals(get(i))) (if such an element exists).
	 * Returns true if this list contained the specified element (or equivalently,
	 * if this list changed as a result of the call).
	 */
	public boolean remove(E obj) {
		for (int i = 0; i < internalArray.length; i++) {
			if (internalArray[i].equals(obj)) {
				remove(i);
				return true;
			}
		}

		return false;
	}

	/*
	 * For testing; your string should output as "[X, X, X, X, ...]" where X, X, X,
	 * X, ... are the elements in the ArrayList.
	 * If the array is empty, it should return "[]". If there is one element, "[X]",
	 * etc.
	 * Elements are separated by a comma and a space.
	 */
	public String toString() {
		if (isEmpty()) {
			return "[]";
		} else if (objectCount == 1) {
			return "[" + internalArray [0] + "]";
		} else {
			String result = "[";
			for (int i = 0; i < objectCount - 1; i++) {
				result += "" + internalArray[i] + ", ";
			}
			result += "" + internalArray[objectCount - 1] + "]";
			return result;
		}

	}

}