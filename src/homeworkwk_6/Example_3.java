package homeworkwk_6;
//3. Write a Java programme using the following steps.


public class Example_3 {       //class
    int c = 12;              //instance variable
    static int b = 15;       //static variable
    public void print(){         //instance method
        System.out.println(c);
        System.out.println(Example_3.b);    //instance and static variable into method
    }
    public static void m2()                  //static method
    {
        System.out.println(b);                 //static variable
        Example_3 object = new Example_3();       //instance with object
    }

    public static void main(String[] args) {  //main method
        Example_3 object = new Example_3();   //instance
        object.print();
        m2();                                  //static
        Example_3.m2();                         //static with class name
    }
}
