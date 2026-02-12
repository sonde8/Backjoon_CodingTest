import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();
        int count = 0;

        for(int i=0;i<num;i++) {
          count+=str.charAt(i) - '0';
        }
        
        System.out.println(count);
    }
}