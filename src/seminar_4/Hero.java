package seminar_4;

public class Hero extends Warrior{

    public Hero(String name, Weapon weapon, Integer healthPoint) {
        super(name, weapon, healthPoint);
    }

    @Override
    public String toString() {
        return "Hero (" + super.toString() + ")";
//        return String.format("Hero - %s",super.toString());
    }
}
