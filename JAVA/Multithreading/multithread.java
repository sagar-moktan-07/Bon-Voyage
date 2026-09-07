package JAVA.Multithreading;

public class multithread {
    public static void main(String[] args){
        String str1 ="Fuck";
        String str2 = "You..";
        Thread thr1= new Thread(new Arunnable(str1));
        Thread thr3= new Thread(new Arunnable(str2));
        // Thread thr2= new Thread(new MyRunnable());
        System.out.println("Start...!!");
        thr3.start();
        thr1.start();
        try {
            thr1.join();
            thr3.join();
        }
        catch (InterruptedException e){
            System.out.println(e + "error occured..");
        }
        // thr2.start();
        System.out.println("End...!");
        }
}
