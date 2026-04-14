package edu.cmu.cs.cs214.rec02;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class IntQueueTest {
    private IntQueue mQueue;
    private List<Integer> testList;

    @Before
    public void setUp() {
        mQueue = new ArrayIntQueue(); // ArrayIntQueue-г тестэлнэ
        testList = new ArrayList<>(List.of(1, 2, 3));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(mQueue.isEmpty());
        mQueue.enqueue(1);
        assertFalse(mQueue.isEmpty());
    }

    @Test
    public void testPeekAndSize() {
        assertNull(mQueue.peek());
        mQueue.enqueue(5);
        assertEquals(Integer.valueOf(5), mQueue.peek());
        assertEquals(1, mQueue.size());
    }

    @Test
    public void testEnqueueAndDequeue() {
        for (Integer val : testList) {
            mQueue.enqueue(val);
        }
        for (Integer val : testList) {
            assertEquals(val, mQueue.dequeue());
        }
        assertTrue(mQueue.isEmpty());
    }

    @Test
    public void testEnsureCapacity() {
        // Массив дүүргэх тест (INITIAL_SIZE = 10)
        for (int i = 0; i < 15; i++) {
            mQueue.enqueue(i);
        }
        assertEquals(15, mQueue.size());
        assertEquals(Integer.valueOf(0), mQueue.peek());
    }

    @Test
    public void testClear() {
        mQueue.enqueue(1);
        mQueue.clear();
        assertTrue(mQueue.isEmpty());
        assertEquals(0, mQueue.size());
    }
}