
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUC DAT
 */
public class USC_BSC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t; t = scanner.nextInt();
        while(t > 0) {
            long a, b;
            a = scanner.nextLong();
            b = scanner.nextLong();
            System.out.println(a*b/USC(a,b)+" " +USC(a, b));
            t--;
        }
    }
    public static long USC(long a, long b) {
        long r = a%b;
        while(r != 0){
       //    System.out.println(a+" "+b+" "+r);
            r = a%b;  
            a = b;
            b = r;
        }
        return a;  
    }
}
