package homeworkwk_6;
//15. Write a Java program to swap two variables.


public class Swap {
    public static void main(String[] args) {               //main method
        int a=5;        //local variable
        int b=7;      //local variable
        int t;       //using third variable
        t=a;
        a=b;
        b=t;        // variable to take value for swap
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        // second method without using third variable
       // a=a+b;
       // b=a-b;
       // a=a-b;
       // System.out.println("a:"+a);
       // System.out.println("b:"+b);


    }
}
