public class Main {
    public static void main(String[] args) {
        //Obj1
        Animal a = new Animal();
        a.family = "Lion";
        a.name = "Simba";
        a.age = 15;
        a.isMammal = true;

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
    }
}