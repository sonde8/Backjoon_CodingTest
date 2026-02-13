import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
      Scanner sc = new Scanner(System.in);

      String A = sc.next();
      String B = sc.next();

      int Ra = Integer.parseInt(new StringBuilder(A).reverse().toString());
      int Rb = Integer.parseInt(new StringBuilder(B).reverse().toString());

      System.out.print(Ra > Rb ? Ra : Rb);
    }
}