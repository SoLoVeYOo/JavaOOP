package hw_seminar_4;

public class Mage extends Warrior<Staff, MagicShield> {
    private Integer range;
    private Integer mana;

    public Integer getRange() {
        return range;
    }

    public Integer getMana() {
        return mana;
    }

    public Mage(String name, Staff weapon, MagicShield shield, Integer healthPoint, Integer range, Integer mana) {
        super(name, weapon, shield, healthPoint);
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
    }
}
