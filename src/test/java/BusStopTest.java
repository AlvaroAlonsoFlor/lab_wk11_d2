import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    Person person;
    BusStop busStop;

    @Before
    public void before() {
        person = new Person();
        busStop = new BusStop("York Place");
    }

    @Test
    public void addToQueue() {
        busStop.addToQueue(person);
        assertEquals(1, busStop.getQueue());
    }

    @Test
    public void removeFromQueue() {
        busStop.addToQueue(person);
        assertEquals(1, busStop.getQueue());
        busStop.removeFromQueue();
        assertEquals(0, busStop.getQueue());
    }
}
