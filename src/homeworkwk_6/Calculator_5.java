package homeworkwk_6;
//5. Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
//methods.(Note: Two static and Two instance methods.)
public class Calculator_5 {  //class
    public void addition(int a, int b){      //instance method
        System.out.println(a+b);

    }
    public void subtraction(int a, int b){        //instance method
        System.out.println(a-b);
    }
    public static void multiplication (int c,int d){      //static method
        System.out.println(c*d);

    }
    public static void division( int c,int d){              //static method
        System.out.println(c/d);
    }

    public static void main(String[] args) {                   //main method
        Calculator_5 object =new Calculator_5();               //object created for instant method
        object.addition(10,15);                           //instance in main
        object.subtraction(10,20);                        //instance in main
        multiplication(15,12);                              //static in main
        division(15,12);                                    //static in main









    }
}
