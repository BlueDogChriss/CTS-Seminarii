package ro.cts.ase.g1088.state;

public class MancareGataDeLivrare extends ComandaMancare implements State{

    public MancareGataDeLivrare() {
    }

    public MancareGataDeLivrare(State state) {
        super(state);
    }

    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("Comanda "+comandaMancare.getNrComanda()+" a fost livrata");
        comandaMancare.setState(new ComandaIncCursDeLivrare(this.getState()));
    }
}
