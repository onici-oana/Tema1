public class Main {

    public static void main(String[] args) {

        //Exerciul 3
        int n=5,max=0,k=0;
        int[] array=new int[]{12,303,121,44,88};
        for(int i=0;i<n;i++)
        { if(array[i]%2!=0 && max<array[i])
        {
            max=array[i]; k=1;
        }
        }

        if(k!=0)
            System.out.println(max);
        else
            System.out.println("NO");

    }
}


