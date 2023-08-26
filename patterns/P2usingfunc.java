import java.util.Scanner;
class Patrn2A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        pattern(num);
        sc.close();
       

    }
     static void pattern(int n){
       
        

        for(int row=0; row<n; row++){
            for(int col=0; col<row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
      

    }
}
