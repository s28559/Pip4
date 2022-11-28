import java.util.Scanner;

public class zad5 {

    public static void main(String[] args) {
        int liczba1;
        int liczba2;
        String warunek;

        Scanner scan = new Scanner(System.in);
        liczba1 = scan.nextInt();
        liczba2 = scan.nextInt();
        warunek = scan.next();

        switch (warunek) {
            case "ADD":
                System.out.println("Wynik: " + absolutValue(add(liczba1, liczba2)));
                break;
            case "SUB":
                System.out.println("Wynik: " + absolutValue(sub(liczba1, liczba2)));
                break;
            case "DIV":
                System.out.println("Wynik: " + absolutValue(div(liczba1, liczba2)));
                break;
            case "MUL":
                System.out.println("Wynik: " + absolutValue(mul(liczba1, liczba2)));
                break;
            default:
                System.out.println("Brak takiej operacji");
                break;
        }
    }
    public static int add(int liczba1, int liczba2) {
        return liczba1 + liczba2;
    }

    public static int sub(int liczba1, int liczba2) {
        return liczba1 - liczba2;
    }

    public static int div(int liczba1, int liczba2) {
        return liczba1 / liczba2;
    }

    public static int mul(int liczba1, int liczba2) {
        return liczba1 * liczba2;
    }
    public static int absolutValue(int liczba) {
        if (liczba < 0) liczba = -liczba;
        return liczba;
    }


}


