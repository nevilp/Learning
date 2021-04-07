/*** Created By nevil.panchal on 4/3/2021 year 2021 ***/
public class longestSubbarrayKadanes {


    public static void main(String[] args) {
        int[] array= {3, 4, 5, 6, -4, -5, 8, 15, 30, -20, 12, 30, 2, -40, -2, 1};
        int currentSum =  array[0];
        int BestSum = array[0];

        for(int i=1;i< array.length;i++)
        {
            if(currentSum>0)
            {
                currentSum=currentSum+array[i];

            }else{
                currentSum = array[i];
            }
            if(BestSum<currentSum)
            {
                BestSum =currentSum;
            }


        }

        System.out.println(BestSum);


    }

}
