package utils.datastructures;

////////////////////////////////// THIS STUFF IS HINTS ABOUT IMPLEMENTING ARRAYLIST ////////////////////////////////////
//      At the core of your arraylist implementation there WILL BE A primitive array.
//    this works - our hack we avoid generics, instead using an array of Objects,
//     because all objects inherit eventually from Object class.
//    Object[] o = new Object[2];
//
//    this doesn't work, can't directly build an array of generics
//    E[] w = new E[2];
//
//    When we want to return our array, we would need to "cast" it like this "(Type) thing" we turn the thing into type.
//    public E[] getArray() {
//        return (E[]) o;
//    }
////////////////////////////////// THIS STUFF IS HINTS ABOUT IMPLEMENTING ARRAYLIST ////////////////////////////////////

import java.util.Arrays;

public class MyArrayList<T> implements MyListInterface<T>{
    int size;
    int maxSize;
    Object[] array;


    public MyArrayList() {
        initialize();
//        maxSize = 2;
//        size = 0;
//        array = new Object[maxSize];
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(T t) {

    }

    @Override
    public void add(T t, int index) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void clear() {
        initialize();
//        maxSize = 2;
//        size = 0;
//        array = new Object[maxSize];
    }

    private void initialize(){
        maxSize = 2;
        size = 0;
        array = new Object[maxSize];
    }

    @Override
    public int contains(T t) {
        return 0;
    }

    //We will need a growth method
    private void growArray() {
        //initialize a new array > than old - lets do x2 max size.
        //copy the old array into the new array
        //set the array reference to the new array - discarding the old one for garbage collection
        //update max size with the new array size.


        /* This is a manual copy by looping and copying each element. We can also just use Arrays.copyOf(), which under the good does the same thing.
        Object[] temp = new Object[maxSize];

        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        */

        maxSize *= 2;
        array = Arrays.copyOf(array, maxSize);

    }
}
