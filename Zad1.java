import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner wczytaj=new Scanner(System.in);
        double o, średnia=0,p=0;
        int i=-1;
        String przedmiot;
        System.out.print("Podaj nazwę przedmiotu:");
        przedmiot=wczytaj.nextLine();

        do{
            System.out.print("Podaj ocene:");
            o=wczytaj.nextDouble();
            p=p+o;
            i++;
        } while(o>0);
        średnia=p/i;
        System.out.print("średnia z "+przedmiot+" wynosi:"+średnia);
        
        
        wczytaj.close();
    }

}
