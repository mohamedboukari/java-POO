package entities;

public sealed class Animal permits Aquatic, Terrestrial{

    //Attributs
    protected String family, name;
    protected int age;
    protected boolean mammal;

    //Constructeurs
    public Animal(){}
    public Animal(String fam, String na, int ag, boolean mammal){
        this.family = fam;
        this.name = na;
        this.age = ag;
        this.mammal = mammal;
    }
    //Getters and setters
    public String getFamily(){
        return this.family;
    }

    public void setFamily(String family){
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0)
        {
            this.age = age;
        }else {
            System.out.println("Age ne peut pas etre negatif!");
        }
    }

    public boolean isMammal() {
        return mammal;
    }

    public void setMammal(boolean mammal) {
        mammal = mammal;
    }

    //Display
    public void displayAnimal(){
        System.out.println("Family = " + this.family + "\nName = " + this.name + "\nAge = "+ this.age);
    }

    //Display
    @Override
    public String toString() {
        return "Animal{Family = " + this.family + "\nName = " + this.name + "\nAge = "+ this.age + "\nMamifere = s" + this.mammal+"}";
    }
}
