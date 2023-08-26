
/*
 * countVowels: This function will take as input a string and find the frequency
 * of occurrence each vowel in the string and return as a dictionary having
 * :frequency of occurrence as the key:value pair . In case no vowels found in
 * the input string , return None.
 * 
 * Note:
 * 1. The search should be case insensitive. That is O and o will be considered
 * as o.
 * 2. In the dictionary , vowels should be considered in the lower case.
 * 
 * Define the main section for the following:
 * 
 * 1. Read a string to be passed as argument to the method countVowels
 * 
 * 2. Call the function countVowels by passing the string read in point #1 as
 * argument.
 * 
 * 3. Print the dictionary returned by the function countVowels . If the
 * function returns None , print No vowels found. Excluding the quotes.
 * 
 * 
 * 
 * You can use/refer to the below sample input and output to verify your
 * solution using Test against Custom input option.
 * Check the sample input and output below.
 * 
 * Sample Input 1:
 * For example, if the input string is “Good Morning All “, then the input
 * should be read/given as follows:
 * Good Morning All
 * 
 * And the output for the above set of input will be:
 * 
 * {'o': 3, 'i': 1, 'a': 1}
 * 
 * Sample Input 2:
 * SWQRTY PLKJHG
 * 
 * And the output for the above set of input will be
 * 
 * No vowels found.
 * 
 * 
 */

import java.util.*;

class tcs_practice1 {
    public static void countVowels(String str) {

        int  acount = 0;
        int ecount = 0;
        int icount = 0;
        int ocount = 0;
        int ucount = 0;


        str=str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                acount++;
            }
            if (str.charAt(i) == 'e') {
                ecount++;
            }
            if (str.charAt(i) == 'i') {
                icount++;
            }
            if (str.charAt(i) == 'o') {
                ocount++;
            }
            if (str.charAt(i) == 'u') {
                ucount++;
            }
        }
if(acount==0&&ecount==0&&icount==0&&ocount==0&&ucount==0)
{
System.out.println("No vowels found");
}
else
{

        System.out.println("a: " + acount + " e: " + ecount + " i: " + icount + " o: " + ocount + " u: " + ucount);
}    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        countVowels(str);


    }

   
    
}