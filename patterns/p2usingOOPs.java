// By making multiple classes and using the concept of object creation in OOPs.



import java.util.Scanner;
class Patrn2B{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        patrn2C obj = new patrn2C();
        obj.pattern(n);
        sc.close();
       

    }
}
class patrn2C{
     void pattern(int n){
       
        

        for(int row=0; row<n; row++){
            for(int col=0; col<row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
      

    }
}


