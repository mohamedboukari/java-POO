package entities;

public class Dolphin extends Aquatic{
    //att
    private float swimmingSpeed;

    //constructeur
    public Dolphin(){}
    public Dolphin(String fam, String na, int ag, boolean mammal, String habitat, float swimmingSpeed){
        super(fam, na, ag, mammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    //methods

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    //diplay
    @Override
    public String toString() {
        return "Dolphin = [family : "+ this.family + ",\n" +
                "name : "+ this.name + ",\n" +
                "age : "+ this.age + ",\n" +
                "mammal : "+ this.mammal + ",\n" +
                "habitat : "+ this.habitat + ",\n" +
                "Speed : "+ this.swimmingSpeed + "]"
                ;
    }
}
