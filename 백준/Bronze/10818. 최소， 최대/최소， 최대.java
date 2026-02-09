import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextLong();
        long arr[] = new long[(int)num1];
        long min = 1000000;
        long max = -1000000;

        for(long i=0;i<num1;i++) {
          arr[(int)i] = sc.nextLong();
          if (arr[(int)i] < min) {
            min = arr[(int)i];
          }

          if (arr[(int)i] > max) {
            max = arr[(int)i];
          }
        }

        sc.close();
        
        System.out.print(min + " " + max);
    }
}