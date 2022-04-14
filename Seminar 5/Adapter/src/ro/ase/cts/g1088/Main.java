package ro.ase.cts.g1088;

public class Main {
    private static void main(String args[]){
        JucarieMobila adapterMasina = new AdapteraMasina();
        adapterMasina.emiteSunete();
        adapterMasina.seDeplaseaza();

        JucarieMobila j1 = new MasinaJucarie();
        j1.seDeplaseaza();
        j1.emiteSunete();
    }
}
