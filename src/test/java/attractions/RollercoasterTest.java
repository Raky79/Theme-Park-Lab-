package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 9.0);
        visitor = new Visitor(13, 1.3, 32);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedTo() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(9.0, rollerCoaster.getDefaultPrice(), 0.0);
    }

    @Test
    public void chargesTallVisitorDouble() {
        visitor = new Visitor(27, 210, 9.0);
        assertEquals(18.0, rollerCoaster.getPriceFor(visitor), 0.0);
    }


}
