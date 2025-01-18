import Exceptions.ColumnOutOfBoundException;
import Exceptions.IncorrectNameBookerException;
import Exceptions.RowOutOfBoundException;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheaterManagement {
    private final Theater theater;
    private static final Scanner scanner = new Scanner(System.in);

    public TheaterManagement(Theater theater) {
        this.theater = theater;
    }

    public void menu() {

        String menu = """
                What do you want do do?
                1 : Show booked seats
                2 : Show seats booked by booker
                3 : Book seat
                4 : Cancel booking
                5 : Cancel bookings by booker
                6 : Exit
                """;
        String input = "";
        while (!input.equals("6")) {
            input = Entry.readString(menu);
            switch (input) {
                case "1":
                    System.out.println(showBookedSeats());
                    break;
                case "2":
                    String booker = newBooker();
                    ArrayList<Seat> seats = this.theater.seatManagement.getSeats();
                    if (seats.stream().filter(item -> item.getBookedBy().equals(booker)).findAny().isEmpty()) {
                        System.out.println("No seat booked under this name");
                    } else {
                        Consumer<Seat> printSeat = item -> System.out.println(item.toString());
                        System.out.println("These are the seats booked by " + booker + ":");
                        seats.stream().filter(item -> item.getBookedBy().equals(booker)).forEach(printSeat);
                    }

                    break;
                case "3":
                    String newBooker = newBooker();
                    int row = newBookedRow();
                    int col = newBookedColumn();
                    Seat newSeat = new Seat(row, col, newBooker);
                    this.theater.seatManagement.addSeat(newSeat);
                    break;
                case "4":
                    int rowToDelete = newBookedRow();
                    int colToDelete = newBookedColumn();
                    this.theater.seatManagement.eliminateSeat(rowToDelete, colToDelete);
                    break;
                case "5":
                    String bookerToDelete = newBooker();
                    ArrayList<Seat> seatsToInspect = this.theater.seatManagement.getSeats();
                    seatsToInspect.removeIf(seat -> seat.getBookedBy().equals(bookerToDelete));
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Unknown command. Try again!");
            }
        }
    }

    public ArrayList<Seat> showBookedSeats() {
        return this.theater.seatManagement.getSeats();
    }

    public String newBooker() {
        String name = Entry.readString("Tell me the name of the person who is booking a new seat: ");
        try {
            Pattern pattern = Pattern.compile("\\d");
            Matcher matcher = pattern.matcher(name);
            if (matcher.find()) {
                throw new IncorrectNameBookerException();
            }
            return name;

        } catch (IncorrectNameBookerException exception) {
            System.out.println(exception.getMessage());
            return newBooker();
        }
    }

    public int newBookedRow() {
        int rowNumber = Entry.readInt("Tell me the row number of the seat: ");
        try {
            if (rowNumber > this.theater.getNumRows()) {
                throw new RowOutOfBoundException();
            }
            return rowNumber;

        } catch (RowOutOfBoundException exception) {
            System.out.println(exception.getMessage());
            return newBookedRow();
        }
    }

    public int newBookedColumn() {
        int columnNumber = Entry.readInt("Tell me the column number of the seat: ");
        try {
            if (columnNumber > this.theater.getNumColumns()) {
                throw new ColumnOutOfBoundException();
            }
            return columnNumber;

        } catch (ColumnOutOfBoundException exception) {
            System.out.println(exception.getMessage());
            return newBookedColumn();
        }
    }

}
