
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUC DAT
 */
public class SoFibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t; t = scanner.nextInt();
        long[] fib = new long[95];
        Fib(fib);
        while(t > 0) {
            long x; x = scanner.nextLong();
            String s = (checkfib(x, fib) == 1) ? "YES" : "NO";
            System.out.println(s);
            t--;
        }
    }
    public static void Fib(long[] fib) {
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 1;
        for(int i = 3; i <= 93; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
    }
    public static int checkfib(long n, long[] fib) {
        for(int i = 0; i <= 93; i++){
            if(n == fib[i]) return 1;
        }
        return 0;
    }
}
