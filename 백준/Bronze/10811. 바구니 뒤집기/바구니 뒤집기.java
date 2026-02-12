import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N+1];

        for(int i=1;i<=N;i++) {
          arr[i] = i;
        }

        for(int i=0;i<M;i++) {
          int num = sc.nextInt();
          int num2 = sc.nextInt();

          while (num < num2) {
            int temp = arr[num];
            arr[num] = arr[num2];
            arr[num2] = temp;
            num++;
            num2--;
          }
        }

        for(int i=1;i<=N;i++) {
          System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}