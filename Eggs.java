public class Eggs extends Food {
    Integer unitsInPackage;

    public Eggs(String name, Double price, Integer unit, String measure, String expirationDate, Integer unitsInPackage){
        super(name, price, unitsInPackage, measure, expirationDate);
        this.unitsInPackage = unitsInPackage;
    }

    @Override
    public String toString() {
        return super.toString() + ", there are" + unitsInPackage + " eggs in package";
    }
}
