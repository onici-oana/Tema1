public class Main {

    public static void main(String[] args) {

       //Exercitiul 10

        int suma=0,k=5;
        int[] array=new int[]{2,5,4,7,9,4,10,2,8,99,71};
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0 && k!=0)
            {
                suma=suma+array[i];
                k--;
            }
        }
        System.out.println(suma);

    }
}


