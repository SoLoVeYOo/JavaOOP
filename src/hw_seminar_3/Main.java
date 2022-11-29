package hw_seminar_3;


public class Main {
    public static void main(String[] args) {

        CustomList<User> cl = new CustomList<>();
        cl.add(new User("Петр", "Петров", 20));
        cl.add(new User("Иван", "Иванов", 30));
        cl.add(new User("Александр", "Башмаков", 25));
        for (Node node : cl) {
            System.out.println(node.getData());
        }
    }
}
