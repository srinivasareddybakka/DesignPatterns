package com.designpatterns.builderdesignpattern;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDto dto;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDay(LocalDate birthDay) {
        Period ageInYears = Period.between(birthDay, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet() + ", " + address.getCity() + ", "
                + address.getState() + ", " + address.getState();
        return this;
    }

    @Override
    public UserDTO build() {
        dto = new UserWebDto(firstName + " " + lastName, address, age);
        return dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
