import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        // Print message to the console
        Scanner sc = new Scanner(System.in);
        int anyNumber = (int)(Math.random()*100);
        int userName = 0;
        do{
            System.out.println("Guess my number:");
            userName = sc.nextInt();

            if(userName == anyNumber){
                System.out.println("WOOHOO..CORRECT ANSWER!!");
            }
            else if(userName>anyNumber){
                System.out.println("Your number is too large");
            }
            else {
                System.out.println("Your number is too small");
        }
        }
        while(userName>=0);
        System.out.println("My number was");
        System.out.println(anyNumber);
    }
}
