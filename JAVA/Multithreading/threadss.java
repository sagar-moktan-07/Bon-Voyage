package JAVA.Multithreading;
import java.util.Scanner;


public class threadss {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        MyRunnable myrun = new MyRunnable();
        Thread thread = new Thread(myrun);
        thread.setDaemon(true);
        thread.start();

        System.out.println("Whats your name?(enter in 5sec): ");
        String name = scanner.nextLine();
        System.out.println("Your name is "+ name);
        scanner.close();
    }
}
