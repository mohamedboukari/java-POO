package main;

import entities.*;

public class Main {
    public static void main(String[] args) {
        //Obj1
        Animal a = new Animal();
        a.setFamily("Lion");
        a.setName("Simba");
        a.setAge(15);
        a.setMammal(true);

        //Obj2
        Animal a1 = new Animal("Lion1", "Simba1", 50, true);
        Animal a2 = new Animal("Lion2", "Simba2", 50, true);
        Animal a3 = new Animal("Lion3", "Simba3", 50, true);

        a.displayAnimal();
        System.out.println("-----------------------");
        System.out.println(a);

        Zoo myZoo = new Zoo("Belvedere", "Tunis");
        Zoo myZoo1 = new Zoo("Friguia", "Bouficha");
        myZoo.addAnimal(a);
        //System.out.println(myZoo);
        System.out.println(myZoo.searchAnimal(a));
        myZoo.addAnimal(a1);
        myZoo1.addAnimal(a2);
        //myZoo1.addAnimal(a3);
        //System.out.println((myZoo.removeAnimal(a)));
        System.out.println("Le zoo est full : " + myZoo.isZooFull());
        System.out.println("Le Zoo ayant le plus d'animaux = " + Zoo.comparerZoo(myZoo, myZoo1));

        //Prosit 5
        Terrestrial t1 = new Terrestrial();
        Aquatic aq1 = new Dolphin("Baleine", "Willy", 30, true, "Eaux froides", 30);
        //System.out.println(aq1);
        //aq1.swim();
        Dolphin d1 = new Dolphin("DODO", "Willy", 30, true, "Eaux froides", 80f);
        //System.out.println(d1);
        //d1.swim();
        Penguin p1 = new Penguin("POPO", "Willy", 30, true, "Eaux froides", 100f);
        Penguin p2 = new Penguin("POPO", "Willy1", 30, true, "Eaux froides", 200f);
        Penguin p3 = new Penguin("POPO", "Willy2", 30, true, "Eaux froides", 80f);


        //System.out.println(p1);
        //p1.swim();

        myZoo.addAquatic(aq1);
        myZoo.addAquatic(d1);
        myZoo.addAquatic(p1);
        myZoo.addAquatic(p2);
        myZoo.addAquatic(p3);
        System.out.println("######################## ");
        //System.out.println(myZoo);
        /*for (Aquatic aq: myZoo.getAquaticAnimals()
             ) {

            aq.swim();

        }
        */
        //System.out.println(myZoo.maxPenguinSwimmingDepth());
        myZoo.displayNumberOfAquaticsByType();
        System.out.println(p1.equals(p2));
    }
}