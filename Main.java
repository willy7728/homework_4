import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//         偶數相加
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int v1 = 0;
        for (int i = a; i <= b; i = i + 1) {
            if (i%2==0 && a<b) {
                v1 = v1 + i;
            }
        }
        System.out.println(v1);
    }
}
