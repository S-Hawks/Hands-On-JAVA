package org.example;


public class Main {
    public static void main(String[] args) {
        User user = User.Builder.builder().
                setName("Foo")
                .setSurname("Bar")
                .build();

        System.out.println(user.toString());


    }
}