package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    private double price;

    public RollerCoaster(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 & visitor.getHeight()>145) {
            return true;
        }
        return false;
    }

    public double getDefaultPrice() {
        return this.price;
    }


    public double getPriceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) {
            return getDefaultPrice() * 2;
        }
            return getDefaultPrice();
        }
    }