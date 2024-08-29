
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUC DAT
 */
public class USchiahet2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t; t = scanner.nextInt();
        while(t > 0) {
            int n; n = scanner.nextInt();
            System.out.println(chiahet2(n));
            t--;
        }
    }
    public static int chiahet2(int n) {
        int op = 0;
        if(n < 2) return 0;
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i % 2 == 0) op++;
                if(n/i % 2 == 0 && n/i != i) op++;
            }
        }
        return op;
    }
}
