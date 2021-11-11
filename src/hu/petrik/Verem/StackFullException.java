package hu.petrik.Verem;

public class StackFullException extends RuntimeException {

    public StackFullException(String message){
        System.err.println(message);
    }

    public StackFullException(){
        System.err.println("A verem megtelt, további elemeket nemn tud befogadni!");
    }

}
