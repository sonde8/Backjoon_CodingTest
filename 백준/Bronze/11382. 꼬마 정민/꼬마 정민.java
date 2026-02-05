import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long num3 = sc.nextLong();

        System.out.println(num1 + num2 + num3);

        sc.close();
    }
}