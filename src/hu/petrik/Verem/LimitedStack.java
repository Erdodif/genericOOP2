package hu.petrik.Verem;

public class LimitedStack<T> extends Stack<T> {

    protected int maxSize;

    public LimitedStack(int maxSize) {
        super();
        this.maxSize = maxSize;
    }

    public boolean isFull() {
        return this.elements.size() == maxSize;
    }

    @Override
    public void push(T element) throws StackFullException {
        if(this.isFull()){
            throw new StackFullException();
        }
        else {
            super.push(element);
        }
    }
}
