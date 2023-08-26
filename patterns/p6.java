import java.util.Scanner;

class Patrn6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= 2 * n; row++) {

            if (row > n) {
                for (int sp = 1; sp <=row-n; sp++)
                    System.out.print("  ");

                for (int col = 1; col <= 2 * n - row; col++) // space after nth row = row-n; stars after nth row
                                                             // n-row+n=2n-row

                    System.out.print("* ");

            } else {
                for (int sp = 1; sp <=n-row; sp++)
                    System.out.print("  ");

                for (int col = 1; col <= row; col++)

                    System.out.print("* ");

            }
            System.out.println();
        }
        sc.close();
    }
}
