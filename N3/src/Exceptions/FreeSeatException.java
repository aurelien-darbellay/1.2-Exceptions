package Exceptions;

public class FreeSeatException extends Exception {
    public FreeSeatException() {
        super("This seat is free - or doesn't exist");
    }
}
