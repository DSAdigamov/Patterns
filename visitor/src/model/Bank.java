package model;

public class Bank extends Client {

    private final double creditPercent;

    public Bank(String name, String address, String number, double creditPercent) {
        super(name, address, number);
        this.creditPercent = creditPercent;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getCreditPercent() {
        return creditPercent;
    }
}
