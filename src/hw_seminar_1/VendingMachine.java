package hw_seminar_1;


import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products;
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
