public class zad1 {

    public static void main(String[] args) {
        boolean czyPada = false;
        boolean czySwieciSlonce = false;

        if (czyPada && !czySwieciSlonce) System.out.println("plucha");
        else if (czyPada && czySwieciSlonce) System.out.println("tęcza");
        else if (!czyPada && czySwieciSlonce) System.out.println("słonecznie");
        else if (!czyPada && !czySwieciSlonce) System.out.println("pochmurno");


    }
}





