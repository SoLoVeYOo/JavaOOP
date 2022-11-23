package hw_seminar_1;

public class Product {
    private String name;
    private Double coast;

    public Product(String name, Double coast) {
        this(name);
        this.coast = coast;
    }

    public Product(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Double getCoast(){
        return this.coast;
    }


    @Override
    public String toString(){
        return String.format("%s %.2f", this.name, this.coast);
    }
}
