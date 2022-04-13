package ro.ase.cts.g1088;

public class FactoryPachetComplet implements Factory{

    @Override
    public PachetTuristic createPachet(){
        return new PachetCazare();
    }
}
