package ro.ase.cts.g1088;

public class FactoryPachetCazare implements Factory{
    @Override
    public PachetTuristic createPachet(){
        return new PachetCazare();
    }
}
