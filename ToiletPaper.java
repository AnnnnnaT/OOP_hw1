public class ToiletPaper extends Hygiene{
    Integer numberOfLayers;

    public ToiletPaper(String name, Double price, Integer unit, String measure, Integer units, Integer numberOfLayers){
        super(name, price, unit, measure, units);
        this.numberOfLayers = numberOfLayers;

    }

    @Override
    public String toString() {
        return super.toString() + ", this toilet paper has " + numberOfLayers + " layers";
    }
}
