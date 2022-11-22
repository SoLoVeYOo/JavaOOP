package seminar_1; /**
 * FileName: Product
 * Author:   Dmitrii
 * Date:     22.11.2022 20:43
 * Description: 1
 */

/**
 * FileName: Product
 * Author:   Dmitrii
 * Date:     22.11.2022 20:43
 * Description: 1
 */
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

    public void setCoast(Double value){
        if (value <= 0) {
            return;
        }
        this.coast = value;
    }

    @Override
    public String toString(){
        return String.format("%s %.2f\n", this.name, this.coast);
    }
}
