package hw_seminar_4;

public class Sword implements Weapon{
    @Override
    public Integer damage() {
        return 200;
    }

    @Override
    public String toString() {
        return "Sword - " + damage();
    }
}
