/*** Created By nevil.panchal on 4/2/2021 year 2021 ***/
public class BinarySearch {


    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50,60,70,80,90,100};



        int l = 0;
        int h = arr.length-1;

        int data = 81;
while(l<=h) {
    int m =(l+h)/2;
    if (data > arr[m]) {
        l= m+1;

    } else if (data < arr[m]) {
        h=m-1;

    }else{
        System.out.println(m);
        return;
    }
}
System.out.print(-1);
    }
}
