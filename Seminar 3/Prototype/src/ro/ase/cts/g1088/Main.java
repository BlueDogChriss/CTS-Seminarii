package ro.ase.cts.g1088;

import javax.management.ConstructorParameters;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<Tree> listaCopaci = new ArrayList<>();

        Tree tree  = new Tree("cerc",10,"maro", "pin", new Locatie(10,20));
        listaCopaci.add(tree);
        Tree tree2=tree.clone();
        tree2.plant(new Locatie(30,30));
        listaCopaci.add(tree2);

        System.out.println(listaCopaci);
    }
}
