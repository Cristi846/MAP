import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Noten no = new Noten();

        int[] noten = new int[]{10, 20, 30, 40, 50, 60};

        System.out.println(Arrays.toString(no.nichtAusreichendeNoten(noten)));
        System.out.println(no.durchschnittswert(noten));
        System.out.println(no.maximaleAbgerundeteNote(noten));
        System.out.println(Arrays.toString(no.abgerundeteNoten(noten)));
    }
}