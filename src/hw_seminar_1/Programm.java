package hw_seminar_1;

import java.util.ArrayList;
import java.util.List;

public class Programm {
        public static void main(String[] args) {
            List<Product> prodsAvtomat = new ArrayList<>();
            prodsAvtomat.add(new Product("Сникерс", 50.0));
            prodsAvtomat.add(new Product("Чипсы", 60.0));
            prodsAvtomat.add(new Product("Лимонад", 70.0));
            prodsAvtomat.add(new Product("Вода"));
            prodsAvtomat.add(new Chokolate("Аленка", 88.0,300));
            prodsAvtomat.add(new Chokolate("АльпенГолд", 130.0,500));
            prodsAvtomat.add(new Chokolate("Милка"));
            prodsAvtomat.add(new Chokolate("Даве", 110.));
            VendingMachine v1 = new VendingMachine(prodsAvtomat);
            System.out.println(v1);
//            System.out.println(v1.getProductByName("АльпенГолд"));
//            System.out.println(v1.getProductByCoast(88.0));
        }
}
