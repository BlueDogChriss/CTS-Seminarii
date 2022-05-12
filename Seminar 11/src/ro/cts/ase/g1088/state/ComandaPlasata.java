package ro.cts.ase.g1088.state;

public class ComandaPlasata extends ComandaMancare implements State{

    public ComandaPlasata(){

    }

    public ComandaPlasata(State state){
        super(state);
    }

    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("Comanda cu numarul "+comandaMancare.getNrComanda()+" a fost plasata");
        comandaMancare.setState(new PlataEfectuata(this.getState()));
    }
}
