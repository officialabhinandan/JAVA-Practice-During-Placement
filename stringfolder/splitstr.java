//package stringfolder;

import java.util.Scanner;
import java.util.StringTokenizer;

class Spltstr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i=1;
        StringTokenizer tkn = new StringTokenizer(str, " ");
        while(tkn.hasMoreTokens()){
            System.out.println("Token" + i + ": " + tkn.nextToken());
            i++;
        }
    }
}
