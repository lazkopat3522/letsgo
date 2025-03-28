
import java.util.Random;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Random rand = new Random();
        int num=rand.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Guessed number = "+num);
        int lottery=-20;
        while(num!=lottery)
        {
            lottery=sc.nextInt();
            if(num==lottery) {
                System.out.println("You winn");
                System.out.println("Bye bye");}
            if(num<lottery) {
                System.out.println("Your number is greater ");
            } else if(num>lottery) {
                System.out.println("Your number is less");
            }
        }







    }
}
