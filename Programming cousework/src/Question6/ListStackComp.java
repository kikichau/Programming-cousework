package Question6;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;
import java.util.EmptyStackException;
import java.util.Iterator;

public class ListStackComp  {

	private LinkedList list;	// compose with a LinkedList object

    public ListStackComp() {
		list = new LinkedList();
    }

	public boolean empty() {
		return list.isEmpty();
	}

	public Object push(Object item) {
		list.addToHead(item);
		return item;
	}

	public Object pop() {
		if (empty()) throw new EmptyStackException();
		return list.removeFromHead();
	}

	public Object peek() {
		if (empty()) throw new EmptyStackException();
		return list.get(1);
	}

	public int search(Object item) {

		Iterator iter = iterator();
		int i = 0;
		while (iter.hasNext()) {
			i++;
			if (item.equals(iter.next())) return i;
		}
		return -1;
		//*/
	}

	// Provide also the toString() method (for TestStack.java)
	public String toString() {
		return list.toString();
	}

}
