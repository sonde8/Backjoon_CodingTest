import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        long total = sc.nextLong();
        long product = sc.nextLong();
        long result = 0;

        for(int i=0;i<product;i++) {
          long price = sc.nextLong();
          long count = sc.nextLong();

          result = result+(price*count);
        }

        if (result == total) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }

        sc.close();
    }
}