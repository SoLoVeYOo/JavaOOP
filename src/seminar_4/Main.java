package seminar_4;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ivan", new Bow(), 150);
        Team<Archer> red = new Team<Archer>(hero1);
        red.addHero(new Archer("Pavel", new Bow(), 160, 20));
        red.addHero(new Archer("Pasha", new LongBow(), 130, 15));
        Hero hero2 = new Hero("Dima", new Staff(), 200);
        Team<Warrior> blue = new Team<Warrior>(hero2);
        blue.addHero(new Mage("Alex", new Staff(), 110, 20, 100));
        blue.addHero(new Archer("Sasha", new Bow(), 120, 15));
        for (Warrior item: red) {
            System.out.println(item);
        }
        System.out.println(red);
        System.out.println(blue);
        System.out.println(red.getTeamHp());
        System.out.println(blue.getTeamHp());
    }
}
