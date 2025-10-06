import java.util.Arrays;

public class CustomArrayList<T> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] elements;

    public CustomArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public T get(int i){
        if ( i >= size || i < 0 ){
            throw new IndexOutOfBoundsException("Index "+ i +" Size "+size);
        }
        return (T )elements[i];
    }
    public void add(T element){
        if (size == elements.length){
            increaseCapacity();
        }
        elements[size]= element;
        size++;
    }

    public int size(){
        return size;
    }

    private void increaseCapacity(){
        int newSize = elements.length *2;
        elements = Arrays.copyOf(elements, newSize);

    }
}
