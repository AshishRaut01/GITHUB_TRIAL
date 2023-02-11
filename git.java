import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int user_num = sc.nextInt();
        int given_num = 10;
        System.out.println(user_num > given_num);
    }
}
