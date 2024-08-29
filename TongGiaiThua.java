
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUC DAT
 */
public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n; n = scanner.nextLong();
        long sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += giaithua(i);
        }
        System.out.println(sum);
    }
    public static long giaithua(long n) {
        if(n==0) return 1;
        long op=1;
        for(int i = 1; i <= n; i++) {
            op *= i;
        }
        return op;
    }
}
