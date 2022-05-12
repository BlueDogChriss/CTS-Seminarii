package ro.cts.ase.g1088.state;

public class Main {
    public static void main(String[] args) {
       ComandaMancare comandaMancare = new ComandaMancare(200);

       ComandaPlasata plasata =  new ComandaPlasata();
       plasata.updateState(comandaMancare);

    }
}

/*
* Plasare comanda -> Am manca
* Comanda plasata
* Plata efectuata
* Mancare In Preparare
* Mancare gata de livrare
* Comanda In curs de livrare
* Livrat
*
* ro.cts.ase.g1088.state.State:
* Update state()
*
* Comanda Plasata:
* uodate state()
*
*
* comanda Minaasiasd Context
*
* ro.cts.ase.g1088.state.State s
* nrCmd
* setState(state s)
* getState()
* nextState()
* s.updatestate()
*
* updateState(comanda Mancare c)
* c.setstate(newPlataEfectuata)
*
* */
