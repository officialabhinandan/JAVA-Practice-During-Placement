import java.util.Scanner;

class Patrn3{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int row=0;row<n;row++){               //for(int row=1;row<=n;row++)     
        for(int col=n-row;col>0;col--){       //for(int col=n-row+1;col>=0;col--)    formulae: n-r/n-r+1 
            System.out.print("* ");
        }
        System.out.println();
    }
    sc.close();
    }
}
