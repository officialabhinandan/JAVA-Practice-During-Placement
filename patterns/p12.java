import java.util.*;

class Patrn12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ogn = n;
        int idx;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                idx = ogn - Math.min(Math.min(i,j), Math.min(n-i,n-j));
                System.out.print(idx+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

//imcomplete 