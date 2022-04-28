package ro.ase.cts.g1088;

import java.util.ArrayList;
import java.util.List;

public class Angajat implements iAngajat{
    private String nume;
    private int codAngajat;
    private float salariu;
    public List<iAngajat> listaSubordonati;

    public Angajat(String nume, int codAngajat, float salariu) {
        this.nume = nume;
        this.codAngajat = codAngajat;
        this.salariu = salariu;
        listaSubordonati=new ArrayList<iAngajat>();
    }

    @Override
    public void stergeNod(iAngajat angajat) {
        listaSubordonati.remove(angajat);
    }

    @Override
    public void adaugaNod(iAngajat angajat) {
        listaSubordonati.add(angajat);
    }

    @Override
    public void printAngajat() {
        System.out.println(nume);
        for(iAngajat angajat:listaSubordonati){
            angajat.printAngajat();
        }
    }
}
