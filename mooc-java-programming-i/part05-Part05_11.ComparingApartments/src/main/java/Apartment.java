public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;

    }

    public int getSquares() {
        return this.squares;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int priceD = pricePerSquare * squares - compared.pricePerSquare * compared.squares;
        if (priceD < 0) {
            priceD = priceD * -1;
        }
        return priceD;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int apto = this.pricePerSquare * this.squares;
        int aptoComp = compared.pricePerSquare * compared.squares;
        if (apto > aptoComp) {
            return true;
        }
        return false;
    }
}

