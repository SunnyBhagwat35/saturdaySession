import java.util.*;
import java.io.*;


class Loops2{
        
    static void loop2(int a, int b, int n){
        int sumup = a;
        for(int i=0; i < n; i++){
            int next = (int)Math.pow(2, i)*b;
            sumup = sumup + next;
            System.out.print(sumup+" ");
        }
        System.out.println();
    }
        
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            loop2(a,b,n);
        }
        in.close();

    }
}
