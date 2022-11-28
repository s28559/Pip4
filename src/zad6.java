import java.util.Random;
import java.util.Scanner;

public class zad6 {

    public static void main(String[] args) {
        double a;
        double b;

        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź 2 liczby rzeczywiste i naciśnij ENTER po każdej z nich:");
        a = scan.nextDouble();
        b = scan.nextDouble();

        if (b < a) {
            double temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Wybrany przedział: [" + a + ", " + b + "]");
        Random rand = new Random();
        double liczba1 = a + (b - a) * rand.nextDouble();
        double liczba2 = a + (b - a) * rand.nextDouble();
        double liczba3 = a + (b - a) * rand.nextDouble();

        System.out.println("Wartości generowane losowo:");
        System.out.println("    " + liczba1);
        System.out.println("    " + liczba2);
        System.out.println("    " + liczba3);

        double[] tablica = {liczba1, liczba2, liczba3};
        for (int i = 0; i < tablica.length; i++) {
            for (int j = i + 1; j < tablica.length; j++) {
                double temp1 = tablica[i];
                double temp2 = tablica[j];

                if (temp1 > temp2) {
                    tablica[i] = temp2;
                    tablica[j] = temp1;
                }
            }
        }

        System.out.println("Gdzie: " + tablica[0] + " < " + tablica[1] + " < " + tablica[2]);
    }
}


