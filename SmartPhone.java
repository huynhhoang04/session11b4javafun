public class SmartPhone extends Device implements Connectable, Chargeable {

    public SmartPhone(int id, String name) {
        super(id, name);
    }

    @Override
    public void turnOn() {
        System.out.println("SmartPhone " + name + " is turning ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartPhone " + name + " is turning OFF.");
    }

    @Override
    public void connectWifi() {
        System.out.println("SmartPhone " + name + " connected to WiFi.");
    }

    @Override
    public void charge() {
        System.out.println("SmartPhone " + name + " is charging.");
    }
}
