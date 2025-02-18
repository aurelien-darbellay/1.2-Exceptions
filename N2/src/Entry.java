import Exceptions.myException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {
    static Scanner scanner = new Scanner(System.in);

    private static <T> T readInput(String message, Class<T> type) {
        System.out.println(message);
        try {
            return switch (type.getSimpleName()) {
                case "Byte" -> type.cast(scanner.nextByte());
                case "Integer" -> type.cast(scanner.nextInt());
                case "Double" -> type.cast(scanner.nextDouble());
                case "Float" -> type.cast(scanner.nextFloat());
                case "Character" -> {
                    String input = scanner.nextLine();
                    if (input.length() == 1) {
                        yield type.cast(input.charAt(0));
                    } else {
                        throw new myException();
                    }
                }
                case "String" -> type.cast(scanner.nextLine());
                default -> throw new IllegalArgumentException(type.getSimpleName() + " is not supported");
            };
        } catch (InputMismatchException | myException exception) {
            return catchException(message, type);
        }
    }

    private static <T> T catchException(String message, Class<T> type) {
        scanner.nextLine();
        System.out.println("Are you sure you've entered a " + type.getSimpleName() + " in the right format?");
        return readInput(message, type);
    }

    public static byte readByte(String message) {
        final byte byteOutput = (Byte) readInput(message, Byte.class);
        scanner.nextLine();
        return byteOutput;
    }

    public static int readInt(String message) {
        final int intOutput = (Integer) readInput(message, Integer.class);
        scanner.nextLine();
        return intOutput;
    }

    public static float readFloat(String message) {
        final float floatOutput = (Float) readInput(message, Float.class);
        scanner.nextLine();
        return floatOutput;
    }

    public static double readDouble(String message) {
        final double doubleOutput = (Double) readInput(message, Double.class);
        scanner.nextLine();
        return doubleOutput;
    }

    public static char readChar(String message) {
        return (Character) readInput(message, Character.class);
    }

    public static String readString(String message) {
        return (String) readInput(message, String.class);
    }

    public static boolean readYesNo(String message) {
        System.out.println(message);
        String input = scanner.nextLine();
        try {
            if (input.equals("y") | input.equals("n")) {
                return input.equals("y");
            } else {
                throw new myException();
            }
        } catch (myException exception) {
            System.out.println(exception.getMessage());
            return readYesNo(message);
        }
    }

}
