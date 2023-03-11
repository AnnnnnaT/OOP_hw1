public class Hygiene extends Good {
    Integer units;

    public Hygiene(String name, Double price, Integer unit, String measure, Integer units){
        super(name, price, units, measure);
        this.units = units;
    }

    @Override
    public String toString() {
        return super.toString() + ", there are " + units + " units";
    }
}
