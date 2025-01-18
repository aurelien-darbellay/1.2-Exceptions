import Exceptions.BusySeatException;
import Exceptions.FreeSeatException;

import java.util.ArrayList;

public class SeatManagement {
    private final ArrayList<Seat> seats;

    public SeatManagement() {
        this.seats = new ArrayList<Seat>();
    }

    public ArrayList<Seat> getSeats() {
        return this.seats;
    }

    public int searchSeat(int row, int column) {
        int found = -1;
        Seat newSeat = new Seat(row, column);
        for (int i = 0; i < seats.size(); i++) {
            if (seats.get(i).equals(newSeat)) {
                found = i;
            }
        }
        return found;
    }

    public void addSeat(Seat seat) {
        try {
            int found = searchSeat(seat.getRow(), seat.getColumn());
            if (found == -1) {
                seats.add(seat);
                System.out.println("Booking done!");
            } else throw new BusySeatException();
        } catch (BusySeatException exception) {
            System.out.println(exception.getMessage());
        }

    }

    public void eliminateSeat(int row, int column) {
        try {
            int found = searchSeat(row, column);
            if (found >= 0) {
                seats.remove(found);
                System.out.println("Booking cancelled!");
            } else throw new FreeSeatException();
        } catch (FreeSeatException exception) {
            System.out.println(exception.getMessage());
        }

    }

}
