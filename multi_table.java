import java.util.Scanner;

public class multi_table { // multiplication table
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=20;i++) {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}
