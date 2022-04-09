package ro.ase.cts.g1088;

public class OShop {
    private static OShop instance;
    private String info = "info";

    public String getInfo(){
        return info;
    }

    public void setInfo(String info){
        this.info = info;
    }

    private OShop(){}

    public static synchronized OShop getInstance(){
        if(instance == null){
            instance = new OShop();
        }
        return instance;
    }
}


