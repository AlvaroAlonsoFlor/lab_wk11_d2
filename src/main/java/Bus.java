import java.util.ArrayList;

public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus() {
        this.destination = "";
        this.capacity = 30;
        this.passengers = new ArrayList<>();
    }

    public int getPassengers() {
        return passengers.size();
    }
}
