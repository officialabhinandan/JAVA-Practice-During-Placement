
// Online IDE - Code Editor, Compiler, Interpreter
// Access the code onlien here - https://www.online-ide.com/ZQ09yvTLSO

class Main
{
    public static void main(String[] args) {
        System.out.println("Welcome to Online IDE!! Happy Coding :)");
        int arr[] = {1, 2, 3, 4, 5};
        subArr(arr);
    }
    static void printSubArr(int arr[], int si, int ei){
        for(int i=si; i<=ei; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void subArr(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                // for(int k=i; k<=j;k++){
                //     System.out.print(arr[k] + " ");
                // }
                printSubArr(arr, i, j);  // same o/p just using an function to print the array.
                count++;
                System.out.println();
            }
        }
        System.out.println("Total number of subset = " + count);
    } 
}
