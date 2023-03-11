public class Good {
    String name;
    Double price;
    Integer unit;
    String measure;

    public Good (String name, Double price, Integer unit, String measure){
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.measure = measure;

    }
 
    @Override
    public String toString() {
        return "name -> " + name + " price: " + price + ", number is " + unit + ", type of measurement " + measure;
    }
}
