package seminar_4;

public class Mage extends Warrior<Staff>{
    private Integer range;
    private Integer mana;

    public Integer getRange() {
        return range;
    }

    public Integer getMana() {
        return mana;
    }

    public Mage(String name, Staff weapon, Integer healthPoint, Integer range, Integer mana) {
        super(name, weapon, healthPoint);
        this.range = range;
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Mage (" +
                super.toString() +
                " range = " + range +
                ", mana = " + mana +
                ")";
//        return String.format("Mage - %s,mana - %d,range - %d",super.toString(),mana,range);
    }
}
