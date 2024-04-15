package entities;

public non-sealed abstract class Aquatic extends Animal{
    //att
    protected String habitat;

    //constructor
    public Aquatic(){}
    public Aquatic(String fam, String na, int ag, boolean mammal, String habitat){
        super(fam, na, ag, mammal);
        this.habitat = habitat;

    }
    //methodes
    public abstract void swim();
    //diplay
    @Override
    public String toString() {
        return "AQUATIC = [family : "+ this.family + ",\n" +
                "name : "+ this.name + ",\n" +
                "age : "+ this.age + ",\n" +
                "mammal : "+ this.mammal + ",\n" +
                "habitat : "+ this.habitat + "]"
                ;
    }
}
