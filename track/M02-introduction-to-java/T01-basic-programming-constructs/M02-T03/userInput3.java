import java.util.Scanner;

public class userInput3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String :");
        char ch = scan.next().charAt(2);
        System.out.println(ch);
        scan.close();
    }
}