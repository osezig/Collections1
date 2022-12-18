package Transport;

public class Trucks extends Transport implements Challenge {
    public enum LoadCapacity {
        N1("до 3,5 тонн"),
        N2_DOWN_BOUND("от 3,5 тонн"),
        N2_UPPER_BOUND("до 12 тонн"),
        N3("свыше 12 тонн");

        String loadCapacity;

        LoadCapacity(String loadCapacity) {
            this.loadCapacity = loadCapacity;
        }

        @Override
        public String toString() {
            return loadCapacity;
        }
    }

    LoadCapacity loadCapacity;
    LoadCapacity loadCapacityTwo;

    private TransportType transportType;

    public Trucks(String brand, String model, double engineVolume, LoadCapacity downBoundLoadCapacity,
                  LoadCapacity upperBoundLoadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = downBoundLoadCapacity;
        this.loadCapacityTwo = upperBoundLoadCapacity;

    }

    public Trucks(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начал движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Грузовик закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик на пит-стопе");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузовика:...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика:...");
    }

    @Override
    public String toString() {

        if (this.loadCapacityTwo == null) {
            return "Track{" +
                    "brand='" + getBrand() + '\'' +
                    ", model='" + getModel() + '\'' +
                    "Грузоподъемность: " + loadCapacity +
                    '}';
        } else {
            return "Track{" +
                    "brand='" + getBrand() + '\'' +
                    ", model='" + getModel() + '\'' +
                    "Грузоподъемность: " + loadCapacity +
                    " " + loadCapacityTwo +
                    '}';
        }
    }

    @Override
    public void printType() {
        if (transportType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(transportType);
        }
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }
}
