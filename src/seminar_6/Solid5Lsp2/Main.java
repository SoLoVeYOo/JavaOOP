package seminar_6.Solid5Lsp2;

import seminar_6.Solid5Lsp2.lsp.FactoryOrder;
import seminar_6.Solid5Lsp2.lsp.Order;

public class Main {
    public static void main(String[] args) {
        FactoryOrder creator = new FactoryOrder();
        OrderCalculator calculator = new OrderCalculator();
        calculator.add(creator.create(3, 2, false));
        calculator.add(creator.create(1, 3, true));

        for (Order order : calculator) {
            System.out.println(order);
        }

        System.out.printf("Сумма заказа %d", calculator.calcAmount());
    }
}
