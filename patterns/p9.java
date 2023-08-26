import java.util.Scanner;

class Patrn9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i > n) {
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print("* ");
                }
                for (int s = 1; s <= 2 * (i - n); s++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= 2 * n - i; j++) {
                    System.out.print("* ");
                }

            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                for (int s = 1; s <= (2 * n) - (2 * i); s++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}