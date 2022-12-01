package hw_seminar_3;


public class Main {
    public static void main(String[] args) {

        CustomList<User> users = new CustomList<>();
        users.add(new User("Петр", "Петров", 20));
        users.add(new User("Иван", "Иванов", 30));
        users.add(new User("Александр", "Башмаков", 25));
        for (Node node : users) {
            System.out.println(node.getData());
        }
    }
}
