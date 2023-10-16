

class Noten {

    public int[] nichtAusreichendeNoten(int[] noten) {
        int[] nichtAusreichende = new int[noten.length];
        int index = 0;

        for (int note : noten) {
            if (note < 40) {
                nichtAusreichende[index] = note;
                index++;
            }
        }

        int[] result = new int[index];
        System.arraycopy(nichtAusreichende, 0, result, 0, index);

        return result;
    }

    public double durchschnittswert(int[] noten) {
        if (noten.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int note : noten) {
            sum += note;
        }

        return sum / noten.length;
    }

    public int[] abgerundeteNoten(int[] noten){
        int[] abgerundeteNote = new int[noten.length];
        int index = 0;

        for (int note : noten) {
            if (note >= 38) {
                abgerundeteNote[index] = round(note);
                index++;
            }
        }

        int[] result = new int[index];
        System.arraycopy(abgerundeteNote, 0, result, 0, index);

        return result;
    }

    public int maximaleAbgerundeteNote(int[] noten) {
        int maxAbgerundet = Integer.MIN_VALUE;

        for (int note : noten) {
            int abgerundet = round(note);
            if (abgerundet > maxAbgerundet) {
                maxAbgerundet = abgerundet;
            }
        }

        return maxAbgerundet;
    }

    private int round(int note) {
        if (note < 38 || note % 5 < 3) {
            return note;
        } else {
            return note + note % 5;
        }
    }
}