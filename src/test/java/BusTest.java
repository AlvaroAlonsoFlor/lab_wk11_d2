import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before() {
        bus = new Bus();
        person = new Person();
        busStop = new BusStop("York Place");
    }

    @Test
    public void numberOfPassengers() {
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void addPassenger() {
       bus.addPassenger(person);
       assertEquals(1, bus.getPassengers());
    }

    @Test
    public void addPassengerNoSpace() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.getPassengers());
        assertEquals(false, bus.addPassenger(person));

    }

    @Test
    public void removePassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengers());
        bus.removePassenger();
        assertEquals(0, bus.getPassengers());
    }

    @Test
    public void pickUp() {
        busStop.addToQueue(person);
        bus.pickUp(busStop);
        assertEquals(1, bus.getPassengers());
    }
}
