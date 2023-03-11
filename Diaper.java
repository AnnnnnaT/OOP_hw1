public class Diaper extends Kids{
    String size;
    Integer minWeight;
    Integer maXWeight;
    String typeOfDiaper;
    
    public Diaper(String name, Double price, Integer unit, String measure, Integer minAge, Boolean hypoallergenicity,
    String size, Integer minWeight, Integer maXWeight, String typeOfDiaper){
        super(name, price, unit, measure, minAge, hypoallergenicity);
        this.size = size;
        this.minWeight = minWeight;
        this.maXWeight =maXWeight;
        this.typeOfDiaper = typeOfDiaper;
    }

    @Override
    public String toString() {
        return super.toString() + " size: " + size + ", minimum weight is " + minWeight + " maximum weight is " + maXWeight + ", type of diaper-> " + typeOfDiaper;
    }

}
