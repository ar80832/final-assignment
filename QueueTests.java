package assignment5;
//import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class QueueTests<queue, object> extends TestCase {
    private Queue queue;
    protected void setUp() {
        queue = new Queue();
    }
    @Test
    public void test0() {
        queue.enqueue(14);
        queue.enqueue(15);
        queue.dequeue();
        assertEquals(1, queue.getSize());
    }
    
    public void test1() {
		assertEquals(0, queue.getSize());
	}
	
	public void test2() {
		queue.enqueue(14);
		assertEquals(1, queue.getSize());
	}
	
	public void test3() {
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(16);
		assertEquals(3, queue.getSize());
	}
	
	public void test4 () {
		queue.dequeue();
	}
	
	public void test5() {
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(16);
		queue.enqueue(17);
		queue.enqueue(18);
		queue.dequeue();
		queue.dequeue();
		assertEquals(3, queue.getSize());
	}
	
	public void test6() {
		queue.enqueue(14);
		queue.dequeue();
		assertEquals(0, queue.getSize());
	}
	public void test7() {
		queue.enqueue(14);
		System.out.println(queue.isEmpty());
	}
	public void test8() {
		queue.enqueue(14);
		queue.dequeue();
		System.out.println(queue.isEmpty());
	}
	
	public void test9() {
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(16);
		System.out.println(queue.peek());
	}
	public void test10() {
		queue.enqueue(14);
		queue.dequeue();
		System.out.println(queue.peek());
	}

}
