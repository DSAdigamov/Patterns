import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehicle> vehicles = List.of(
                new Car("BMW", "car_model", "red", 300),
                new Bus("HQL", "bus_model", "blue", 8)
        );

        vehicles.forEach(System.out::println);
    }

}
