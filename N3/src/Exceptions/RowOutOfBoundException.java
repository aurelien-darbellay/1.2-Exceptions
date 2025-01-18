package Exceptions;

public class RowOutOfBoundException extends Exception {
    public RowOutOfBoundException() {
        super("This row doesn't exist in your theater... do better!");
    }
}
