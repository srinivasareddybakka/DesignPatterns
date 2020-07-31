package com.designpatterns.builderdesignpattern;

import java.time.LocalDate;

public interface UserDTOBuilder {

    // methods to build "Parts" of the product
    UserDTOBuilder withFirstName(String fname);

    UserDTOBuilder withLastName(String lname);

    UserDTOBuilder withBirthDay(LocalDate birthDay);

    UserDTOBuilder withAddress(Address address);

    // method to assemble the product
    UserDTO build();

    // optional method to fetch already built object

    UserDTO getUserDTO();

}
