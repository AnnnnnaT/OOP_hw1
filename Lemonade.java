

public class Lemonade extends Beverage{

    public Lemonade(String name, Double price, Integer unit, String measure, Integer size){
        super(name, price, unit, measure, size);
    }

    @Override
    public String toString() {
        return super.toString() +  " ";
    }
}