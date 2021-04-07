import java.util.ArrayList;
import java.util.List;

/*** Created By nevil.panchal on 4/2/2021 year 2021 ***/
public class testingrime {


    public static void main(String[] args) {
        boolean[] prime= new boolean[100];
        List<Integer> allvalueList = new ArrayList<Integer>();



        for(int i=1;i<=99;i++)
        {
          prime[i]=true;
          allvalueList.add(i);
        }
        findPrime(prime);
        findPrime(allvalueList);
    }

    private static void findPrime(List<Integer> allvalueList) {

        for(int i=1;i<=allvalueList.size()-1;i++)
        {
          int  count=0;
            for(int div=2;div*div<=allvalueList.get(i);div++)
            {
                  if(allvalueList.get(i)%div==0)
                  {
                    count++;
                    break;
                  }
            }
            if(count==0)
            {
                System.out.println(allvalueList.get(i) + " is prime number");
            }
            else{
                System.out.println(allvalueList.get(i) + " is Not prime number");
            }

        }



    }

    private static void findPrime(boolean[] prime) {

        for(int i=2;i<= prime.length/2;i++)
        {

           if(prime[i]=true)
           {
               for(int j=2*i;j<=prime.length-1;j=j+i)
               {
                   prime[j]=false;
               }
           }

        }
    }




}
