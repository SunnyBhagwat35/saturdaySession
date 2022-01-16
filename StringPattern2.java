import java.util.Scanner;

public class StringPattern2 {

    public static void ValidateIdWith12Chars(String str){
        int flag = 0;
        if(str.length() == 15){
            String[] s = str.split("_", 5);
            main:
            for(String i: s){
                if(i.length()==3){
                    for(int j=0; j < i.length(); j++){
                        int a = i.charAt(j);
                        if(a >= 48 && a <= 57 || a >=65 && a <=90 || a >=97 && a <=122){
                            flag = 1;
                        }
                        else{
                            flag = 0;
                            break main;
                        }
                    }
                }
                else{
                    flag = 0;
                    break main;

                }
            }
        }
        else{
            flag = 0;
        }
        if(flag == 1){
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            ValidateIdWith12Chars(str);
        }
    }
}
/*
ADI_239_Sep_B37
valid
aBc3E_Xy58e_123De
invalid
@aBc3E_Xy5_12e
invalid
A@I_239_Sep_B37
invalid
SUN_271_Nov_100
valid
*/
