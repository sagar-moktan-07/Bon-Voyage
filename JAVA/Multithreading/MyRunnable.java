package JAVA.Multithreading;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i <=5; i++){
            try{
                // System.out.println("Sleeping 1 sec now...");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " running..1" + i);
                // System.out.println("Fuck I woke up...");
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted...");
            }
            // if(i == 5){
            //     System.out.println("times up brother...");
            //     System.exit(0);
            // }
        }
        System.exit(0);
    }
}
