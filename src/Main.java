public class Main {

    public static void main(String[] args) {

        //Exercitiul 16

        int n=24632,k=0,s=0;
        int aux=n;
        while(aux!=0)
        {
            aux=aux/10;
            k++;

        }

        System.out.println("Numarul are "+ k +" cifre");
        for(int i=k-1;i>=0;i++) {
            if (i % 2 == 0)
            {
               s= s+n%10; n=n/10;
            }
            else
                n=n/10;
        }
        System.out.println("Suma numerelor de pe pozitii pare este "+s);


        }
}


