public class Laptop extends Device implements Connectable, Chargeable {

    public Laptop(int id, String name) {
        super(id, name);
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop " + name + " is booting up.");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop " + name + " is shutting down.");
    }

    @Override
    public void connectWifi() {
        System.out.println("Laptop " + name + " connected to WiFi.");
    }

    @Override
    public void charge() {
        System.out.println("Laptop " + name + " is plugged in charging.");
    }
}
