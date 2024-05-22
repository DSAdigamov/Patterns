import model.Car;
import model.CarBuilder;
import model.Director;

public class Main {

    public static void main(String[] args) {
        buildViaDefaultBuilder();
        buildViaDirector();
    }

    private static void buildViaDefaultBuilder() {
        System.out.println("Попытка создания новой машины через builder..");

        Car car1 = new CarBuilder()
                .id(1)
                .brand("BMW")
                .model("m3")
                .color("red")
                .engine("V6")
                .height(140)
                .nbrOfDoors(4)
                .build();

        System.out.println(car1 + "\n");
    }

    private static void buildViaDirector() {
        System.out.println("Попытка создания машины через director..");

        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.buildLamborghini(carBuilder);
        carBuilder.id(2).model("aventador");

        System.out.println(carBuilder.build());
    }
}
