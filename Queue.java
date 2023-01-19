package assignment5;
import java.util.LinkedList;

public class Queue {
    private LinkedList<Object> q;
    private int size = 0;
    
    Queue() {
        q = new LinkedList<Object>();
    }
    public LinkedList<Object> getInternalList() {
    	return this.q;
    }
    
    public int getSize() {
        return this.size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    
    public Object getInfo(int i) { //returns element at index i
    	return this.q.get(i);
    }

    public boolean isEmpty() { // check if size = 0
        return size == 0;
    }
    public void enqueue(Object info) { //add element to end of list
        this.q.add(info);
        size += 1;
    }
    public Object dequeue() { //remove element from beginning of list
        if (isEmpty()) {
            throw new IllegalStateException("The queue is empty.");
        }
        else {
            Object item = this.q.remove(0);
            size -= 1;
            return item;
        }
    }
    public Object peek() { //return first element in list
        if (isEmpty()) {
            throw new IllegalStateException("The queue is empty.");
        }
        return this.q.get(0);
    }
    
    @Override
    public String toString() {
        String stringReturn = "Queue: ";
		for (int i = 0; i < getSize(); i++) {
			stringReturn += this.q.get(i);
			stringReturn += " ";
		}
        return (stringReturn);

    }
}
