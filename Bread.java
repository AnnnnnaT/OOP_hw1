public class Bread extends Food {
    String flour;

    public Bread(String name, Double price, Integer unit, String measure, String expirationDate, String flour){
        super(name, price, unit, measure, expirationDate);
        this.flour = flour;
    }

    @Override
    public String toString() {
        return super.toString() + ", flour type: " + flour;
    }
}
