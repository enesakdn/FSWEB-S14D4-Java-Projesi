package Store;

public class Bread extends ProductForSale{

    private int piece;
    public Bread(String type, double price, String description,int piece) {
        super(type, price, description);
        this.piece = piece;
    }

    public int getPiece() {
        return piece;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() +
                " Description: " + getDescription() +
                " Price: " + getPrice() +
                " Piece: " + getPiece() );

    }
}
