/*** Created By nevil.panchal on 4/7/2021 year 2021 ***/
public class SingletonPattern {

    public static void main(String[] args) {

        ABC abc1 = ABC.getInstance();


    }


    public static class ABC{
      static  ABC obj;
   public static ABC getInstance(){
       if(obj==null) {
           synchronized (ABC.class)
           {
           if(obj==null) {
               obj = new ABC();
           }
           }
       }
       return obj;
   }

     private   ABC(){
         System.out.println("I have printed");

     }



    }


}
