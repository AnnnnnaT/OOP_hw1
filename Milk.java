public class Milk extends Beverage{
    Double fatContent;
    String  expirationDate;
    
    public Milk(String name, Double price, Integer unit, String measure, Integer size,String  expirationDate, Double fatContent){
        super(name, price, unit, measure, size);
        this.fatContent = fatContent;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", milk expires at " + expirationDate + ", this milk is " + fatContent;
    }
}
