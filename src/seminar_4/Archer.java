package seminar_4;

public class Archer extends Warrior<Bow> {
    private Integer range;

    public Integer getRange() {
        return range;
    }

    public Archer(String name, Bow weapon, Integer healthPoint, Integer range) {
        super(name, weapon, healthPoint);
        this.range = range;
    }

    @Override
    public String toString() {
        return "Archer (" +
                super.toString() +
                " range = " + range +
                ")";
//        return String.format("Archer - %s,range - %d",super.toString(),range);
    }
}
