import java.util.Scanner;


class Peterson {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

    int temp = num, rem, mul, sum=0;
    while(temp!=0){
      rem = temp%10;
      mul= 1;
      for(int i=1;i<=rem;i++){
        mul = mul*i;
      }
      sum = sum + mul;
      temp = temp/10;


    }
    if(sum == num){
        System.out.println("Perterson/Krishnamurty number");
    } else {
        System.out.println("Not a peterson/krisnamurty number");
    }

sc.close();

    }
    
}
