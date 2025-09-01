//program to take input from a file where numbers will be in the form of string and we must split it to list
import java.io.BufferedReader;
import java.io.FileReader;
public class J6 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("in2.txt"));
        String Line = br.readLine();
        br.close();
        String[] parts = Line.split(",");

        int num1 = Integer.parseInt(parts[0].trim());
        int num2 = Integer.parseInt(parts[1].trim());

        for(int num=num1;num<=num2;num++){
            for(int i=1;i<=10;i++){
                System.out.println(num+" X "+i+" = "+(num*i));
            }
            System.out.println();
        }
    }
}
