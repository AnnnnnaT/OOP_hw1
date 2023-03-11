public class Masks extends Hygiene{

    public Masks(String name, Double price, Integer unit, String measure, Integer units){
        super(name, price, unit, measure, units);
    }
    
    @Override
    public String toString() {
        return super.toString() + " ";
    }
}
