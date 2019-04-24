public class Main {

    public static void main(String[] args) {

        //Exercitiul 15

        int n=12,m=21,pal=0;

        while(n!=0)
        {
            pal=pal*10+n%10;
            n=n/10;
        }
        if(pal==m)
            System.out.println("true");

            else
            System.out.println("false");





        }



}


