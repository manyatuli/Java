package Basics;

import java.util.Scanner;

public class TemperatureProgram {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the temperature in degree celcius: ");
        float celcius =  input.nextFloat();
        float fahrenheit = (celcius * 9/5) + 32;
        System.out.println("The temperature in fahrenheit is: "+fahrenheit+"F");
    }
}
