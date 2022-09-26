package com.utm.miscellaneous;

import com.utm.animals.*;
import com.utm.enums.AnimalType;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private final List<Animal> animalList = new ArrayList<>();

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void populateCage(int count, AnimalType animalType) {
        while (count-- > 0) {
            switch (animalType) {
                case MONKEY:
                    this.animalList.add(new Monkey());
                    break;
                case ELEPHANT:
                    this.animalList.add(new Elephant());
                    break;
                case HORSE:
                    this.animalList.add(new Horse());
                    break;
                case LION:
                    this.animalList.add(new Lion());
                    break;
            }
        }
    }

    public void printAnimalsInCage() {
        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }
}
