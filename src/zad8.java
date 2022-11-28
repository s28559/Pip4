import java.util.Scanner;

public class zad8 {

    public static void main(String[] args) {
        System.out.println("Witamy w kantorze!");
        System.out.println("Wybierz walutę:");
        System.out.println("    1 - PLN");
        System.out.println("    2 - JPY");

        Scanner scan = new Scanner(System.in);
        int opcja = scan.nextInt();

        System.out.println("Wprowadź kwotę:");
        double kwota = scan.nextDouble();
        double wynik;

        if (opcja == 1) { //pln -> jpy
            double kurs = 30.87;
            wynik = kwota * kurs;
            System.out.println(kwota + " zł => " + wynik + " ¥");
        } else if (opcja == 2) {
            double kurs = 0.032;
            wynik = kwota * kurs;
            System.out.println(kwota + " ¥ => " + wynik + " zł");
        } else System.out.println("Zła opcja");


    }

}
