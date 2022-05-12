package ro.cts.ase.g1088.state;

public class ComandaMancare {
    public State state;
    private int nrComanda;

    public int getNrComanda() {
        return nrComanda;
    }

    public ComandaMancare() {
    }

    public void setNrComanda(int nrComanda){
        this.nrComanda = nrComanda;
    }

    public ComandaMancare(int nrComanda){
        state=null;
        this.nrComanda=nrComanda;
    }

    public State getState(){
        return state;
    }

    public void setState(State state){
        this.state = state;
    }
    public void nextState(){
        this.state.updateState(this);
    }
}
