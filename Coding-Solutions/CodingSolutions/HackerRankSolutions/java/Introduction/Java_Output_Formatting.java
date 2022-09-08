package hackerrankSol;

import java.util.Scanner;

public class Java_Output_Formatting {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                if(x<10){
                    System.out.printf("%-14s 00%d",s1,x);
                    System.out.println();
                }else if(x>=10 && x<100){
                    System.out.printf("%-14s 0%d",s1,x);
                    System.out.println();
                }else{
                    System.out.printf("%-14s %d",s1,x);
                    System.out.println();
                }
            }   
            System.out.println("================================");

    }
}

