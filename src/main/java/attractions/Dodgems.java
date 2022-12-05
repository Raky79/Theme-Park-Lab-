package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double price;

    public Dodgems(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    public double getDefaultPrice() {
        return this.price;
    }

    public double getPriceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return getDefaultPrice() / 2;
        }
            return getDefaultPrice();
    }




}
