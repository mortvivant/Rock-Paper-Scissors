import java.util.Scanner;
import java.security.SecureRandom;

public class rockPaperScissors {
    protected static String[] part = {"Rock","Paper","Scissors"};
    private static int you = 0;
    private static int pc = 0;

    public static void start(Scanner s,SecureRandom r){
        while (you != 3 && pc != 3 ){
            System.out.println(you+":"+pc);
            System.out.printf("Make guess:");
            String choice = s.next();
            String bot = part[r.nextInt(3)];
            if (choice.equalsIgnoreCase(part[0])){
                if(bot.equalsIgnoreCase(part[0])){
                    System.out.println("Draw");
                    System.out.printf("You: " + choice + "\nPC: " + bot +"\n");
                } else if (bot.equalsIgnoreCase(part[1])){
                    System.out.println("PC WON");
                    System.out.printf("You: " + choice + "\nPC: " + bot+"\n");
                    pc++;
                } else if (bot.equalsIgnoreCase(part[2])) {
                    System.out.println("You WON");
                    System.out.printf("You: " + choice + "\nPC: " + bot+"\n");
                    you++;
                }
            } else if (choice.equalsIgnoreCase(part[1])) {
                if(bot.equalsIgnoreCase(part[0])){
                    System.out.println("You WON");
                    System.out.printf("You: " + choice + "\nPC: " + bot+"\n");
                    you++;
                } else if (bot.equalsIgnoreCase(part[1])){
                    System.out.println("Draw");
                    System.out.printf("You: " + choice + "\nPC: " + bot+"\n");
                } else if (bot.equalsIgnoreCase(part[2])) {
                    System.out.println("PC WON");
                    System.out.printf("You: " + choice + "\nPC: " + bot+"\n");
                    pc++;
                }
            } else if (choice.equalsIgnoreCase(part[2])) {
                if(bot.equalsIgnoreCase(part[0])){
                    System.out.println("PC WON");
                    System.out.printf("You: " + choice + "\nPC: " + bot+"\n");
                    pc++;
                } else if (bot.equalsIgnoreCase(part[1])){
                    System.out.println("You WON");
                    System.out.printf("You: " + choice + "\nPC: " + bot+"\n");
                    you++;
                } else if (bot.equalsIgnoreCase(part[2])) {
                    System.out.println("Draw");
                    System.out.printf("You: " + choice + "\nPC: " + bot+"\n");
                }
            }
        }
        if (pc>you){
            System.out.println("-----------------");
            System.out.println("You lost to PC");
            System.out.println(you+":"+pc);
        }else {
            System.out.println("-----------------");
            System.out.println("You won against PC");
            System.out.println(you+":"+pc);
        }
    }
}
