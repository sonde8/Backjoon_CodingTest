import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N+1];

        for(int index=0;index<M;index++) {
          int i = sc.nextInt();
          int j = sc.nextInt();
          int k = sc.nextInt();

          for(int index2=i;index2<=j;index2++) {
            arr[index2] = k;
          }
        }

        for (int index = 1; index <= N; index++) {
            System.out.print(arr[index] + " ");
        }

        sc.close();

    }
}