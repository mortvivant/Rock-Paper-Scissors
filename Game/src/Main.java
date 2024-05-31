import java.util.Scanner;
import java.security.SecureRandom;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        rockPaperScissors.start(keyb,rand);
    }
}