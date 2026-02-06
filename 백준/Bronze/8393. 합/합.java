import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0;

        for(int i=1;i<=num;i++) {
          result = result+=i;
        }

        System.out.println(result);

        sc.close();
    }
}