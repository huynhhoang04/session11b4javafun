public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[3];
        
        devices[0] = new SmartPhone(1, "iPhone 15");
        devices[1] = new Laptop(2, "Dell XPS");
        devices[2] = new Television(3, "Sony Bravia");

        System.out.println("=== DEVICE MANAGEMENT SYSTEM ===");

        for (Device d : devices) {
            System.out.println("--------------------------------");
            System.out.println("Device ID: " + d.id + " | Name: " + d.name);
            
            d.turnOn();

            if (d instanceof Connectable) {
                ((Connectable) d).connectWifi();
            }

            if (d instanceof Chargeable) {
                ((Chargeable) d).charge();
            } else {
                System.out.println("(This device cannot be charged)");
            }

            d.turnOff();
        }
    }
}
