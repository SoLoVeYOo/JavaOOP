package seminar_4;

public class Staff implements Weapon{

    @Override
    public Integer damage() {
        return 20;
    }

    @Override
    public String toString() {
        return "Staff - " + damage();
//        return String.format("Staff - %d",damage());
    }
}
