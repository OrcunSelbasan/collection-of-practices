package hackerrankSol;

import java.util.*;
import java.text.*;

public class Java_Currency_Formatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        Locale indiaLocale = new Locale("en","IN");
        
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat india= NumberFormat.getCurrencyInstance(indiaLocale);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}


