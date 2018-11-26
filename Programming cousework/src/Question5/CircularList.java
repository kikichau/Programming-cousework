package Question5;

class ListNode {

    private Object data;
    private ListNode next;

    public ListNode(Object o) { data = o; next = null; }
    public ListNode(Object o, ListNode nextNode)
            { data = o; next = nextNode; }

    public Object getData() { return data; }
    public void setData(Object o) { data = o; }

    public ListNode getNext() { return next; }
    public void setNext(ListNode next) { this.next = next; }

} // class ListNode

class EmptyListException extends RuntimeException {
    
	public EmptyListException (){
            super("List is empty"); }
        
} // class EmptyListException

class CircularList {

    private ListNode head;
    private ListNode tail;

    private int length;		// the length of the list

    public CircularList() {
        head = tail = null;
        length = 0;
    }

    public boolean isEmpty() {
        return head == null; 
    }

    public void addToHead(Object item) {
        if (isEmpty())
                head = tail = new ListNode(item);
        else
                head = new ListNode(item, head);
        tail.setNext(head);
        length++;
    }

    public void addToTail(Object item) {
        if (isEmpty())
                head = tail = new ListNode(item);
        else {
                tail.setNext(new ListNode(item));
                tail = tail.getNext();
        }
        tail.setNext(head);
        length++;
    }

    public Object removeFromHead() throws EmptyListException {
        Object item = null;
        if (isEmpty())
                throw new EmptyListException();
        item = head.getData();
        if (head == tail)
                head = tail = null;
        else {
                head = head.getNext();
                tail.setNext(head);
        }
        length--;
        return item;
    }

    public Object removeFromTail() throws EmptyListException {
        Object item = null;
        if (isEmpty())
                throw new EmptyListException();
        item = tail.getData();
        if (head == tail)
                head = tail = null;
        else {
                ListNode current = head;
                while (current.getNext() != tail)
                        current = current.getNext();
                tail = current;
                tail.setNext(head);
        }
        length--;
        return item;
    }

    public String toString() {
        if (isEmpty()) return "[ ]";
        String str = "[ ";
        ListNode current = head;
        do {
                str += (current.getData() + " ");
                current = current.getNext();
        } while (current != head);
        str += "]";
        return str;
    }

    public int count() {
        return length;
    }

} // class CircularList