public class Pacifier extends Kids{
    public Pacifier(String name, Double price, Integer unit, String measure, Integer minAge, Boolean hypoallergenicity){
        super(name, price, unit, measure, minAge, hypoallergenicity);
    }

    @Override
    public String toString() {
        return super.toString() + " ";
    }
}
