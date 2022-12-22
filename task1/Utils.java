package kz.attractor.java;

import java.util.Scanner;

public class Utils {
    public static int getNumber(int max, int min){
        print(String.format("Enter number(%s-%s): ", min, max));
        int number = new Scanner(System.in).nextInt();
        if(number >= min && number <= max){
            return number;
        }else return getNumber(max,min);

    }

    public static String getLine(){
        return  new Scanner(System.in).nextLine();
    }

    public static void print(String message){
        System.out.print(message);
    }
}
