public class Theater {
    private int numRows;
    private int numColumns;
    TheaterManagement theaterManagement;
    SeatManagement seatManagement;

    public Theater() {
        this.theaterManagement = new TheaterManagement(this);
        this.seatManagement = new SeatManagement();
        this.requestInitialData();
        theaterManagement.menu();

    }

    private void requestInitialData() {
        this.numRows = Entry.readInt("How many rows are there in your theater?");
        this.numColumns = Entry.readInt("How many seats is there in each row in your theater?");
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }
}
