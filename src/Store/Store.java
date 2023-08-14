package Store;

public class Store {
    public static void main(String[] args) {

        ProductForSale chocolate = new Chocolate("Chocolete"
        ,15,"Abidik gıubidik","Bitter");
        ProductForSale bread = new Bread("Store.Bread",10,
                "İmportant food",3);
        ProductForSale coke = new Coke ("coke",50,"Good","big");

         ProductForSale [] product = {chocolate,bread,coke};

        listProducts(product);

    }

    public static void listProducts(ProductForSale[] products) {

       for(ProductForSale product:products) {

           product.showDetails();

       }

    }
}