
public class Beverage extends Good{
    Integer size;
    
    public Beverage(String name, Double price, Integer unit, String measure, Integer size){
        super(name, price, unit, measure);
        this.size = size;   
    }

    @Override
    public String toString() {
        return super.toString() +  ", size of bottle -> " + size;
    }
}
