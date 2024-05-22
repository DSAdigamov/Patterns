package model;

import java.util.List;

public class Human implements Visitor {

    public void checkPlaces(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    public void visit(Bank bank) {
        System.out.println("Клиент посетил банк: " + bank.getName());
    }

    public void visit(Restaurant restaurant) {
        System.out.println("Клиент посетил ресторан: " + restaurant.getName());
    }

}
