
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUC DAT
 */
public class TongNso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();
        while(t > 0) {
            long n, sum;
            n = scanner.nextLong();
            long d = ((n-1)/1+1);
            sum = ((1+n) * d) / 2;
            System.out.println(sum);
            t--;
        }
    }
}
