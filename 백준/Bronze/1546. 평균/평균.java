import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int score[] = new int[N];

        long max = 0;
        long sum = 0;

        for(int i=0;i<N;i++) {
          score[i] = sc.nextInt();
        }

        for(int i=0;i<score.length;i++) {
          if (score[i] >= max) {
            max = score[i];
          }
        }

        for(int i=0;i<N;i++) {
          sum += score[i];
        }

        System.out.print((sum * 100.0) / max / N);

        sc.close();
    }
}