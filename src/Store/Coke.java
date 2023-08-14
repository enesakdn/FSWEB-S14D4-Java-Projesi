package Store;

public class Coke extends ProductForSale{

    private String size;
    public Coke(String type, double price, String description,String size) {
        super(type, price, description);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() +
                " Description: " + getDescription() +
                " Price: " + getPrice() +
                " Piece: " + getSize() );

    }
}
