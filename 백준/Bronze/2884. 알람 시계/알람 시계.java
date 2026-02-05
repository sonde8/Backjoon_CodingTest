import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (23>=H && H>=0 && 59>=M && M>=45) {
          System.out.println(H + " " + (M-45));
        } else if (23>=H && H>0 && 45>M) {
          System.out.println((H-1) + " " + (M+15));
        } else if (0>=H && 45>M) {
          System.out.println((24-(H+1)) + " " + (M+15));
        }

        sc.close();
    }
}