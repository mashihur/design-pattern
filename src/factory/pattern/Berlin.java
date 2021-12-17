package factory.pattern;

public class Berlin implements CityInterface{

    @Override
    public Product getProduct(String type) {
        if (type.equals("A")) {
            return new ProductBerlinA();
        } else if (type.equals("B")) {
            return new ProductBerlinB();
        }
        return null;
    }

}
