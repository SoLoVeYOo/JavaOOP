package hw_seminar_4;

public class Hero extends Warrior {

    public Hero(String name, Weapon weapon, Shield shield, Integer healthPoint) {
        super(name, weapon, shield, healthPoint);
    }

    @Override
    public String toString() {
        return "Hero (" + super.toString() + ")";
    }
}
