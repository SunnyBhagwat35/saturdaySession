import java.util.Scanner;

public class StringPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int flag = 0;
        // System.out.println(str.length());
        if(str.length() == 15){
            String[] s = str.split("_", 5);
            main:
            for(String i: s){
                // System.out.println(i);
                if(i.length()==3){
                    for(int j=0; j < i.length(); j++){
                        int a = i.charAt(j);
                        if(a >= 48 && a <= 57 || a >=65 && a <=90 || a >=97 && a <=122){
                            flag = 1;
                        }
                        else{
                            // System.out.println(1);
                            flag = 0;
                            break main;
                        }
                    }
                }
                else{
                    // System.out.println(2);
                    flag = 0;
                    break main;

                }
            }
        }
        else{
            // System.out.println(3);
            flag = 0;
        }
        if(flag == 1){
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }
    }
}


// '''
// A student can choose a student ID. Only conditions are 
// - It should have groups of three characters separated by "_".
// - Can only contain numbers 0-9 and characters a-z and A-Z.(other than "_")
// - Contains 12 characters excluding the "_"

// Write a program to check for valid student IDs.
// The input will have a student ID and 
// The output should say "valid" if the entered ID is valid otherwise it should say "invalid".

// Sample Input:
// ADI_239_Sep_B37

// Sample Output:
// valid
// '''