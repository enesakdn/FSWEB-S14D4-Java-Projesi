package Store;

public class Chocolate extends ProductForSale{

    private String kind;


    public Chocolate(String type, double price, String description,String kind) {
        super(type, price, description);
        this.kind = kind;

    }

    public String getKind() {
        return kind;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() +
                " Description: " + getDescription() +
                " Price: " + getPrice() +
                " Piece: " + getKind() );;

    }
}
