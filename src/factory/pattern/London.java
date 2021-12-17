package factory.pattern;

public class London implements CityInterface {

    @Override
    public Product getProduct(String type) {
        if (type.equals("A")) {
            return new ProductLondonA();
        } else if (type.equals("B")) {
            return new ProductLondonB();
        }
        return null;
    }


}
