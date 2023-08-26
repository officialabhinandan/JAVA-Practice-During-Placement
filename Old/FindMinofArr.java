import java.util.*;
class MinofArr{
    int findMinnum(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i])
             min = arr[i];
        }
        return min;
    }
    
}
class FindMinofArr{
    public static void main (String[] args) {
        //int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            //Before without taking input from user.
            System.out.println(arr[i]);
        }
        System.out.println("Enter "+n+" elements");
         for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
             //After taking inout from user.
            //System.out.println(arr[i]);
        }
        MinofArr obj = new MinofArr();
        System.out.println(obj.findMinnum(arr));
       sc.close();
    }
}