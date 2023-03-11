public class Kids extends Good {
    Integer minAge;
    Boolean hypoallergenicity;

    public Kids(String name, Double price, Integer unit, String measure, Integer minAge, Boolean hypoallergenicity){
        super(name, price, unit, measure);
        this.minAge = minAge;
        this.hypoallergenicity = hypoallergenicity;
    }

    @Override
    public String toString() {
        return super.toString() + ", minimum age is " + minAge + ", product is" + hypoallergenicity;
    }
}
