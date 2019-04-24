public class Main {

    public static void main(String[] args) {

        //Exerciutiul 19

        long n = 2981213170020L;
        String gender = "#";
        String luna = "%";
        long aux = 0, zi = 0, an = 0;
        aux = n;
        long[] a = new long[14];
        for (int i = 13; i >= 0; i--) {
            a[i] = a[i] + n % 10;
            n = aux / 10;
            aux = aux / 10;
        }
        for (int i = 1; i <= 13; i++) {
            if (a[1] == 1 || a[1] == 3 || a[1] == 5 || a[1] == 7)
                gender = "Baiat nascut";
            else
                gender = "Fata nascuta";

            if (a[4] == 0 && a[5] == 1)
                luna = "ianuarie";
            if (a[4] == 0 && a[5] == 2)
                luna = "februarie";
            if (a[4] == 0 && a[5] == 3)
                luna = "martie";
            if (a[4] == 0 && a[5] == 4)
                luna = "aprilie";
            if (a[4] == 0 && a[5] == 5)
                luna = "mai";
            if (a[4] == 0 && a[5] == 6)
                luna = "iunie";
            if (a[4] == 0 && a[5] == 7)
                luna = "iulie";
            if (a[4] == 0 && a[5] == 8)
                luna = "august";
            if (a[4] == 0 && a[5] == 9)
                luna = "septembrie";
            if (a[4] == 1 && a[5] == 0)
                luna = "octombrie";
            if (a[4] == 1 && a[5] == 1)
                luna = "noiembrie";
            if (a[4] == 1 && a[5] == 2)
                luna = "decembrie";
            if (a[6] == 0)
                zi = a[7];
            else
                zi = a[6] * 10 + a[7];

            if (a[1] == 1 || a[1] == 2)
                an = 1900 + a[2] * 10 + a[3];

            if (a[1] == 3 || a[1] == 4)
                an = 1800 + a[2] * 10 + a[3];

            if (a[1] == 5 || a[1] == 6)
                an = 2000 + a[2] * 10 + a[3];

            if (a[1] == 7 || a[1] == 8)
                an = 1900 + a[2] * 10 + a[3];






        }
        System.out.println(gender + " pe " + zi + " " + luna + " " + an);
    }
}

