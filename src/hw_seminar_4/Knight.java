package hw_seminar_4;

public class Knight extends Warrior<Sword, SteelShield>{
    private Integer strange;

    public Integer getStrange() {
        return strange;
    }

    public Knight(String name, Sword weapon, SteelShield shield, Integer healthPoint, Integer strange) {
        super(name, weapon, shield, healthPoint);
        this.strange = strange;
    }

    @Override
    public String toString() {
        return "Knight (" +
                super.toString() +
                " strange = " + strange +
                ")";
    }
}
