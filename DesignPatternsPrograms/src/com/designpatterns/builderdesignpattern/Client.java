package com.designpatterns.builderdesignpattern;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDTOBuilder userDTOBuilder = new UserWebDTOBuilder();
        UserDTO dto = directBuild(userDTOBuilder, user);
        System.out.println(dto);

    }

    private static UserDTO directBuild(UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthDay(user.getBirthday())
                .withAddress(user.getAddress())
                .build();

    }

    // return sample user
    public static User createUser() {
        User user = new User();
        user.setFirstName("Srinivasa");
        user.setLastName("Reddy");
        user.setBirthday(LocalDate.of(1993, 07, 15));
        Address address = new Address();
        address.setHouseNumber("2-74");
        address.setStreet("patha chirala");
        address.setCity("chirala");
        address.setState("AP");
        address.setZipCode("523165");
        user.setAddress(address);
        return user;
    }
}
