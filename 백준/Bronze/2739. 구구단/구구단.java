import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=1;i<=9;i++) {
          System.out.println(num + " * " + i + " = " + num*i);
        }

        sc.close();
    }
}