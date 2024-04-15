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

        a.displayAnimal();
        System.out.println("-----------------------");
        System.out.println(a);

        Zoo myZoo = new Zoo("Belvedere", "Tunis", 25);
        myZoo.addAnimal(a);
        //System.out.println(myZoo);
        System.out.println(myZoo.searchAnimal(a));
        myZoo.addAnimal(a);
        System.out.println((myZoo.removeAnimal(a)));
    }
}