package ro.ase.cts.g1088;

import java.util.ArrayList;
import java.util.List;

public class UpdateServer implements OS{
    private List<OS> listObservers;
    private String updatePackage;

    public UpdateServer(String updatePackage) {
        listObservers = new ArrayList<OS>();
        this.updatePackage = updatePackage;
    }

    @Override
    public void update(OS observer) {
        listObservers.add(observer);
    }

    @Override
    public void update(OS observer) {
        listObservers.remove(observer);
    }

    @Override
    public void update(String mesaj) {
        for(OS observer:listObservers){
            observer.pushUpdates(updatePackage+":"+ mesaj);
        }
    }
}
