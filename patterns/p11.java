import java.util.Scanner;

class Patrn11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n; i++) {
            if (i > n) {
                for (int j = 1; j <=i-n; j++) {
                    System.out.print("  ");
                }
                for (int k = 2*n-i; k >= 1; k--) {
                    System.out.print(k + " ");
                }
                for (int k = 2; k <= 2*n-i; k++) {
                    System.out.print(k + " ");
                }


            } else {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (int k = i; k >= 1; k--) {
                    System.out.print(k + " ");
                }
                for (int k = 2; k <= i; k++) {
                    System.out.print(k + " ");
                }
            }

            System.out.println();
        }
        sc.close();
    }
}