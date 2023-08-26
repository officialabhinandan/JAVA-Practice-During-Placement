package LatestProg;

public class maxSubArrSum {
    public static void main(String args[]) {
        int num[] = { 1, 2, -3, 4, 5 };
        // int num2[] = {2, 4, 6, 8, 10};
        printTotalPairs(num);
        printSubArrs(num);
        calculateMaxSubArrSum1(num);
        calculateMaxSubArrSum2(num);
        calculateMaxSubArrSum3(num);

    }

    // to print the total pairs present in the arrays
    public static void printTotalPairs(int ar[]) {
        int tp = 0; // tp = total number of pairs
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                System.out.print("(" + ar[i] + "," + ar[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total sub arrays: " + tp);
    }

    // To print all the sub arrays.
    public static void printSubArrs(int arr[]) {
        int tsa = 0; // tsa = total number of sub arrays
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                tsa++;
                System.out.println();
            }
        }
        System.out.println("Total sub arrays: " + tsa);
    }

    // To print the maximum sub array sum (using brute force method). Time
    // Complexity O(n^3);
    public static void calculateMaxSubArrSum1(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum = currSum + arr[k]; // currSum += arr[k];
                }
                System.out.print(currSum + " ");
                maxSum = Math.max(maxSum, currSum); // we can also use if(currSum>maxSum){ maxSum = currSum; }
                System.out.println();
            }
        }
        System.out.println("Total sub array sum using brute force method is: " + maxSum);

    }

    // To print the sub arrays (using prefix sum array method). Time Complexity
    // O(n^2);
    public static void calculateMaxSubArrSum2(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        // declaring the prefix array
        int[] prefix = new int[arr.length];

        // calculate the prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // if (i == 0) {
                // currSum = prefix[j];
                // } else {
                // currSum = prefix[j] - prefix[i - 1];
                // }
                // or
                currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("Total sub array sum using prefix sum array method is: " + maxSum);

    }

    // To print the sub arrays (Kadane's algorithm). Time Complexity
    // O(n);
    public static void calculateMaxSubArrSum3(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Total sub array sum using Kadane's algorithm is: " + maxSum);
    }

}
