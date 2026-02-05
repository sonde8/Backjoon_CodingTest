import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int result = year - 543;

        System.out.println(result);
    }
}