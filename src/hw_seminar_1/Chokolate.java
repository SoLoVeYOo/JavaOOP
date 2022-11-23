package hw_seminar_1;

public class Chokolate extends Product{
    private Integer calories;

    public Chokolate(String name){
        super(name);
    }

    public Chokolate(String name, Double coast){ super(name, coast); }

    public Chokolate(String name, Double coast, Integer calories){
        super(name, coast);
        this.calories = calories;
    }

    @Override
    public String toString() {
        return String.format("%s %d", super.toString(), calories);
    }
}
