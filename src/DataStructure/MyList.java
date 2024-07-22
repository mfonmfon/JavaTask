package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class MyList implements Collections{

    private final boolean contain = true;
    private final boolean isEmpty = true;
    private int size = 3;
    String[] elements = new String[size];

    @Override
    public int size() {
        return size;
    }

    @Override
    public int get(int size) {
        return 0;
    }

    @Override
    public void add(String element) {
       size++;
    }
    @Override
    public void remove(String element) {
        for(int index = size; index < size-1; index++){
            elements[index] = elements[index + 1];
        }
    }
    public void remove(int size) {

    }
    @Override
    public boolean contain() {
        return false;
    }
    @Override
    public void clear() {

    }
    @Override
    public int capacity() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        if(elements != null ){
            return true;
        }
        return false;
    }
}
