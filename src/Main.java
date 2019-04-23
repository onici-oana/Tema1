public class Main {

    public static void main(String[] args) {

 int n=6, k=1; //am incercat metoda pe exemplul din tema
      while(n!=1) {
          if (n % 2 == 0) {
              n = n / 2;
              k++;
          } else {
              n = 3 * n + 1;
              k++;
          }
      }
        System.out.println("Numarul de pasi este:" +k);


    }
}


