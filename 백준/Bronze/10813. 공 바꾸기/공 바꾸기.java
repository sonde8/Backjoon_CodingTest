import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];

        for(int num=0;num<N;num++) {
          arr[num] = num+1;
        }

        for(int index=0;index<M;index++) {
          int i = sc.nextInt();
          int j = sc.nextInt();

          int temp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j - 1] = temp;
        }

        for (int index=0;index<N; index++) {
            System.out.print(arr[index] + " ");
        }
    }
}