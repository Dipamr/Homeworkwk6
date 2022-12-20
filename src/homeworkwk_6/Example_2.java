package homeworkwk_6;
//2. Write a Java programme using the following steps.
public class Example_2 {     //class
    static int a = 25;          //static variable
    static int b = 30;          //static variable

    static void m1() {          //   static method
        System.out.println(a);
        System.out.println(b);

    }

    public static void main(String[] args)      //main method
    {
       m1();                               //static method
        Example_2.m1();                    //static method via class name

    }




}
