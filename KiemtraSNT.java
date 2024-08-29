
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUC DAT
 */
public class KiemtraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();
        while(t > 0) {
            long n;
            n = scanner.nextLong();
//            if(checknt(n) == 1){
//                System.out.println("YES");
//            }else{
//                System.out.println("NO");
//            }
            String  s = (checknt(n) == 1) ? "YES" :"NO";
            System.out.println(s);
            t--;
        }
    }
    public static int checknt(long n) {
        if(n < 2) return 0;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return 0;
        }
        return 1;
    }
}
