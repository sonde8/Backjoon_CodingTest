import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num2 = sc.nextInt();

        int arr[] = new int[num];

        for(int i=0;i<num;i++) {
          int num3 = sc.nextInt();

          arr[i] = num3;

          if (arr[i] < num2) {
            System.out.print(arr[i]+" ");
          }
        }
    }
}