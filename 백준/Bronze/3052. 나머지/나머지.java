import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        boolean arr[] = new boolean[42];
        int count = 0;

        for(int i=0;i<10;i++) {
          int num = sc.nextInt() % 42;
          arr[num] = true;
        }

        for(int i=0;i<42;i++) {
          if (arr[i]) count++;
        }

        System.out.println(count);
        sc.close();
    }
}