import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_21 {
    public static void main(String[] args) throws IOException {
        System.out.println("請輸入兩個整數");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        System.out.println(num1 + "與" + num2 + "中較大的是" + Math.max(num1, num2));
    }
}
