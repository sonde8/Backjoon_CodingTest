import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        int ascii = (int) ch;

        System.out.println(ascii);
    }
}