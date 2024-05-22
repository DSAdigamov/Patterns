public class Bus extends Vehicle {

    private final int doors;

    public Bus(String brand, String model, String color, int doors) {
        super(brand, model, color);
        this.doors = doors;
    }

    private Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "doors=" + doors + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}