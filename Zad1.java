import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner wczytaj=new Scanner(System.in);
        double średnia=0;
        int i = 0, o = -1, p;
        int[] oceny = new int[30];
        String przedmiot;
        System.out.print("Podaj nazwę przedmiotu:");
        przedmiot=wczytaj.nextLine();
        do {
            System.out.print("Podaj ocene:");
            oceny[i] = wczytaj.nextInt();
            i++;
            o++;
        } while(i < oceny.length && oceny[i - 1] != 0);
        
        wczytaj.close();

        for(p=0;p<o;p++){
            średnia +=oceny[p];
        }    
        średnia=średnia/o;
        System.out.print("średnia z "+przedmiot+" wynosi:"+średnia);
    }
    
}
