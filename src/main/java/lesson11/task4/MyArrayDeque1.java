package lesson11.task4;

public class MyArrayDeque1 implements MyDeque {

    private Integer[] elements;
    private int headIndex;
    private int tailIndex;
    private int size;
    private int defaultCapacity = 20;

    public MyArrayDeque1() {
        elements = new Integer[defaultCapacity];
        headIndex = elements.length / 2;
        tailIndex = headIndex;
    }

    @Override
    public void addToHead(Integer element) {
        if(!isEmpty()) {
            headIndex--;
        }
            elements[headIndex] = element;
            size++;
    }

    @Override
    public void addToTail(Integer element) {
        if(!isEmpty()) {
            tailIndex++;
        }
            elements[tailIndex] = element;
           size++;

    }

    @Override
    public Integer removeHead() {
        if(isEmpty()) {
            System.out.println("Deque empty,cannot remove");
            return null;
        } else {
            Integer removal = elements[headIndex];
            elements[headIndex] = null;
            headIndex++;
            size--;
            return removal;
        }
    }

    @Override
    public Integer removeTail() {
        if(isEmpty()) {
            System.out.println("Deque empty,cannot remove");
            return null;
        } else {
            Integer removal = elements[tailIndex];
            elements[tailIndex] = null;
            tailIndex--;
            size--;
            return removal;
        }
    }

    @Override
    public Integer peekHead() {
        if(isEmpty()) {
            System.out.println("Deque empty,cannot peek");
            return null;
        } else {
            Integer tmp = elements[headIndex];
            return tmp;
        }
    }

    @Override
    public Integer peekTail() {
        if(isEmpty()) {
            System.out.println("Deque empty,cannot peek");
            return null;
        } else {
            Integer tmp = elements[tailIndex];
            return tmp;
        }
    }

    @Override
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public Integer getByIndex(int index) {
        Integer tmp = null;
        if (headIndex + index <= tailIndex) {
            tmp = elements[headIndex + index];
        }

        else {
            System.out.println("Index out of bounds, values will be cycled");
            tmp = headIndex + index - tailIndex;
            return getByIndex(tmp);
        }
        return tmp;
    }

    @Override
    public boolean contains(Integer element) {
        for (int i = headIndex; i <= tailIndex; i++) {
            if(elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = headIndex; i <= tailIndex; i++) {
            builder.append(elements[i]).append(", ");
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}
