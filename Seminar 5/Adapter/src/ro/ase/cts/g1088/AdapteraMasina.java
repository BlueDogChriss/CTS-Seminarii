package ro.ase.cts.g1088;

public class AdapteraMasina implements JucarieMobila{

    Masina m;

    public AdapteraMasina(){
        m = new Autoturism();
    }

    @Override
    public void seDeplaseaza() {
        m.ruleazaCuVitezaMare();
    }

    @Override
    public void emiteSunete() {
        m.claxoneaza();
    }

}
