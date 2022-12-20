package hw_seminar_4;

public class SteelShield implements Shield{
    @Override
    public Integer absorb() {
        return 200;
    }

    @Override
    public String toString() {
        return "Shield - " + absorb();
    }
}
