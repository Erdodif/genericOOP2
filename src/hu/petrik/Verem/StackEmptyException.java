package hu.petrik.Verem;

public class StackEmptyException extends RuntimeException {

    public StackEmptyException(String message){
        System.err.println(message);
    }

    public StackEmptyException(){
        System.err.println("A verem üres, a keresett elem nem létezik!");
    }

}
