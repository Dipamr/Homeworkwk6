package homeworkwk_6;
//1. Write a Java programme using the following steps.
public class Example_1 {    // class
    int a = 10;             //instance variable
    int b = 20;            //instance variable
    public  void print(){                // instance method
        System.out.println(a);
        System.out.println(b);
    }

        public static void main(String[] args)            //main method
        {
            Example_1 object = new Example_1();           //object create ,so give class name and create object
            object.print();                               //print object


        }
    }

