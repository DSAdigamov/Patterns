package model;

public abstract class Client {


    private final String name;
    private final String address;
    private final String number;

    public abstract void accept(Visitor visitor);

    public Client(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }
}
