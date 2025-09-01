//program to create mathematical tables by taking input from the file int.txt
import java.io.BufferedReader;
import java.io.FileReader;
public class J5{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("in1.txt"));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        br.close();

        for(int num=num1;num<=num2;num++){
            for(int i=1;i<=10;i++){
                System.out.println(num+" X "+i+" = "+(num*i));
            }
            System.out.println();
        }
    }
}
