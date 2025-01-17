public class Seat {
    private final int row;
    private final int column;
    private String bookedBy;

    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
        this.bookedBy = "Empty";
    }

    public Seat(int row, int column, String bookedBy) {
        this.row = row;
        this.column = column;
        this.bookedBy = bookedBy;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public String getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }

    public boolean equals(Seat seat2) {
        return (this.row == seat2.row && this.column == seat2.column);
    }

    @Override
    public String toString() {
        return "Row: " + this.row + ", Seat: " + this.column + ", Booked by: " + this.bookedBy;
    }
}
