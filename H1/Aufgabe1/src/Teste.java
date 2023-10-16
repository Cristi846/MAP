import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotenTest {

    @Test
    public void testNichtAusreichendeNoten() {
        Noten noten = new Noten();
        int[] grades = {60, 35, 42, 30, 75};
        int[] expected = {35, 30};
        assertArrayEquals(expected, noten.nichtAusreichendeNoten(grades));
    }

    @Test
    public void testDurchschnittswert() {
        Noten noten = new Noten();
        int[] grades = {60, 35, 42, 30, 75};
        double expected = 48.4;
        assertEquals(expected, noten.durchschnittswert(grades));
    }

    @Test
    public void testDurchschnittswertEmptyArray() {
        Noten noten = new Noten();
        int[] grades = {};
        double expected = 0.0;
        assertEquals(expected, noten.durchschnittswert(grades), 0.01);
    }

    @Test
    public void testAbgerundeteNoten() {
        Noten noten = new Noten();
        int[] grades = {60, 35, 42, 30, 75};
        int[] expected = {60, 75};
        assertArrayEquals(expected, noten.abgerundeteNoten(grades));
    }

    @Test
    public void testMaximaleAbgerundeteNote() {
        Noten noten = new Noten();
        int[] grades = {60, 35, 42, 30, 75};
        int expected = 75;
        assertEquals(expected, noten.maximaleAbgerundeteNote(grades));
    }
}
