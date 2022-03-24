package ro.ase.cts.g1088;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
//        System.out.println("Testare");

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduceti fraza: ");
        String str = sc.nextLine();

        try{
            if(str.toLowerCase() == str)
            {
                throw new ExceptieAllLower();
            }else if (str.toUpperCase() == str){
                throw new ExceptieAllUppercase();
            }else{
                System.out.print("Ati introdus: "+str);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
