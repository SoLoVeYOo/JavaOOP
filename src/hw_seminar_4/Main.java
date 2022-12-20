package hw_seminar_4;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Ivan", new Bow(), new SteelShield(), 150);
        Team<Warrior> red = new Team<Warrior>(hero1);
        red.addHero(new Knight("Pavel", new Sword(), new SteelShield(), 160, 5));
        red.addHero(new Archer("Pasha", new LongBow(), new LeatherShield(),  130, 15));
        Hero hero2 = new Hero("Dima", new Staff(), new MagicShield(), 200);
        Team<Mage> blue = new Team<Mage>(hero2);
        blue.addHero(new Mage("Alex", new Staff(), new ArcaneMagicShield(), 110, 20, 100));
        blue.addHero(new Mage("Sasha", new Staff(), new FrostMagicShield(), 130, 25, 120));

        System.out.println(red);
        System.out.println(blue);
        System.out.println(red.getTeamHp());
        System.out.println(blue.getTeamHp());
    }
}
