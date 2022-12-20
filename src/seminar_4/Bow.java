package seminar_4;

public class Bow implements Weapon{

    @Override
    public Integer damage() {
        return 30;
    }

    @Override
    public String toString() {
        return "Bow - " + damage();
//        return String.format("Bow - %d",damage());
    }
}
