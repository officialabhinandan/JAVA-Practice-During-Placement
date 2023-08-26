/* 
Question:

Given Two binary numbers (in 0 and 1 ) in the form of string. Find out whether there is a possibility whether these numbers can become equal by rearranging their respective Os and 1s.

For ex: 101 and 011 can be arranged within themselves to become either 101 or 011.

Example 1:

3 >> length of input string

101 input string 1

011 ->input string 2

Output 1:

Yes
Example 2:

3 >> length of input string

001 input string 1

011 ->input string 2

Output 2:

No

*/
import java.util.*;

class nqt_prep{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        int n = sc.nextInt(); //length of input string -> given by user
        // int n2 = sc.nextInt(); //length of input string -> given by user
        

        int count1_1 = 0;
        int count1_2 = 0;
        int count0_1 = 0;
        int count0_2 = 0;

        for(int i=0;i<n;i++){
            if(str1.charAt(i) == '1'){
                count1_1++;
            } else {
                count0_1++;
            }
        }

        for(int i=0;i<n;i++){
            if(str2.charAt(i) == '1'){
                count1_2++;
            } else {
                count0_2++;
            }
        }

        if(count0_1==count0_2 && count1_1==count1_2){
            System.out.println("YES");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}