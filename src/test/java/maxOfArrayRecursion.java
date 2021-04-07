/*** Created By nevil.panchal on 4/4/2021 year 2021 ***/
public class maxOfArrayRecursion {

    public static void main(String[] args) {

        int[] array= { 6,3,5,4};


     int max =   maxofArray(array,0);
        System.out.println(max);


    }

    private static int maxofArray(int[] array, int i) {
        System.out.println("current i " + i);
        if(i==array.length-1)
        {
            System.out.println("en of last recursion");
            return array[i];

        }
    int  nextMaxxOfArray =  maxofArray(array,i+1);
        System.out.println("based on max i " + i);
        System.out.println("returning of stacke where i= " + i);
        if(nextMaxxOfArray>array[i])
    {

        return nextMaxxOfArray;
    }else{
            System.out.println("returning array on index i =" + i);
            return array[i];
    }




    }


}
