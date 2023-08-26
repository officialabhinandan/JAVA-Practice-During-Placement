/* Weight of String: Write a function that takes a string as input and calculates the weight of the string as per rules mentioned below.

For calculating the weight of the string,
Weight of all alphabetic characters that appear in the string should be added
Weight of vowels that appear in the string should either be ignored OR added depending upon a specified option
All non-alphabetic characters in the string should be ignored
Weight of each letter is its position in the English alphabet system, i.e. weight of a=1, weight of b=2, weight of c=3, weight of d=4, and so on….weight of y=25, weight of z=26.
Weight of Upper-Case and Lower-Case letters should be taken as the same, i.e. weight of A=a=1, weight of B=b=2, weight of C=c=3, and so on…weight of Z=z=26.
Example1:
Let us assume the word is Hello World!! and vowels are to be ignored.
Weight of Hello World!! = 8+0+12+12+0+0+23+0+18+12+4+0+0 = 89
Note: Note that weight of vowels is ignored. Also note that the weight of non-alphabetic characters such as space character and ! is taken as zero.
Example2:
Let us assume the word is Hello World and vowels are to be included.
Weight of Hello World!! = 8+5+12+12+15+0+23+15+18+12+4+0+0 = 124
Note: Note that weight of vowels is included. Also note that the weight of non-alphabetic characters such as space character and ! is taken as zero.
The function will accept two input parameters  input1 and input2, 
where,
input1 represents the string whose weight needs to be calculated, and,
input2 represents the option specifying whether or not the weight of vowels should be included.
If input2 is 0, vowels that appear in the string should be ignored.
If input2 is 1, weight of vowels that appear in the string should also be added.
The function is expected to calculate and return the weight of the string.
Example1:
input1 = Hello World
input2 = 0
output1 = 89
Example2:
input1 = Hello World
input2 = 1
output1 = 124
Example3:
input1 = "All Zebras are Black & White!!"
input2 = 0
output1 = 186​
Example4:
input1 = "All Zebras are Black & White!!"
input2 = 1
output1 = 214 
*/

//code:-

import java.util.*;

class Wipro_practice1 {
    public static void getWeightofString(String str1, int input1) {
        int weight = 0;

        str1 = str1.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {

            if (input1 == 0) {

                if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'
                        || str1.charAt(i) == 'u' || !Character.isLetter(str1.charAt(i))) {
                    continue;
                }
                // else if (str1.charAt(i)>= 97 && str1.charAt(i)<= 122){
                // weight += (str1.charAt(i)-96);
                // }
            }

            else {
                int a = str1.charAt(i) - 96;
                  weight += a;
            }
            

        }
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        int input1 = sc.nextInt();

        getWeightofString(str1, input1);
        System.out.println("Process finished");

    }
}