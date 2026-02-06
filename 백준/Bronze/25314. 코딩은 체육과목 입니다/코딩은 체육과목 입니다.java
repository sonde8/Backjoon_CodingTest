import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = num/4;

        String text = "";

        for(int i=0;i<count;i++) {
          text = text.concat("long ");
        }

        System.out.print(text + "int");

        sc.close();
    }
}