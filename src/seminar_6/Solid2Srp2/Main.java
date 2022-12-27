package seminar_6.Solid2Srp2;

import seminar_6.Solid2Srp2.srp.models.InputConsole;
import seminar_6.Solid2Srp2.srp.models.Order;
import seminar_6.Solid2Srp2.srp.models.PersisterOrderFile;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order1 = new InputConsole().inputFromConsole();
        PersisterOrderFile persisterOrderFile =
                new PersisterOrderFile("src/seminar_6/Solid2Srp2/srp/models/order.json");
        persisterOrderFile.saveToJson(order1);
    }
}
