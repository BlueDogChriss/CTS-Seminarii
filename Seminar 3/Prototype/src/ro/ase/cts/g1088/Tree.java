package ro.ase.cts.g1088;

public class Tree implements Cloneable{
    public String typeCrown;
    public float hight;
    public String color;
    public String family;
    public Locatie locationPlant;

    public void plant(Locatie l){
        this.locationPlant.x=l.x;
        this.locationPlant.y=l.y;
        System.out.println("Locatie X:"+l.x);
        System.out.println("Locatie Y:"+l.y);
    }

@Override
public Tree clone()
{
    Tree clone = null;
    try
    {
        clone = (Tree) super.clone();
    }
    catch (CloneNotSupportedException e) {
        e.printStackTrace();

    }
    return clone;
}

    public Tree(String typeCrown, float hight, String color, String family, Locatie locationPlant) {
        this.typeCrown = typeCrown;
        this.hight = hight;
        this.color = color;
        this.family = family;
        this.locationPlant = locationPlant;
    }
}
