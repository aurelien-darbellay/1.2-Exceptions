package Exceptions;

public class IncorrectNameBookerException extends Exception {
    public IncorrectNameBookerException() {
        super("There are digits in the name you introduced: do better!");
    }
}
