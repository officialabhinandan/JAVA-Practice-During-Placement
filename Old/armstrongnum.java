import java.util.Scanner;

class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // finding the digits of n
        int count=0, temp = num, mul, sum = 0, rem = 1;

        while(temp!=0){
            temp = temp/10;
            count++;    
        } 
        // finding armstrong number
        temp = num;
        while(temp!=0){
            rem  = temp%10;
            mul = 1;
            for(int i=0;i<count;i++){
                mul = mul*rem;
            }
            sum = sum+mul;
            temp = temp/10;

        }
        if(sum == num){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not a armstrong number");
        }
        

       sc.close();
    }

}