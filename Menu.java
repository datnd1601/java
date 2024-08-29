
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUC DAT
 */
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        menu();
        while(n != 6) {  
            n = scanner.nextInt();
        switch(n) {
            case 1:
                String s = scanner.nextLine();
                System.out.println(" Nhập họ và tên:");
                
                System.out.println("Họ và tên: " + s);
                break;
            case 2:
                System.out.println("Nhập giới tính");
                String z = scanner.nextLine();
                System.out.println("Giới tính: " + z);
                break;
            case 3:
                System.out.println("Nhập tuổi");
                String e = scanner.nextLine();
                System.out.println("Tuổi: " +e);
                break;
            case 4:
                System.out.println("Nhập điểm hướng đối tượng");
                 String w = scanner.nextLine();
                 System.out.println("Điểm hướng đối tượng: " +w);
                 break;
            default:
                menu();
        }
        }
    }
    public static void menu() {
        System.out.println("==============================");
        System.out.println("Vui lòng chọn chức năng");
        System.out.println("1. Nhập họ và tên");
        System.out.println("2. Nhập giới tính");
        System.out.println("3. Nhập tuổi");
        System.out.println("4. Nhập điểm hướng đối tượng");
        System.out.println("5. Quay lại menu");
        System.out.println("6. Thoát");
        System.out.println("==============================");
    }
}
