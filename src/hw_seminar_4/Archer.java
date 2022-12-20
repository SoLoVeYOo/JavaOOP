package hw_seminar_4;

public class Archer extends Warrior<Bow, LeatherShield> {
    private Integer range;

    public Integer getRange() {
        return range;
    }

    public Archer(String name, Bow weapon, LeatherShield shield, Integer healthPoint, Integer range) {
        super(name, weapon, shield, healthPoint);
        this.range = range;
    }

    @Override
    public String toString() {
        return "Archer (" +
                super.toString() +
                " range = " + range +
                ")";
    }
}
