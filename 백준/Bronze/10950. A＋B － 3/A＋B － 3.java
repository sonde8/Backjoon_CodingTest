import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for(int i=1;i<=count;i++) {
          int num = sc.nextInt();
          int num2 = sc.nextInt();
          System.out.println(num+num2);
        }
        sc.close();
    }
}