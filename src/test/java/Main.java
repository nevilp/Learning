/*** Created By nevil.panchal on 3/29/2021 year 2021 ***/
import java.util.*;


class Main {
    public static void main(String args[] ) throws Exception {
        // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = "ABBcc";


        generateNewString(name);





    }

    private static void generateNewString(String inputString) {

        for(int i=0;i<=inputString.length()-1;i++)
        {
          for(int j=0;j<=i;j++) {
              System.out.print(inputString.charAt(i));
          }

        }

        //Write your code here to print new generated string


    }

}

