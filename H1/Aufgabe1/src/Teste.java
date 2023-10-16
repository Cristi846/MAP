import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Objects;

public class Teste {
    @Test
    public void nichtAusreichendeNotenTester(){
        Noten no = new Noten();
        int[] arr = new int[]{10, 20, 30, 40};
        assert Arrays.equals(no.nichtAusreichendeNoten(arr), new int[]{10, 20, 30});
    }

    @Test
    public void durchschnittswertTester(){
        Noten no = new Noten();
        int[] arr = new int[]{10, 20, 30, 40};
        assert no.durchschnittswert(arr) == 25;

        int[] arr2 = new int[]{2, 3};
        assert no.durchschnittswert(arr2) == 2.5;
    }

    @Test
    public void abgerundeteNotenTester(){
        Noten no = new Noten();
        int[] arr = new int[]{10, 20, 30, 38};
        assert Arrays.equals(no.abgerundeteNoten(arr), new int[]{40});
    }

    @Test
    public void maximaleAbgerundeteNoteTester(){
        Noten no = new Noten();
        int[] arr = new int[]{38, 40, 59, 28};
        assert no.maximaleAbgerundeteNote(arr) == 60;
    }
}
