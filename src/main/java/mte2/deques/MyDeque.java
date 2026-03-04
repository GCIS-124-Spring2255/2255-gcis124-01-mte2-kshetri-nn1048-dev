// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Iterator;

//public class MyDeque {
public class MyDeque<E> implements Deque<E> {
    
    private final LinkedList<E> list;
    public MyDeque() {    list = new LinkedList<>();    }

    // ... for enqueueFront ...
    @Override
    public void enqueueFront(E element){
        if (size()==0) {
            list.add(element);
        } else {
            list.add(0, element);
        }
    }

    // ... for enqueueBack ...
    public void enqueueBack(E element){
        if (size()==0) {
            list.add(element);
        } else {
            list.add((size()-1), element);
        }
    }

    // ... for dequeueFront ...
    public E dequeueFront(){
        if (size()!=0) {
            //E dequed=list.getFirst();
            //list.removeFirst();
            // E dequed= list.removeFirst();
            // return dequed;
            return list.removeFirst();
        }
    }

    // ... for dequeueBack ... 
    public E dequeueBack(){
        if (size()!=0) {
            // E dequed=list.getLast();
            // list.removeLast();
            // E dequed= list.removeLast();
            // return dequed;
            return list.removeLast();
        }
    }

    // ... for size ...
    public int size(){
        return list.size();
    }

    // ... for iterator ...
    public Iterator<E> iterator(){
        list.iterator();
    }


    public static void main(String[] args) { 

        // ...
    }
}