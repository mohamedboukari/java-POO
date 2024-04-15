public class Animal {

    //Attributs
    String family, name;
    int age;
    boolean isMammal;

    //Constructeurs
    Animal(){}
    Animal(String fam, String na, int ag, boolean isMam){
        this.family = fam;
        this.name = na;
        this.age = ag;
        this.isMammal = isMam;
    }

    //Display
    void displayAnimal(){
        System.out.println("Family = " + this.family + "\nName = " + this.name + "\nAge = "+ this.age);
    }

    //Display
    @Override
    public String toString() {
        return "Animal{Family = " + this.family + "\nName = " + this.name + "\nAge = "+ this.age + "\nMamifere = s" + this.isMammal+"}";
    }
}
