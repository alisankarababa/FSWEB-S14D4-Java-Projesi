import com.workintech.models.Bread;
import com.workintech.models.Chocolate;
import com.workintech.models.Coke;
import com.workintech.models.ProductForSale;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[] {
                new Chocolate(10.5, "35% milky chocolate", 35),
                new Coke(35, "best coke ever!", 4.9),
                new Bread(10, "made specifically for making sandwiches", 300.15),
                new Coke(40, "less carbohydrates", 5.2),
                new Chocolate(10.5, "bitter", 0),
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

        for(ProductForSale product: products) {
            product.showDetails();
        }

    }
}