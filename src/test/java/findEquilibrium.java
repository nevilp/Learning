import java.util.Arrays;

/*** Created By nevil.panchal on 4/4/2021 year 2021 ***/
public class findEquilibrium {




    public static void main(String[] args) {
        Integer[] arrays = {1,2,6,4,0,-1};


        findEquilibriums(arrays);


    }

    static void findEquilibriums(Integer[] arr)
    {
        Integer[] summationArray = new Integer[arr.length];
       int csum = arr[0];
       summationArray[0]=arr[0];
        for(int i=1;i<= arr.length-1;i++)
        {
             csum = arr[ i] +csum;
            summationArray[i]=csum;
        }
        System.out.println(Arrays.toString(summationArray));
        for(int i=1;i<arr.length-1;i++)
        {
        int   lhs  =summationArray[i-1];
         int rhs =           summationArray[summationArray.length-1] - summationArray[i];
         if(lhs==rhs) {
             System.out.println(arr[i]);
         }
        }

    }



}
