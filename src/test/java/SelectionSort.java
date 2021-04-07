import java.util.Arrays;

/*** Created By nevil.panchal on 4/3/2021 year 2021 ***/
public class SelectionSort {


    public static void main(String[] args) {
        Integer[]  array = {8,5,4,1,3,9,6};

        for(int i=0;i< array.length;i++)
        {
          int  min=i;
          for(int j=i+1;j< array.length;j++)

          {
              System.out.println("i=" + i + " j=" + j);
              if(isSmaller(array,min,j))
              {
                  min=j;
                  System.out.println("new min "+ min);
              }
          }
       swap(array,i,min);
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));


    }

    static  boolean  isSmaller(Integer[] array ,Integer index1, Integer index2)
    {
        if(array[index2]<array[index1])
        {
            System.out.println(array[index2] + " is smaller than" + array[index1]);
            return true;
        }
        return false;

    }

    static public void swap(Integer[] array,Integer index1,Integer index2)
    {
        System.out.println("swapping " + array[index1] + " with" + array[index2]);
        int temp = array[index1];
        array[index1]= array[index2];
        array[index2] = temp;




    }


}
