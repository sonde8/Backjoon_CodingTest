import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (100>=num && num>=90) {
          System.out.println("A");
        } else if (89>= num && num>=80) {
          System.out.println("B");
        } else if (79>= num && num>=70) {
          System.out.println("C");
        } else if (69>= num && num>=60) {
          System.out.println("D");
        } else {
          System.out.println("F");
        }

        sc.close();
    }
}