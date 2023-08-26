// Wap to print the number of special characters except alphabets and numbers in a string given by user. Also print the characters as well. 

import java.util.*;

class Practice1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')
                    || (str.charAt(i) >= '0') && (str.charAt(i) <= '9')) {
                continue;
            } else {
                count++;
                System.out.println(str.charAt(i));

            }

        }

        System.out.println(count);
    }
}
