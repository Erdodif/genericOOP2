package hu.petrik.Verem;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    protected List<T> elements;

    public Stack() {
        this.elements = new ArrayList<>();
    }

    public void push(T element) {
        this.elements.add(element);
    }

    public T pop() throws StackEmptyException {
        if (this.isEmpty()) {
            throw new StackEmptyException();
        } else {
            return this.elements.remove(this.elements.size() - 1);
        }
    }

    public T top() throws StackEmptyException{
        if (this.isEmpty()) {
            throw new StackEmptyException();
        } else {
            return this.elements.get(this.elements.size() - 1);
        }
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public void empty() {
        this.elements.clear();
    }
}
