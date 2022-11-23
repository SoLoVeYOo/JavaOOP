package seminar_1;

public class Milk extends Product{
    private Integer fatness;

    public Milk(String name){
        super(name);
    }

    public Milk(String name, Double coast){
        super(name, coast);
    }

    public Milk(String name, Double coast, Integer fatness){
        super(name, coast);
        this.fatness = fatness;
    }

    public Integer getFatness(){
        return this.fatness;
    }

    @Override
    public String toString() {
        return String.format("%s %d", super.toString(), fatness);
    }
}
