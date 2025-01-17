public class Main {
    public static void main(String[] args) {
        SeatManagement seatManagement = new SeatManagement();
        System.out.println(seatManagement.getSeats());
        seatManagement.addSeat(new Seat(1, 1));
        seatManagement.addSeat(new Seat(1, 2));
        seatManagement.addSeat(new Seat(1, 2));
        System.out.println(seatManagement.getSeats());
        seatManagement.eliminateSeat(2, 1);
        System.out.println(seatManagement.getSeats());
    }
}