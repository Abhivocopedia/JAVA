//Program to create mathematical tables using the input given by the user
import java.util.Scanner;
public class J4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
            int num1=sc.nextInt();
        System.out.println("Enter the second number :");
            int num2=sc.nextInt();
            System.out.println();
        for(int num=num1;num<=num2;num++){
            for(int i=1;i<=10;i++){
                System.out.println(num+"X"+i+"="+(num*i));
            }
            System.out.println();
        }

        sc.close();

    }
}
