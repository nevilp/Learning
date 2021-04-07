/*** Created By nevil.panchal on 4/4/2021 year 2021 ***/
public class PermtationCmbinationString {

    public static void main(String[] args) {

        String stringQuestion = "abc";

        printPermutatin(stringQuestion,"");

    }

    private static void printPermutatin(String str, String ansf) {
        if(str.length()==0)
        {
            System.out.println(ansf);
        }
        for(int i=0;i<str.length();i++)

        {
            char ch=str.charAt(i);
            String left  = str.substring(0,i);
            String right  = str.substring(i+1);
            String restofPart =left+right;
            printPermutatin(restofPart,ansf+ch);
        }


    }


}
