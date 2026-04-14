error id: file:///C:/Users/user/Downloads/f.csa311.25b-lab04-main/f.csa311.25b-lab04-main/Java/src/main/java/edu/cmu/cs/cs214/rec02/ArrayIntQueue.java:_empty_/IntQueue#
file:///C:/Users/user/Downloads/f.csa311.25b-lab04-main/f.csa311.25b-lab04-main/Java/src/main/java/edu/cmu/cs/cs214/rec02/ArrayIntQueue.java
empty definition using pc, found symbol in pc: _empty_/IntQueue#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 177
uri: file:///C:/Users/user/Downloads/f.csa311.25b-lab04-main/f.csa311.25b-lab04-main/Java/src/main/java/edu/cmu/cs/cs214/rec02/ArrayIntQueue.java
text:
```scala
package edu.cmu.cs.cs214.rec02;

import java.util.Arrays;

/**
 * A resizable-array implementation of the {@link IntQueue} interface.
 */
public class ArrayIntQueue implements I@@ntQueue {

    private int[] elementData;
    private int head;
    private int size;
    private static final int INITIAL_SIZE = 10;

    public ArrayIntQueue() {
        elementData = new int[INITIAL_SIZE];
        head = 0;
        size = 0;
    }

    /** {@inheritDoc} */
    public void clear() {
        Arrays.fill(elementData, 0);
        size = 0;
        head = 0;
    }

    /** {@inheritDoc} */
    public Integer dequeue() {
        if (isEmpty()) {
            return null;
        }
        Integer value = elementData[head];
        head = (head + 1) % elementData.length;
        size--;
        return value;
    }

    /** {@inheritDoc} */
    public boolean enqueue(Integer value) {
        ensureCapacity();
        int tail = (head + size) % elementData.length;
        elementData[tail] = value;
        size++;
        return true;
    }

    /** {@inheritDoc} */
    public boolean isEmpty() {
        // ЗАСВАР 1: size >= 0 байсан нь буруу. 0-тэй тэнцүү үед хоосон байна.
        return size == 0;
    }

    /** {@inheritDoc} */
    public Integer peek() {
        // ЗАСВАР 2: Дараалал хоосон үед null буцаах ёстой (IntQueue-ийн тодорхойлолт ёсоор).
        if (isEmpty()) {
            return null;
        }
        return elementData[head];
    }

    /** {@inheritDoc} */
    public int size() {
        return size;
    }

    /**
     * Increases the capacity of this <tt>ArrayIntQueue</tt> instance.
     */
    private void ensureCapacity() {
        if (size == elementData.length) {
            int oldCapacity = elementData.length;
            int newCapacity = 2 * oldCapacity + 1;
            int[] newData = new int[newCapacity];
            
            // ЗАСВАР 3: Хуучин массивын элементүүдийг шинэ массив руу 
            // зөв дарааллаар (0-ээс эхлэн) хуулах логикийг зассан.
            for (int i = 0; i < size; i++) {
                newData[i] = elementData[(head + i) % oldCapacity];
            }
            
            elementData = newData;
            head = 0;
        }
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/IntQueue#