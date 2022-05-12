package ro.cts.ase.g1088.state;

public class PlataEfectuata extends ComandaMancare implements State{
    public PlataEfectuata() {
    }

    public PlataEfectuata(State state){
        super(state);
    }

    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("Plata comenzii cu numarul "+comandaMancare.getNrComanda()+" a fost efectuata");
        comandaMancare.setState(new MancareInPrepareare(this.getState()));
    }
}
