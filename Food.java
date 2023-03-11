public class Food  extends Good{
    String expirationDate;

    public Food(String name, Double price, Integer unit, String measure, String expirationDate){
        super(name, price, unit, measure);
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", date of expiration: " + expirationDate;
    }
}
