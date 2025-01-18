package Exceptions;

public class ColumnOutOfBoundException extends Exception {
    public ColumnOutOfBoundException() {
        super("This row doesn't exist in your theater... do better!");
    }
}
