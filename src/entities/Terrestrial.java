package entities;

import enums.Food;
import interfaces.Omnivore;

public final class Terrestrial extends Animal implements Omnivore<Food> {
    //att
    private int nbrLegs;




    @Override
    public void eatPlantAndMeet(Food food) {
        System.out.println("Animal eating " + food);
    }

    @Override
    public void eatMeat(Food meat) {
        System.out.println("Animal eating " + meat);
    }

    @Override
    public void eatPlant(Food plant) {
        System.out.println("Animal eating " + plant);
    }
}
