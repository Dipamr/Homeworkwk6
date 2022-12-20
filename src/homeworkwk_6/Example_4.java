package homeworkwk_6;
//4. Write a Java programme using the following steps.
public class Example_4 {
    int a = 15;    //instance variable
    int b = 18;     //instance variable
    static int c = 20;   //static variable
    static int d = 25;    //static variable
    public void print(){           //instant method
        System.out.println(a);
        System.out.println(b);
        System.out.println(Example_4.c);   //static variable in instance method
        System.out.println(Example_4.d);    //static variable in instance method

    }
     public static void m3(){            //static method
         System.out.println(c);        //static variable
         System.out.println(d);
         Example_4 object = new Example_4();   //object for instance variable


    }
    public static void main(String[] args)          //main method
    {

        System.out.println(Example_4.c);            //static method
        System.out.println(Example_4.d);
        Example_4 object = new Example_4();           //instance method
        object.print();
        m3();

    }





    }


