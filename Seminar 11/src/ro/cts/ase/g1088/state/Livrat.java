package ro.cts.ase.g1088.state;

import java.security.PublicKey;

public class Livrat extends ComandaMancare implements State{
    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("Comanda "+comandaMancare.getNrComanda()+" a fost livrata");
    }

    public Livrat(){

    }

    public Livrat(State state){
        super(state);
    }
}
