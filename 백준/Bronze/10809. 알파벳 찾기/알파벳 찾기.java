import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        StringBuilder sb = new StringBuilder();

        for(char c='a';c<='z';c++) {
          int result = S.indexOf(c);
          sb.append(result).append(" ");
        }

        System.out.print(sb);
    }
}