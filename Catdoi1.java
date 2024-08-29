
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUC DAT
 */
public class Catdoi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t; t = scanner.nextInt();
        while(t > 0) {
            String s;
            long op = 0, check = 0;
            s = scanner.next();
          //  System.out.println(s);
            for(int i = 0; i < s.length(); i++) {
              char c = s.charAt(i);
              long x = c-48;
               // System.out.println(x);
              if(x == 8 || x == 0 || x == 9) {
                  op = op*10 ;
              }else if(x == 1) {
                  op = op*10 + 1;
              }else{
                  check = 1;
                  break;
              }
            }
            if(check == 1 || op == 0){
                System.out.println("INVALID");
            }else {
                System.out.println(op);
            }
            t--;
        }
    }
}
