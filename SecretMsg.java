// # Secret Message
// You write all your passwords in a diary so that you don't forget them. But clearly this is too risky, 
// so you came up with a simple plan, you will simply write it by shifting all the alphabets by a certain step. 
// For eg: if you decide your step to be 3, then 'a' will become 'd', and 'k' will become 'n' and so for all alphabets.
// The last alphabets will simply circle back to 'a'. In this case, 'y' will become 'b' and so on. 
// Now you just have to remember the step size, can then you can check the password anytime you want. 
// You decided to write code to do this, now that you have learned coding in python. 
// Your code will take in the step size and what is written in the diary and give out the real password.
// ----------------------------------------------------------------------
// Input:  A list of two elements.

// The first element will be a string consisting of only alphabets which is taken from the diary and the second element will be the step size.

// Output: A string denoting the password
// ----------------------------------------------------------------------
// Sample input: ['letTc', 4]
// Sample output: hapPy

// Explanation:
// The password was 'hapPy'. Upon changing it by step of 4,
// h became l,
// a became e,
// p became t,
// P became T,
// y became y,
// and thus what was written in the diary was letTc 
// ----------------------------------------------------------------------
// Sample input: ['banana', 7]
// Sample output: utgtgt

import java.util.Scanner;

public class SecretMsg{

    public static String decode(String password, int step){
        String decode = "";
        char letter;
        int correct = 0;

        for(int i = 0; i < password.length(); i++){
            letter = password.charAt(i);


            if(letter - step < 97 && letter >= 97){
                correct = 123 - Math.abs( 97 - (letter - step));
                decode += (char)correct;
            }
            else if(letter - step < 65 && letter < 91){
                correct = 91 - Math.abs( 65 - (letter - step));
                decode += (char)correct;
            }
            else{
                correct = letter - step;
                decode += (char)correct;
            }
        }
        return  decode;
    }

    public static void main(String[] argh){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your  password: ");
        String password = sc.next();

        System.out.print("Enter your step: ");
        int step = sc.nextInt();
        
        System.out.println("Your decoded password: "+decode(password, step));

    }
}
// Enter your  password: banana
// Enter your step: 7
// Your decoded password: utgtgt
// Enter your  password: letTc  
// Enter your step: 4
// Your decoded password: hapPy
// Enter your  password: Hexe  
// Enter your step: 4
// Your decoded password: Data
// Enter your  password: wxyhCmrk 
// Enter your step: 4
// Your decoded password: studYing