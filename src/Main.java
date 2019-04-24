public class Main {

    public static void main(String[] args) {

        //Exercitiul 17

        int n=1234,m=0,k=0,sp=0,si=0;
        int aux=n;
        while(aux!=0)
        {
            aux=aux/10;
            k++;
        }

        for(int i=k-1;i>=0;i++) {
            if (i % 2 == 0)
            {
                sp= sp+n%10; n=n/10;
            }
            else
            {  si=si+n%10; n=n/10;}
        }

        System.out.println(m=sp-si);


    }
}


