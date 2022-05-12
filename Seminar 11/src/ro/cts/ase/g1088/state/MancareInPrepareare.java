package ro.cts.ase.g1088.state;

public class MancareInPrepareare extends ComandaMancare implements State{

    public MancareInPrepareare() {
    }

    public MancareInPrepareare(State state) {
        super(state);
    }

    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("Comanda "+comandaMancare.getNrComanda()+" este in curs de preparare");
        comandaMancare.setState(new MancareGataDeLivrare(this.getState()));
    }
}
