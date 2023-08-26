import java.util.*;
class MaxofArr{
    int findMaxnum(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
             max = arr[i];
        }
        return max;
    }
    
}
class FindMaxofArr{
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
        MaxofArr obj = new MaxofArr();
        System.out.println(obj.findMaxnum(arr));
       
    }

}