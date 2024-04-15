package entities;

public class Penguin extends Aquatic{
    //att
    private float swimmingDepth;

    //constructeur
    public Penguin(){}
    public Penguin(String fam, String na, int ag, boolean mammal, String habitat, float swimmingDepth){
        super(fam, na, ag, mammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }
    //methods

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming");
    }

    //diplay
    @Override
    public String toString() {
        return "Penguin = [family : "+ this.family + ",\n" +
                "name : "+ this.name + ",\n" +
                "age : "+ this.age + ",\n" +
                "mammal : "+ this.mammal + ",\n" +
                "habitat : "+ this.habitat + ",\n" +
                "Depth : "+ this.swimmingDepth + "]"
                ;
    }
}
