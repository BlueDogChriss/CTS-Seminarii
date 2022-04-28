package ro.ase.cts.g1088;

public class Main {

    public static void main(String[] args) {
        iAngajat muncitor1 = new Angajat("Dodel", 1, 1500);
        iAngajat muncitor2 = new Angajat("Gigel", 2, 1500);
        iAngajat muncitor3 = new Angajat("Purcel", 3, 1500);
        iAngajat teamLead = new Angajat("Marius", 4, 2500);



        try{
            teamLead.adaugaNod(muncitor1);
            teamLead.adaugaNod(muncitor2);
            teamLead.adaugaNod(muncitor3);

            teamLead.printAngajat();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}


//ierarhie job:
//-ceo
//    -Solutii dezvoltare Vanzari
//        -ProjectMan1
//            -TeamMan1
//            -TeamMan2
//            -TeamMan3
//        -ProjectMan2
//            -TeamMan1
//            -TeamMan2
//            -TeamMan3
//    -Solutii dezvoltare Marketing
//        -ProjectMan3
//            -TeamMan1
//            -TeamMan2
//            -TeamMan3
//        -ProjectMan4
//            -TeamMan1
//            -TeamMan2
//            -TeamMan3
//    -Solutii dezvoltare Dezvoltare
//        -ProjectMan5
//            -TeamMan1
//            -TeamMan2
//            -TeamMan3
//        -ProjectMan6
//            -TeamMan1
//            -TeamMan2
//            -TeamMan3

//iAngajat:(Interface)
//-printDetalii()

//Angajat:(Class)
//-nume
//-codAngajat
//-salariu
//-listaSubordonati ->iAngajat
//---------
//Angajat()
//printDetalii()
//addSubordonat(iAng)
//delSubordonat(iAng)

//Main:
//1 Creare Ob membri echipe
//2 Creare Ob TM
//3 Add membrii in obiectele TM
//4 CO PM
//5 add TM in ob PM
//        ...
//7 Add sefi in ob CEO
