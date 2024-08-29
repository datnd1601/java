
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUC DAT
 */
public class Phuongtrinhbac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        if(a == 0 && b != 0) {
            System.out.println("VN");
        }else if(a == 0 && b == 0) {
            System.out.println("VSN");
        }else {
            System.out.printf("%.2f", -b/a);
        }
    }
}
