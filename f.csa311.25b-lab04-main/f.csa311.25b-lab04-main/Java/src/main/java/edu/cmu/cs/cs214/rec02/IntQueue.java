package edu.cmu.cs.cs214.rec02;

public interface IntQueue {

    void clear();
    Integer dequeue();
    boolean enqueue(Integer value);
    boolean isEmpty();
    Integer peek();
    int size();
}