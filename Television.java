public class Television extends Device implements Connectable {

    public Television(int id, String name) {
        super(id, name);
    }

    @Override
    public void turnOn() {
        System.out.println("TV " + name + " screen is ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV " + name + " screen is OFF.");
    }

    @Override
    public void connectWifi() {
        System.out.println("TV " + name + " connected to WiFi for streaming.");
    }
}
