
import java.util.Scanner;


public class TongUS {
    static long[] snt= new long[2000002];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t; t = scanner.nextInt();
        long sum = 0;
        sangnt();
        while(t > 0) {
            int n; n = scanner.nextInt();
           // System.out.println(Sum(n));
           if(snt[n] == 1) sum += n;
           else sum += Sum(n);
           t--;
        }
        System.out.println(sum);
    }
    public static int Sum(int n) {
        int op = 0;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            while(n % i == 0) {
                op += i;
                n /= i;
            }
        }
        if(n > 1) op += n;
        return op;
    }
//    public static int checknt(long n) {
//        if(n < 2) return 0;
//        for(int i = 2; i <= Math.sqrt(n); i++) {
//            if(n % i == 0) return 0;
//        }
//        return 1;
//    }
    public static void sangnt() {
        for(int i = 0; i < 2000001; i++) {
            snt[i] = 1;
        }
        snt[0] = 0; snt[1] = 0;
        for(int i = 2; i < Math.sqrt(2000001); i++) {
            if(snt[i] == 1) {
                for(int j = i*i; j < 2000001; j+=i) {
                    snt[j] = 0;
                }
            }
        }
//        for(int i = 0; i < 2000001; i++) {
//            if(snt[i] == 1) System.out.println(i+" ");
//        }
    }
}
