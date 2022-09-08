package hackerrankSol;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Java_If_Else {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	Java_If_Else run=new Java_If_Else();
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println(run.task(N));
        scanner.close();
    }
    public String task(int N){
        if(N%2==1){
            return "Weird";
        } else if(N%2==0){
            if(N>=6 && N<=20){
                return "Weird";
            }else{
                return "Not Weird";
            }
        }  else{
            return "None";
        } 
    }
}


