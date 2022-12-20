package seminar_4;

public abstract class Warrior<T extends Weapon> {
    private String name;
    private T weapon;
    private Integer healthPoint;

    public Warrior(String name, T weapon, Integer healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return "Warrior (" +
                "name = " + name +
                ", weapon = " + weapon +
                ", healthPoint = " + healthPoint +
                ")";
//        return String.format("%s,%s,%d", weapon, name, healthPoint);
    }
}
