
package javaapp;

 // Customer class - represents customer information
public class customer {
    private final String name;
    private final String address;

    public customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public String getDetails() {
        return name + address;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}