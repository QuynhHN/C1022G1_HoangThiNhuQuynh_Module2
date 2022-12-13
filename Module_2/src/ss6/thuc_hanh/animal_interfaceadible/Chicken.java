package ss6.thuc_hanh.animal_interfaceadible;

import ss6.thuc_hanh.animal_interfaceadible.Animal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
