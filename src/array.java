public class Main {
    public static void main(String[] args) {
        // 1. DEKLARATION UND INITIALISIERUNG VON ARRAYS

        // Deklaration eines Arrays (ohne Initialisierung)
        int[] zahlenArray;

        //System.out.println(zahlenArray.length);

        // Initialisierung mit bestimmter Größe
        zahlenArray = new int[5]; // Erstellt ein Array mit 5 Elementen (alle mit Wert 0)

        // Deklaration und Initialisierung in einem Schritt
        int[] zahlen = new int[10];

        // Initialisierung mit bekannten Werten
        int[] noten = {1, 2, 3, 4, 5, 6};

        // Alternative Syntax (weniger gebräuchlich)
        String fruechte[] = {"Apfel", "Banane", "Orange"};


        // 2. ARRAYS MIT VERSCHIEDENEN DATENTYPEN

        // Array mit primitiven Datentypen
        int[] ganzeZahlen = {1, 2, 3, 4, 5};
        double[] kommaZahlen = {1.1, 2.2, 3.3, 4.4};
        boolean[] wahrheitswerte = {true, false, true};
        char[] buchstaben = {'a', 'b', 'c'};

        // Array mit Objekten
        String[] namen = {"Felix", "Johannes", "Herbert"};



        // 3. ZUGRIFF AUF ARRAY-ELEMENTE

        // Zugriff auf einzelne Elemente (Index beginnt bei 0)
        System.out.println("Erstes Element: " + ganzeZahlen[0]); // Gibt 1 aus
        System.out.println("Zweites Element: " + ganzeZahlen[1]); // Gibt 2 aus

        // Ändern von Werten
        ganzeZahlen[2] = 30; // Ändert das dritte Element auf 30
        System.out.println("Geändertes drittes Element: " + ganzeZahlen[2]);

        // Länge eines Arrays ermitteln
        System.out.println("Anzahl der Elemente: " + ganzeZahlen.length);


        // 4. ITERATION ÜBER ARRAYS

        // Mit for-Schleife
        System.out.println("\nIteration mit for-Schleife:");
        for (int i = 0; i < namen.length; i++) {
            System.out.println("Name " + i + ": " + namen[i]);
        }

        // Mit for-each-Schleife (empfohlen)
        System.out.println("\nIteration mit for-each-Schleife:");
        for (String name : namen) {
            System.out.println("Name: " + name);
        }


        // 5. MEHRDIMENSIONALE ARRAYS

        // Zweidimensionales Array (Matrix)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Zugriff auf Elemente in mehrdimensionalen Arrays
        System.out.println("\nElement in Zeile 1, Spalte 2: " + matrix[0][1]); // Gibt 2 aus

        // Iteration über ein 2D-Array
        System.out.println("\n2D-Array ausgeben:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Neue Zeile nach jeder Reihe
        }

        // Oder mit for-each
        System.out.println("\n2D-Array mit for-each:");
        for (int[] zeile : matrix) {
            for (int wert : zeile) {
                System.out.print(wert + " ");
            }
            System.out.println();
        }


        // 6. ARRAYS MIT UNTERSCHIEDLICHEN LÄNGEN

        // Ragged Array (jede Zeile kann unterschiedliche Länge haben)
        int[][] raggedArray = new int[3][];
        raggedArray[0] = new int[2];
        raggedArray[1] = new int[4];
        raggedArray[2] = new int[3];

        // Oder direkt initialisieren
        int[][] dreieck = {
                {1},
                {2, 3},
                {4, 5, 6}
        };

        System.out.println("\nDreieck-Array:");
        for (int[] zeile : dreieck) {
            for (int wert : zeile) {
                System.out.print(wert + " ");
            }
            System.out.println();
        }


        // 7. ARRAYS ALS PARAMETER UND RÜCKGABEWERTE

        // Array als Parameter übergeben
        summeBerechnen(ganzeZahlen);

        // Array als Rückgabewert
        int[] verdoppelt = alleWerteVerdoppeln(ganzeZahlen);
        System.out.println("\nVerdoppelte Werte:");
        for (int wert : verdoppelt) {
            System.out.print(wert + " ");
        }


        // 8. ARRAYS KOPIEREN

        // Flache Kopie (nur die Referenzen werden kopiert)
        int[] original = {1, 2, 3, 4, 5};
        int[] kopie1 = original; // Beide Arrays zeigen auf dieselben Daten!

        // Tiefe Kopie (neue Daten)
        int[] kopie2 = new int[original.length];
        System.arraycopy(original, 0, kopie2, 0, original.length);

        // Mit Java 8+
        int[] kopie3 = java.util.Arrays.copyOf(original, original.length);
    }

    // Methode, die ein Array als Parameter akzeptiert
    public static void summeBerechnen(int[] zahlen) {
        int summe = 0;
        for (int zahl : zahlen) {
            summe += zahl;
        }
        System.out.println("\nSumme aller Zahlen: " + summe);
    }

    // Methode, die ein Array zurückgibt
    public static int[] alleWerteVerdoppeln(int[] zahlen) {
        int[] ergebnis = new int[zahlen.length];
        for (int i = 0; i < zahlen.length; i++) {
            ergebnis[i] = zahlen[i] * 2;
        }
        return ergebnis;
    }


}
