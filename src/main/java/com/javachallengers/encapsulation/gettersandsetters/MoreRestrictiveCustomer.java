package com.javachallengers.encapsulation.gettersandsetters;

public class MoreRestrictiveCustomer {

    private final String name;
    private final String dateOfBirth;
    private final String address;

    public MoreRestrictiveCustomer(String name, String dateOfBirth, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

}
