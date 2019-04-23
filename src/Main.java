public class Main {

    public static void main(String[] args) {

        //Exerciul 4
        int n=7,par=0,impar=0;
        int[] array= new int[]{12,35,75,23,75,23,64};
        for(int i=0;i<n;i++)
        { if(array[i]%2==0)
            par++;
        else
            impar++;

        }
        System.out.println("In vector exista: " + par + " numere pare si " +impar + " numere impare");

    }
}


