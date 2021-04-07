import java.util.Arrays;

/*** Created By nevil.panchal on 4/3/2021 year 2021 ***/
public class MergeArray {

    public static void main(String[] args) {

        Integer[] array1 = {1,2,4,8};
        Integer[] array2 ={3,5,6,9,10,14,15};
        Integer[] array3 ={4,2,7,3,0,9,5};


        System.out.println(Arrays.toString(mergeTwoSortarray(array1, array2)));


        System.out.println(Arrays.toString(mergeSort(array3, 0, array3.length-1)));


    }

    public static Integer[]
    mergeSort(Integer[]array, Integer low, Integer high)
    {
        System.out.println("current high= " + high + " current low= " + low);
        if(high==low)
       {
           Integer[] ba = new Integer[1];
           ba[0]= array[low];
           return new Integer[]{ba[0]};

       }

        int mid = (low+high)/2;
        System.out.println("new mid = " + mid);

        Integer[] fsh = mergeSort(array,low,mid);
        System.out.println("fsh = " + Arrays.toString(fsh));
        Integer[] ssh = mergeSort(array,mid+1,high);
        System.out.println("ssh = " + Arrays.toString(ssh));
        Integer[] fsa = mergeTwoSortarray(fsh,ssh);
        System.out.println("fsa = " + Arrays.toString(fsa));
        return fsa;


    }

    private static Integer[] mergeTwoSortarray(Integer[] array1, Integer[] array2) {
        Integer[] resultarray = new Integer[array1.length+ array2.length];
        int arraypointer1 = 0;
        int arraypointer2 =0;
        int resultarraypointer =0;

        while(arraypointer1<array1.length && arraypointer2<array2.length) {
            if (array1[arraypointer1] > array2[arraypointer2]) {
                resultarray[resultarraypointer] = array2[arraypointer2];
                arraypointer2++;
                resultarraypointer++;

            }
            else
            {
                resultarray[resultarraypointer]= array1[arraypointer1];
                arraypointer1++;
                resultarraypointer++;
            }
            if(arraypointer1== array1.length)
            {
                while(arraypointer2<array2.length)
                {
                    resultarray[resultarraypointer] = array2[arraypointer2];
                    arraypointer2++;
                    resultarraypointer++ ;
                }
            }

            if(arraypointer2==array2.length)
            {
                while(arraypointer1<array1.length)
                {
                    resultarray[resultarraypointer]= array1[arraypointer1];
                    arraypointer1++;
                    resultarraypointer++;
                }
            }


        }
        return resultarray;


    }


}
