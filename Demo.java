import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computer = (int)(Math.random()*100+1);
        int attempt = 5;
        while (true){
            if(attempt==0)break;
            System.out.println("Guess number between 1 to 100\n" +
                    "attempt left "+ attempt);
            int user = sc.nextInt();
            if(computer == user){
                System.out.println("Congrats");
                System.exit(0);
            }else if(user>computer) System.out.println("too high , try again");
            else System.out.println("too low , try again");
            attempt--;
        }


    }
}
