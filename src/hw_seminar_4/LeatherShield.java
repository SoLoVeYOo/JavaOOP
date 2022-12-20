package hw_seminar_4;

public class LeatherShield implements Shield{
    @Override
    public Integer absorb() {
        return 170;
    }

    @Override
    public String toString() {
        return "Shield - " + absorb();
    }
}
