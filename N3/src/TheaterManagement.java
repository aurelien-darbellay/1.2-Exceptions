import java.util.Scanner;

public class TheaterManagement {
    private final Theater theater;

    public TheaterManagement(Theater theater) {
        this.theater = theater;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                1 : Show booked seats
                2 : Show seats booked by booker
                3 : Book seat
                4 : Cancel booking
                5 : Cancel bookings by booker
                6 : Exit
                """;
        String input = "";
        while (!input.equals("6")) {
            System.out.println(menu);
            input = scanner.nextLine();
            switch (input) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                default:
            }
        }
    }

}
