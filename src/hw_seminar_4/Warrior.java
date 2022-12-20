package hw_seminar_4;

public abstract class Warrior<T, S> {

    private String name;

    private T weapon;

    private S shield;

    private Integer healthPoint;

    public Warrior(String name, T weapon, S shield, Integer healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }

    public T getWeapon() {
        return weapon;
    }

    public S getShield() {
        return shield;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }


    @Override
    public String toString() {
        return "Warrior (" +
                "name = " + name +
                ", weapon = " + weapon +
                ", shield = " + shield +
                ", healthPoint = " + healthPoint +
                ")";
    }
}
