import java.util.EmptyStackException;

import java.util.LinkedList;
import java.util.List;

public class MyGenericStack <T> {
    LinkedList <T> stringMyGenericStack;

    public MyGenericStack(){
        stringMyGenericStack = new LinkedList<>();
    }

    public void push(T element){
        stringMyGenericStack.addFirst(element);
    }

    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stringMyGenericStack.removeFirst();
    }

    public int size(){
        return stringMyGenericStack.size();
    }

    public boolean isEmpty(){
        if (stringMyGenericStack.size() == 0){
            return true;
        }
        return false;
    }


}
