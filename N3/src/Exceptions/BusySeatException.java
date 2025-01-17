package Exceptions;

public class BusySeatException extends Exception {
    public BusySeatException() {
        super("This seat is busy - or already exists");
    }
}
