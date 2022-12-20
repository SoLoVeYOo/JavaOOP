package hw_seminar_4;

public class MagicShield implements Shield {

    @Override
    public Integer absorb() {
        return 100;
    }

    @Override
    public String toString() {
        return "Shield - " + absorb();
    }
}
