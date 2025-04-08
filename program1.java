import java.util.Scanner;
//WAP to check prime number 
class program1{
    public static void main(String args[]){
        int n,count=0;
        System.out.print("Enter any Number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(n==2)
        System.out.print("Prime Number ");
        else
        System.err.print("Not Prime Number");
    }
}