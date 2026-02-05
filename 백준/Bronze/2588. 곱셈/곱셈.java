import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1 * (num2%10));
        System.out.println(num1 * ((num2%100)/10));
        System.out.println(num1 * (num2/100));
        System.out.println(num1 * num2);

        sc.close();
    }
}