package seminar_1; /**
 * FileName: VendingMachine
 * Author:   Dmitrii
 * Date:     22.11.2022 21:52
 * Description: 1
 */

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: VendingMachine
 * Author:   Dmitrii
 * Date:     22.11.2022 21:52
 * Description: 1
 */
public class VendingMachine {
    private List<Product> products; // = new ArrayList<Product>();
    private final static List<Product> newProduct = new ArrayList<>();
    static {
        newProduct.add(new Product("Сникерс", 89.0));
    }

    public VendingMachine(){
        this(newProduct);
    }

    public VendingMachine(List<Product> prods){
        this.products = prods;
    }

    public VendingMachine(String name, Double coast){
        this.products = new ArrayList<>();
        products.add(new Product(name, coast));
    }

    public Product getProductByName(String zapros) {
        for (Product product : products) {
            if (product.getName().contains(zapros)) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByCoast(Double zapros){
        for (Product product: products) {
            if (product.getCoast().equals(zapros)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (Product product: products) {
            result = result.concat(product.toString() + "\n");
        }
        return result;
    }
}
