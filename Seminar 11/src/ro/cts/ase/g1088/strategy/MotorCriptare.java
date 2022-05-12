package ro.cts.ase.g1088.strategy;

public class MotorCriptare {
    private String mesaj;
    private ModCriptare modCriptare;

    public MotorCriptare() {

    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj){
        this.mesaj=mesaj;
    }

    public ModCriptare getModCriptare(){
        return  modCriptare;
    }

    public void setModCriptare(ModCriptare modCriptare){
        this.modCriptare = modCriptare;
    }

    public MotorCriptare(String mesaj, ModCriptare modCriptare) {
        super();
        this.mesaj = mesaj;
        this.modCriptare = modCriptare;
    }

    public MotorCriptare(String nume) {
        super();
        this.mesaj = mesaj;
        this.modCriptare = new Algoritm1();
    }

}
