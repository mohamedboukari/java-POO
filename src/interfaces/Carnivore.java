package interfaces;

public interface Carnivore <C> {
    void eatMeat(C meat);
    static void notEating(){
        System.out.println("animal not eating");
    }
}
