package homeworkwk_6;
//8. Write a program to insert any temperature value in degree Fahrenheit and convert
//to degree Celsius ((F − 32) × 5/9 = 0°C).


public class Degree_8 {

        public static void main(String[] args) {        //main method
            float Fahrenheit,Celsius;
           Celsius  = 20;                             //value
           Fahrenheit= ((Celsius - 32)*9/5);
            System.out.println("Temprature in Celsius is:"+Fahrenheit);

        }
}
