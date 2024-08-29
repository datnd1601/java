
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUC DAT
 */
public class PhantichthuaSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t; t = scanner.nextInt();
        for(int i = 1; i <= t; i++) {
            long n; n = scanner.nextLong();
            System.out.print("Test "+i+": " );
            PttSNT(n);
            System.out.println("");
        }
    }
    public static void PttSNT(long n) {
        while(n != 1) {
            for(int i = 2; i <= n; i++) {
                int snt = i;
                int solan = 0;
                while(n % i == 0){
                    solan++;
                    n/=i;
                }
                if(solan > 0) System.out.print(snt+"("+solan+")"+" ");
            }
        }
    }
}
