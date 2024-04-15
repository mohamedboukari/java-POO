import java.util.Arrays;

public class Zoo {

    //Attributs
    String name, city;
    int nbrCages;
    Animal[] animals;
    int nbrAnimals = 0;

    //Constructeurs
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }

    //Methodes
    boolean addAnimal(Animal animal){
        if(searchAnimal(animal) == -1 && nbrAnimals < animals.length){
            for (int i = 0; i < animals.length; i++) {
                if(animals[i] == null){
                    animals[i] = animal;
                    System.out.println("Animal added successfully!");
                    nbrAnimals++;
                    return true;
                }
            }
        }else{
            System.out.println("Animal already exists!");
        }
        return false;
    }
    //Remove
    boolean removeAnimal(Animal a){
        int index = searchAnimal(a);
        if(index > -1){
            if(index != animals.length-1){
                for (int i = index; i < animals.length; i++) {
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
    int searchAnimal(Animal a) {
        for (int i = 0; i < nbrAnimals; i++) {
            if(animals[i] != null){
                if(animals[i].name == a.name){
                    return i;
                }
            }
        }
        return -1;
    }

    //Display
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}
