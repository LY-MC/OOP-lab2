package com.utm;

import java.util.Random;

import com.utm.clients.Client;
import com.utm.enums.AnimalType;
import com.utm.miscellaneous.Cage;
import com.utm.zooworkers.Cashier;
import com.utm.zooworkers.SecurityGuard;
import com.utm.zooworkers.Veterinarian;
import com.utm.zooworkers.Zookeeper;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create all instances
        Cage monkeyCage = new Cage();
        monkeyCage.populateCage(5, AnimalType.MONKEY);
        Cage elephantCage = new Cage();
        elephantCage.populateCage(5, AnimalType.ELEPHANT);
        Cage horseCage = new Cage();
        horseCage.populateCage(5, AnimalType.HORSE);
        Cage lionCage = new Cage();
        lionCage.populateCage(5, AnimalType.LION);
        System.out.println("In the cages we have:");
        elephantCage.printAnimalsInCage();
        horseCage.printAnimalsInCage();
        lionCage.printAnimalsInCage();
        monkeyCage.printAnimalsInCage();
        Thread.sleep(5000);
        System.out.println();

        Client client = new Client();
        Cashier cashier = new Cashier();
        Veterinarian veterinarian = new Veterinarian();
        Zookeeper zookeeper = new Zookeeper();
        SecurityGuard securityGuard = new SecurityGuard();
        Random rand = new Random();
        int timeStamp = 8;

        // Main simulation loop
        while (true) {
            System.out.println("Time " + timeStamp + ":00");

            if (timeStamp == 19) {
                System.out.println("DISCOUNT FOR TICKETS!");
            }

            int appear = rand.nextInt(100);
            int age = rand.nextInt(80);
            if (appear % 2 == 0) {
                client.setAge(age);
                client.buyTicket();

                if (timeStamp < 19) {
                    cashier.setTicketPrice(10);
                } else {
                    cashier.setTicketPrice(6);
                }
                cashier.sellTicket(true, client.getAge());

                client.enterZoo();
                System.out.println("Animals:");
                elephantCage.getAnimalList().get(0).makeSound();
                horseCage.getAnimalList().get(0).makeSound();
                lionCage.getAnimalList().get(0).makeSound();
                monkeyCage.getAnimalList().get(0).makeSound();
            }

            int treating = rand.nextInt(100);
            veterinarian.setTreating(treating % 2 == 0);
            if (veterinarian.isTreating()) {
                System.out.println("Veterinarian is treating an animal.");
            }

            int cleaning = rand.nextInt(100);
            zookeeper.setCleaning(cleaning % 2 == 0);
            int feeding = rand.nextInt(100);
            zookeeper.setFeeding(feeding % 2 == 0);
            if (zookeeper.isCleaning()) {
                System.out.println("Zookeeper is cleaning the cage");
            } else if (zookeeper.isFeeding()) {
                System.out.println("Zookeeper is feeding the animals");
            }

            int sleeping = rand.nextInt(100);
            securityGuard.setSleeping(sleeping % 2 == 0);
            if (securityGuard.isSleeping()) {
                securityGuard.setHoursSlept(securityGuard.getHoursSlept() + 1);
            }
            if (securityGuard.getHoursSlept() > 2) {
                securityGuard.setSleeping(false);
                securityGuard.setHoursSlept(0);
            }
            if (securityGuard.isSleeping()) {
                System.out.println("Security guard is sleeping");
            } else {
                System.out.println("Security guard is not sleeping");
            }

            timeStamp++;
            if (timeStamp >= 21) {
                timeStamp = 8;
            }

            System.out.println();
            Thread.sleep(3000);
        }
    }
}
