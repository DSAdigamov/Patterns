import java.util.List;
import model.Bank;
import model.Client;
import model.Human;
import model.Restaurant;

public class Main {

    public static void main(String[] args) {
        List<Client> clients = List.of(
                new Bank("ВТБ", "bank_address", "bank_number", 22.5),
                new Bank("СБЕРБАНК", "bank_address", "bank_number", 23.5),
                new Restaurant("Вкусно и точкачё", "resto_address", "resto_number", true)
        );

        Human visitor = new Human();
        visitor.checkPlaces(clients);
    }
}
