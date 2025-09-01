import java.util.Scanner;
public class J7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number :");
            int n1 = sc.nextInt();
            System.out.println("Enter the second number :");
            int n2 = sc.nextInt();

            int sum1=n1+n2;
            int dif1=n1-n2;
            int prd1=n1*n2;
            double div1=(double) n1/n2;
            
            System.out.println(sum1+" "+dif1+" "+prd1+" "+div1);
            sc.close();

    }
}
