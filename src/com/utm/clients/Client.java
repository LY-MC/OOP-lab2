package com.utm.clients;

public class Client {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void buyTicket() {
        if (age < 18) {
            System.out.println("Child buys a ticket with 50% discount.");
        } else {
            System.out.println("Adult buys a ticket.");
        }
    }

    public void enterZoo() {
        System.out.println("Client enters the zoo.");
    }
}
