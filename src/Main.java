abstract class Room {
    int beds, size;
    double price;

    Room(int beds, int size, double price) {
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    void display() {
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqft");
        System.out.println("Price per night: " + price);
    }
}

class SingleRoom extends Room {
    SingleRoom() { super(1, 250, 1500); }
}

class DoubleRoom extends Room {
    DoubleRoom() { super(2, 400, 2500); }
}

class SuiteRoom extends Room {
    SuiteRoom() { super(3, 750, 5000); }
}

public class Main {

    public static void main(String[] args) {

        // UC1
        System.out.println("=================================");
        System.out.println(" Welcome to Book My Stay App ");
        System.out.println(" Version: 2.0 ");
        System.out.println("=================================");

        // UC2
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        SingleRoom s = new SingleRoom();
        DoubleRoom d = new DoubleRoom();
        SuiteRoom su = new SuiteRoom();

        System.out.println("\nSingle Room:");
        s.display();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\nDouble Room:");
        d.display();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\nSuite Room:");
        su.display();
        System.out.println("Available: " + suiteAvailable);
    }
}