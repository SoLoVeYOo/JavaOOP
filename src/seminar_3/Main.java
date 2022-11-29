package seminar_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Personal personal = new Personal(new ArrayList<User>(
//                Arrays.asList(new User[]{new User("Иван", "Иванов", 20)})));

        List<User> users = Arrays.asList(new User("Петр", "Петров", 25),
                new User("Александр", "Башмаков>", 30),
                new User("Александр", "Башмаков>", 24),
                new User("Александр", "Вазилинов", 25),
                new User("Александр", "Александров", 30),
                new User(   "Наталья", "Иванова", 18));

        User bigBoss = new User("Начальник", "Начальников", 50);
        User littleBoss = new User("Младший", "Младшов", 45);

        Personal personal = new Personal(users);

        for (User pers: personal) {
            System.out.println(pers);
        }

        Collections.sort(users);
        System.out.println(users);

        littleBoss.setSubordinates(users);
        bigBoss.setSubordinates(Arrays.asList(littleBoss));
        Company company = new Company(bigBoss);
        for (User pers: company) {
            System.out.println(pers);
        }
    }
}
