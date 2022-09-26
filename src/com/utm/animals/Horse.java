package com.utm.animals;

import java.time.Instant;
import java.util.Random;

public class Horse extends Animal {
    public Horse() {
        super();
        Random random = new Random();

        setAge(random.nextInt(29) + 1);
        setMale(random.nextBoolean());
        setIll(random.nextBoolean());
        setHungry(random.nextBoolean());
        setWeight(random.nextInt(90) + 360);
        setHeight(random.nextInt(15) + 140);
    }

    @Override
    public void makeSound() {
        System.out.println("Woo hoo hoo hoooo");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight=" + super.getWeight() +
                ", height=" + super.getHeight() +

                ", age=" + super.getAge() +
                ", isMale=" + super.isMale() +
                ", isIll=" + super.isIll() +
                ", isHungry=" + super.isHungry() +
                '}';
    }
}
