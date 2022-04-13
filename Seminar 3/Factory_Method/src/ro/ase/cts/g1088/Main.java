package ro.ase.cts.g1088;

public class Main {
    public static void main(String args[]){

        Factory factory = new FactoryPachetCazare();
        PachetTuristic pachet = factory.createPachet();

        pachet.showDetalii();
    }
}
