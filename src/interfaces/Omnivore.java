package interfaces;

public interface Omnivore<O> extends Carnivore<O>, Herbivore<O>{
    void eatPlantAndMeet(O food);
}
