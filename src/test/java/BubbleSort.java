import java.util.Arrays;

/*** Created By nevil.panchal on 4/3/2021 year 2021 ***/
public class BubbleSort {


    public static void main(String[] args) {

      Integer[]  array = {8,5,4,1,3,9,6};

      for(int itr=0;itr<=array.length-1;itr++)
      {
          for(int j=0;j<array.length-1-itr;j++)
          {
              System.out.println("itr=" + itr + " j=" + j);
              if(isSmaller(array,j,j+1))
              {
                  swap(array,j,j+1);
              }
          }
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
