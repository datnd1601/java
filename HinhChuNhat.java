
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUC DAT
 */
public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a, b;
        a = scanner.nextLong();
        b = scanner.nextLong();
        if(a <= 0 || b <= 0) {
            System.out.println("0");
        }else {
            System.out.println((a+b)*2 + " " + a*b);
        }
    }
}
