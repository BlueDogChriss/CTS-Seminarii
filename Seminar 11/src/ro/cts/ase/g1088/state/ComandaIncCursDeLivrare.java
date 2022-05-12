package ro.cts.ase.g1088.state;

public class ComandaIncCursDeLivrare extends ComandaMancare implements State
{
    public ComandaIncCursDeLivrare() {
    }

    public ComandaIncCursDeLivrare(State state) {
        super(state);
    }

    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("Comanda "+comandaMancare.getNrComanda()+" este in curs de livrare");
        comandaMancare.setState(new Livrat(this.getState()));
    }
}
