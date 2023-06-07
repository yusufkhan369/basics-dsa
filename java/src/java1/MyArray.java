package java1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyArray<T> implements Iterable<T> {

    private T [] arr;
    private int len =0;
    private int capacity = 0;

    public MyArray() {this(16);}

    public MyArray(int capacity) {
        if(capacity<0) throw new IllegalArgumentException("IllegalCapacity "+capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public void clear(){
        for (int i = 0; i < capacity; i++) {
            arr[i] = null;
        }
        len = 0;
    }

    public void add(T element){
        if(len+1>=capacity){
            if(capacity == 0) capacity =1;
            else capacity *= 2;
            T[] new_arr = (T[]) new Object[capacity];
            for (int i = 0; i < len; i++) {
                new_arr[i] = arr[i];
            }

        }
        arr[len++] = element;
    }

    public void removeAt(int rem_idx){
        if(rem_idx >= len && rem_idx <0) throw new IndexOutOfBoundsException();
        T data = arr[rem_idx];
        T[] new_arr  = (T[]) new Object[len-1];
        for (int i = 0, j=0; i < len; i++) {
            if(i == rem_idx) j--;
            else new_arr[j] = arr[i];
        }
        arr = new_arr;
        capacity = --len;
    }

    public boolean remove(Object o){
        for (int i = 0; i < len; i++) {
            if(arr[i].equals(o)){
                removeAt(i); return true;
            }
        }
        return false;
    }

    public int indexOf(Object o){
        for (int i = 0; i < len; i++) {
            if(arr[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    public T get(int index){
        return arr[index];
    }

    public void set(int index, T element){
        arr[index] = element;
    }

    public boolean contains(Object o){
        return indexOf(o) != -1;
    }



    public int size(){
        return len;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
