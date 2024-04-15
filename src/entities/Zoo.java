package entities;

import exceptions.ZooFullException;

import java.util.Arrays;

public class Zoo {

    //Attributs
    private String name, city;
    private final int NBR_CAGES = 3;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int nbrAnimals = 0;

    //Constructeurs
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
    }

    //Methods
    public void addAnimal(Animal animal) throws ZooFullException{
        try{
            if(searchAnimal(animal) == -1){
                for (int i = 0; i < animals.length; i++) {
                    if(animals[i] == null){
                        animals[i] = animal;
                        System.out.println("Animal added successfully!");
                        nbrAnimals++;
                    }
                }
            }else{
                System.out.println("Animal already exists!");
            }
        }catch (Exception e){
            throw new ZooFullException("Zoo is already full!");
        }


    }

    public void addAquatic(Aquatic aq){
        for (int i = 0; i< aquaticAnimals.length; i++) {
            if(aquaticAnimals[i] == null){
                aquaticAnimals[i] = aq;
                return;
            }
        }
    }
    //Remove
    public boolean removeAnimal(Animal a){
        int index = searchAnimal(a);
        if(index > -1){
            if(index != animals.length-1){
                for (int i = index; i < animals.length-1; i++) {
                    animals[i] = animals[i+1];
                }
            }
            animals[animals.length-1] = null;
            nbrAnimals--;
            return true;
        }else{
            System.out.println("Animal does not exists!");
        }

        return false;
    }

    //Search
    public int searchAnimal(Animal a) {
        for (int i = 0; i < nbrAnimals; i++) {
            if(animals[i] != null){
                if(animals[i].getName() == a.getName()){
                    return i;
                }
            }
        }
        return -1;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals > z2.nbrAnimals){
            return z1;
        }else if (z1.nbrAnimals < z2.nbrAnimals){
            return z2;
        }

        return z1;
    }
    //
    public boolean isZooFull(){
        if(nbrAnimals == animals.length){
            return true;
        }

        return false;
    }

    public float maxPenguinSwimmingDepth(){
        float max = 0;
        for (Aquatic aq: aquaticAnimals) {
            if(aq instanceof Penguin p && aq != null){
                if(p.getSwimmingDepth() > max)
                    max = p.getSwimmingDepth();
            }
        }

        return max;
    }

    public void displayNumberOfAquaticsByType(){
        int nbrDolphins = 0;
        int nbrPenguins = 0;

        for (Aquatic aq: aquaticAnimals) {

            if(aq instanceof Dolphin){
                nbrDolphins++;
            }
            if(aq instanceof Penguin){
                nbrPenguins++;
            }

        }
        System.out.println("Penguins = " + nbrPenguins +"\nDolphins = " + nbrDolphins);

    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != ""){
            this.name = name;
        }else{
            System.out.println("Le nom du Zoo ne peut pas etre vide!");
        }

    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //Display
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", animals=" + Arrays.toString(aquaticAnimals) +
                '}';
    }
}
