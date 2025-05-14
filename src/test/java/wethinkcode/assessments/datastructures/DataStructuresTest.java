package wethinkcode.assessments.datastructures;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the DataStructures class
 */
public class DataStructuresTest {

    @Test
    public void testStackPushAndPop() {
        DataStructures.Stack<Integer> stack = new DataStructures.Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }
    
    @Test
    public void testStackPeek() {
        DataStructures.Stack<String> stack = new DataStructures.Stack<>();
        stack.push("first");
        stack.push("second");
        
        assertEquals("second", stack.peek());
        assertEquals(2, stack.size());
        assertEquals("second", stack.pop());
        assertEquals("first", stack.peek());
    }
    
    @Test
    public void testStackEmptyException() {
        DataStructures.Stack<Integer> stack = new DataStructures.Stack<>();
        assertThrows(IllegalStateException.class, () -> stack.pop());
        assertThrows(IllegalStateException.class, () -> stack.peek());
    }
    
    @Test
    public void testQueueEnqueueAndDequeue() {
        DataStructures.Queue<Integer> queue = new DataStructures.Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        assertEquals(1, queue.dequeue());
        assertEquals(2, queue.dequeue());
        assertEquals(3, queue.dequeue());
        assertTrue(queue.isEmpty());
    }
    
    @Test
    public void testQueuePeek() {
        DataStructures.Queue<String> queue = new DataStructures.Queue<>();
        queue.enqueue("first");
        queue.enqueue("second");
        
        assertEquals("first", queue.peek());
        assertEquals(2, queue.size());
        assertEquals("first", queue.dequeue());
        assertEquals("second", queue.peek());
    }
    
    @Test
    public void testQueueEmptyException() {
        DataStructures.Queue<Integer> queue = new DataStructures.Queue<>();
        assertThrows(IllegalStateException.class, () -> queue.dequeue());
        assertThrows(IllegalStateException.class, () -> queue.peek());
    }
    
    @Test
    public void testLinkedListAddAndGet() {
        DataStructures.LinkedList<Integer> list = new DataStructures.LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
        assertEquals(3, list.size());
    }
    
    @Test
    public void testLinkedListRemove() {
        DataStructures.LinkedList<String> list = new DataStructures.LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        
        assertEquals("second", list.remove(1));
        assertEquals(2, list.size());
        assertEquals("first", list.get(0));
        assertEquals("third", list.get(1));
    }
    
    @Test
    public void testLinkedListIndexOutOfBoundsException() {
        DataStructures.LinkedList<Integer> list = new DataStructures.LinkedList<>();
        list.add(1);
        
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(1));
    }
    
    @Test
    public void testReverseLinkedList() {
        DataStructures.LinkedList<Integer> list = new DataStructures.LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        DataStructures.LinkedList<Integer> reversed = DataStructures.reverseLinkedList(list);
        
        assertEquals(3, reversed.size());
        assertEquals(3, reversed.get(0));
        assertEquals(2, reversed.get(1));
        assertEquals(1, reversed.get(2));
    }
    
    @Test
    public void testHasBalancedParenthesesValid() {
        assertTrue(DataStructures.hasBalancedParentheses("()"));
        assertTrue(DataStructures.hasBalancedParentheses("(())"));
        assertTrue(DataStructures.hasBalancedParentheses("(()())"));
        assertTrue(DataStructures.hasBalancedParentheses("(()(()))"));
        assertTrue(DataStructures.hasBalancedParentheses(""));
    }
    
    @Test
    public void testHasBalancedParenthesesInvalid() {
        assertFalse(DataStructures.hasBalancedParentheses("("));
        assertFalse(DataStructures.hasBalancedParentheses(")"));
        assertFalse(DataStructures.hasBalancedParentheses(")("));
        assertFalse(DataStructures.hasBalancedParentheses("(()"));
        assertFalse(DataStructures.hasBalancedParentheses("())"));
        assertFalse(DataStructures.hasBalancedParentheses("((())"));
    }
}