package org.example;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Faker faker = new Faker(Locale.ITALIAN);
        System.out.println(faker.backToTheFuture().character());

    }
}
