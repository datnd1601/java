
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUC DAT
 */
public class ChiaTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t; t = scanner.nextInt();
        while(t > 0) {
            double n, h;
            n = scanner.nextDouble();
            h = scanner.nextDouble();
            chiatg(n, h);
            System.out.println("");
            t--;
        }
    }
    public static void chiatg(double n, double h) {
        int i = 1;
        while(i < n) {
            System.out.printf("%.6f", Math.sqrt((i/n)*h*h));
            System.out.print(" ");
            i++;
        }
    }
}
