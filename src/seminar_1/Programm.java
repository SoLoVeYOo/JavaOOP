package seminar_1;

import java.util.ArrayList;
import java.util.List;
public class Programm {
    public static void main(String[] args) {
        List<Product> prods = new ArrayList<>();
        prods.add(new Product("Сникерс", 50.0));
        prods.add(new Product("Чипсы", 60.0));
        prods.add(new Product("Лимонад", 70.0));
        prods.add(new Milk("Петмол", 65.0, 5));
//        Product prod  = new Product("Чипсы", 62.0);
//        prod.name = "Чипсы";
//        prod.coast = 114.0;
//        System.out.printf("%s %f\n", prod.getname(), prod.getCoast());
//        prod.name = "Лимонад";
//        prod.setCoast(66.0);
//        System.out.printf("%s %f\n", prod.getname(), prod.getCoast());
        VendingMachine v1 = new VendingMachine(prods);
//        VendingMachine v2 = new VendingMachine();
        System.out.println(v1);
        System.out.println(v1.getProductByName("Лимонад"));
        System.out.println(v1.getProductByCoast(50.0));
//        System.out.println(prod);
    }
}
