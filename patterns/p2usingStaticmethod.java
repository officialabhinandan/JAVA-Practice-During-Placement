// By using multiple class but with static method- by caling static method classname.methodname(variablename)

import java.util.Scanner;
class CA{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //CB obj = new CB();
        //obj.pattern(n);
        CB.pattern(n);
        sc.close();
       

    }
}
class CB{
     static void pattern(int n){
       
        

        for(int row=0; row<n; row++){
            for(int col=0; col<row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
      

    }
}

