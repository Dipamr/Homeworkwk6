package homeworkwk_6;
//7. Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C).


public class Degree_7 {
    public static void main(String[] args) {        //main method
        float Fahrenheit,Celsius;
        Fahrenheit  = 50;                             //value
       Celsius = ((Fahrenheit - 32)*5/9);
        System.out.println("Temprature in celsius is:"+Celsius);

    }
}
