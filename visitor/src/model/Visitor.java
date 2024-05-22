package model;

public interface Visitor {

    void visit(Bank bank);

    void visit(Restaurant restaurant);
}
